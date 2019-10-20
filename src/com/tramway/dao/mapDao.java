package com.tramway.dao;

import java.io.File;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

import com.tramway.model.Gare;
import com.tramway.model.Trajet;



public class mapDao {
	
	public static String PATH="C:\\Users\\L-Yes\\Desktop\\neo4j-community-3.3.5\\data\\databases\\graph.db";
	public ArrayList<Gare> station1;
	public ArrayList<Gare> station2;
	//static String PATH =  "C:\\Users\\Youssef\\.Neo4jDesktop\\neo4jDatabases\\database-771ad9f1-3c29-4b2f-9a6b-117edbe0b465\\installation-3.3.5\\data\\databases\\graph.db";
	static GraphDatabaseFactory dbFactory = new GraphDatabaseFactory();
	static GraphDatabaseService dbService=dbFactory.newEmbeddedDatabase(new File(PATH));
	public enum NodeType implements Label {
		Station1,Station2;
	}
	public enum RelationType implements RelationshipType {
		back,go;
	}
	
	public mapDao() {
		this.station1=getGares("Station1");
		this.station2=getGares("Station2");
		
	}
	
	public double time(String from,String to) {
		Result result = dbService.execute("MATCH p=(n{name:\""+from+"\"})-[r:go*..]-(m{name:\""+to+"\"}) return reduce(s=0,x IN extract(n IN r |n.timeBetween)| s+x) as timeBetween;");
		//double time=(double) result.columnAs("timeBetween").next();
		double time=(new Double(result.columnAs("timeBetween").next().toString())).doubleValue();
		
		return time;
	}
	
	public String[] getFirstandLast(String from, String to) {
		String [] tuple = new String [2];
		ArrayList<Gare> stations = (this.getGareLigne(from).equalsIgnoreCase("Station1"))? this.station1:this.station2;
		int i=0;
		for (Gare g:stations) {
			if(g.getName().equalsIgnoreCase(from) || g.getName().equalsIgnoreCase(to)) {
				tuple[i]=g.getName();
				i++;
			}
		}
		return tuple;
	}
	public  ArrayList<Gare> getPath(String from, String to){
		
		ArrayList<Gare> GListe=new ArrayList<Gare>();
		
		ArrayList<Gare> stations = (this.getGareLigne(from).equalsIgnoreCase("Station1"))? this.station1:this.station2;
		String [] tuple = new String [2];
		int i=0;
		for (Gare g:stations) {
			if(g.getName().equalsIgnoreCase(from) || g.getName().equalsIgnoreCase(to)) {
				tuple[i]=g.getName();
				i++;
			}
		}
		
		boolean headFound=false;
		
		for (Gare g: stations) {
			
			if(g.getName().equalsIgnoreCase(tuple[0])) {
				headFound=true;
			}
			if(g.getName().equalsIgnoreCase(tuple[1])) {
				GListe.add(g);
				break;
			}
			
			if (headFound) {
				GListe.add(g);
			}
			
		}
		
		
		return GListe;
		
	}
	
	public long distance(String from,String to) {
		


		Result result = dbService.execute("MATCH p=(n{name:\""+from+"\"})-[r:go*..]-(m{name:\""+to+"\"}) return reduce(s=0,x IN extract(n IN r |n.distance)| s+x) as distance;");
		
		long distance= (long) result.columnAs("distance").next();
		
		return distance;
      
		 
	}
	
	
	public String [] getToList(String from) {
		ArrayList<Gare> stations=null;
		for(Gare g : station1) {
			if (g.getName().equalsIgnoreCase(from)) {
				stations=station1;
				break;
			}
		}
		if(stations==null) stations=station2;
		String [] toList = new String[stations.size()-1];
		int i=0;
		for(Gare g:stations) {
			if(g.getName().equalsIgnoreCase(from)) continue;
			toList[i]=g.getName();
			i++;
		}
		
		
		return toList;
	}
	

	public String getGareLigne(String gareName) {
		
		for (Gare g: this.station1) {
			if (g.getName().equalsIgnoreCase(gareName))
				return "Station1";
		}
		return "Station2";
		
	}

