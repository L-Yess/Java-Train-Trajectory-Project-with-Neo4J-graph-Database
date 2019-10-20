package Neo4j.Neo4j;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

import com.tramway.dao.mapDao;
import com.tramway.model.Gare;
import com.tramway.windows.Loading;
import com.tramway.windows.Point;
import com.tramway.model.Trajet;
import com.tramway.windows.Windows;

/**
 * Hello world!
 *
 */
public class App {
	
	
	public enum NodeType implements Label {
		Gare;
	}
	
	public static void main(String[] args) {
		
		System.out.println("SPLASH");
		JFrame loading = new Loading();
		loading.setVisible(true);
		
		mapDao metier = new mapDao();
		System.out.println("dao.... done");
		metier.distance("lhay lmohammadi", "ain sbaa");
    	metier.time("lhay lmohammadi", "ain sbaa");
		
		ArrayList<com.tramway.windows.Point> PListe1 = new ArrayList<Point>();
		ArrayList<com.tramway.windows.Point> PListe2 = new ArrayList<Point>();
		
		for (Gare g : metier.station1) {
			PListe1.add( new Point(g.getX(), g.getY()) );
		}
		for (Gare g : metier.station2) {
			PListe2.add( new Point(g.getX(), g.getY()) );
		}
		Windows mainWindow = new Windows();
		
		
		mainWindow.Panel.MAP.setPoints1(PListe1);
		mainWindow.Panel.MAP.setPoints2(PListe2);
		mainWindow.Panel.setDAO(metier);
		ArrayList list1 = metier.station1;
		ArrayList list2 = metier.station2;
		
		
		mainWindow.Panel.setFromList(metier.toTableTwoLists(list1, list2));
		System.out.println("visible");
		loading.setVisible(false);loading.dispose();
		mainWindow.setVisible(true);
	
		
		

		}
}