	public Gare getGare(String gareName, String stationName) {
		
		if (stationName.equals("Station1")){
			for (Gare g:station1) {
				if(g.getName().equals(gareName)) {
					return g;
				}
			}
		} else {
			for (Gare g:station2) {
				if(g.getName().equals(gareName)) {
					return g;
				}
			}
		}
		
		
		
		for (Gare g:getGares(stationName)) {
			if(g.getName().equals(gareName)) {
				return g;
			}
		}
		return null;
	}
	public int findTrajet(List<Trajet> list, Trajet t) {
		int i=0;
		while (i<list.size()) {
			if(list.get(i).equals(t)) {
				return i;
			}
			i++;
		}
		return 0;
		
	}
	
	
	
	public ArrayList<Gare> getGares(String stationName){
		ArrayList<Gare> gareNodes = new ArrayList<Gare>();
		//String PATH =  "C:\\Users\\Youssef\\.Neo4jDesktop\\neo4jDatabases\\database-771ad9f1-3c29-4b2f-9a6b-117edbe0b465\\installation-3.3.5\\data\\databases\\graph.db";
//		GraphDatabaseFactory dbFactory = new GraphDatabaseFactory();
//		GraphDatabaseService dbService=dbFactory.newEmbeddedDatabase(new File(PATH));
		Label label = Label.label(stationName);

		try 
		{
			Transaction tx = dbService.beginTx();
			try
			{
				ResourceIterator<Node> users =dbService.findNodes(label);

				while ( users.hasNext() )	{
					Node node = users.next();
					long x=(long)(node.getProperty("x"));
					long y=(long)(node.getProperty("y"));

					Gare g = new Gare((String)node.getProperty("name"), (int) (x), (int)(y));
					gareNodes.add( g );
				}
				tx.success();
				tx.close();

			}
			catch(Exception e) {System.out.println(e.getMessage());}
		} catch(Exception e) {System.out.println(e.getMessage());}
//		dbService.shutdown();
		return gareNodes;
	}

	public String [] toTable(java.util.ArrayList<Gare> liste) {
		String [] tab=new String[liste.size()];
		int i=0;
		for (Gare g : liste) {
			tab[i]=g.getName();
			i++;
		}
		return tab;
	}
	public String [] toTableTwoLists(java.util.ArrayList<Gare> list1,java.util.ArrayList<Gare> list2) {
		String [] tab=new String[list1.size()+list2.size()];
		int i=0;
		for (Gare g : list1) {
			tab[i]=g.getName();
			i++;
		}
		for (Gare g : list2) {
			tab[i]=g.getName();
			i++;
		}
		return tab;
	}
	
	
	public List<List<Trajet>> getAllTrajet(){
		
//		GraphDatabaseFactory dbFactory = new GraphDatabaseFactory();
//		GraphDatabaseService dbService=dbFactory.newEmbeddedDatabase(new File(PATH));

		List<Trajet> station1=new ArrayList<Trajet>();
		List<Trajet> station2=new ArrayList<Trajet>();
		List<List<Trajet>> trajets=new ArrayList<List<Trajet>>();
		try 
		{
			Transaction tx = dbService.beginTx();
			try
			{

				Iterable<Relationship> rels=dbService.getAllRelationships();
				for (Relationship rel: rels )
				{	
					String from=(String) rel.getStartNode().getProperty("name");
					String to=(String) rel.getEndNode().getProperty("name");
					long distance=(long) rel.getProperty("distance");
					double time=(new Double(rel.getProperty("timeBetween").toString())).doubleValue();
					String stationName=rel.getStartNode().getLabels().iterator().next().toString();
					Trajet t=new Trajet(from, to, (int)distance, time);

					if(stationName.equals("Station1")) {
						station1.add(t);
					}
					if(stationName.equals("Station2")) {
						station2.add(t);
					}
				} 

			}catch(Exception e) {System.out.println(e.getMessage());
			e.printStackTrace();}
		} catch(Exception e) {System.out.println(e.getMessage());}
		
		trajets.add(station1);
		trajets.add(station2);

//		dbService.shutdown();
		return trajets;
	}
}


