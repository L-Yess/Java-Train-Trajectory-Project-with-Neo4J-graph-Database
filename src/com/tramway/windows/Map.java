/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tramway.windows;

import java.util.ArrayList;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

/**
 *
 * @author L-Yes
 */
public class Map extends javax.swing.JPanel {

	private ArrayList<Point> points1 = new ArrayList<Point>();
	private ArrayList<Point> points2 = new ArrayList<Point>();
    public ArrayList<Point> nodes = new ArrayList<Point>();

    public void setNodes(ArrayList<Point> nodes) {
        this.nodes = nodes;
    }
    public void setPoints1(ArrayList<Point> pListe) {
        this.points1 = pListe;
    }

    public void setPoints2(ArrayList<Point> pListe) {
        this.points2 = pListe;
    }

    public Map() {
    	this.points1 = new ArrayList<Point>();
    	this.points2 = new ArrayList<Point>();
    	this.nodes = new ArrayList<Point>();
    	
        initComponents();
    }

    protected void paintComponent(Graphics g) {

    	BufferedImage image = null;
    	BufferedImage red_pointer = null;
    	BufferedImage locator = null;
        BufferedImage node = null;
        BufferedImage background = null;
        try {
        	
        	image = ImageIO.read(new File(getClass().getResource("/lb/images/green_locator.png").getPath()));        	
        	locator = ImageIO.read(new File(getClass().getResource("/lb/images/locator.png").getPath()));
            node = ImageIO.read(new File(getClass().getResource("/lb/images/node.png").getPath()));
            background = ImageIO.read(new File(getClass().getResource("/lb/images/b.png").getPath()));
            red_pointer = ImageIO.read(new File(getClass().getResource("/lb/images/pointer.png").getPath()));
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        GeneralPath path;
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background, 0, 0, null);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(6f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        
        path = new GeneralPath();

        if (nodes.size() == 1) {
            g2d.drawImage(image, (int) (nodes.get(0).getX()) - 20, (int) (nodes.get(0).getY()) - 40, null);
        }
        if (nodes.size() >= 1) {
            g2d.drawImage(image, (int) (nodes.get(0).getX()) - 20, (int) (nodes.get(0).getY()) - 40, null);
        }

        if (points1.size() > 0) {
        	g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setStroke(new BasicStroke(6f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g2d.setColor(new Color(0, 0, 0, 100));
            path.moveTo((int) (this.points1.get(0).getX()), (int) (this.points1.get(0).getY()));
            
            Point lastPoint = points1.get(points1.size() - 1);
            for (Point p : points1) {

                path.lineTo(p.getX(), p.getY());
                g2d.drawImage(node, (int) (p.getX()) - 10, (int) (p.getY()) - 10, null);

                //System.out.println((p.getX()+" "+ p.getY()));
            }

            g2d.draw(path);

            g2d.setStroke(new BasicStroke(4));
            g2d.setColor(new Color(0,153, 102, 100));

            g2d.draw(path);
            for (Point p : points1) {

                g2d.drawImage(node, (int) (p.getX()) - 10, (int) (p.getY()) - 10, null);
            }
            if (image != null) {
                System.out.println((int) (lastPoint.getX()) + " , " + ((int) (lastPoint.getY())));
                g2d.drawImage(image, (int) (lastPoint.getX()) - 20, (int) (lastPoint.getY()) - 40, null);

            }
        }

        if (points2.size() > 0) {
       	 path = new GeneralPath();
       	Graphics2D g2= (Graphics2D) g;
       	g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
           g2.setStroke(new BasicStroke(6f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
           g2.setColor(new Color(0, 0, 0, 100));
           path.moveTo((int) (this.points2.get(0).getX()), (int) (this.points2.get(0).getY()));

           Point lastPoint = points2.get(points2.size() - 1);
           for (Point p : points2) {

               path.lineTo(p.getX(), p.getY());
               g2.drawImage(node, (int) (p.getX()) - 10, (int) (p.getY()) - 10, null);

           }

           g2.draw(path);

           g2.setStroke(new BasicStroke(4));
           g2.setColor(new Color(0, 102,153, 100));

           g2.draw(path);
           for (Point p : points2) {

               g2.drawImage(node, (int) (p.getX()) - 10, (int) (p.getY()) - 10, null);
           }
           if (image != null) {
               g2.drawImage(locator, (int) (lastPoint.getX()) - 20, (int) (lastPoint.getY()) - 40, null);

           }
       }
        if (nodes.size() > 0) {
       	 path = new GeneralPath();
       	Graphics2D g2= (Graphics2D) g;
       	g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
           g2.setStroke(new BasicStroke(6f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
           g2.setColor(new Color(0, 0, 0, 255));
           path.moveTo((int) (this.nodes.get(0).getX()), (int) (this.nodes.get(0).getY()));

           Point lastPoint = nodes.get(nodes.size() - 1);
           for (Point p : nodes) {

               path.lineTo(p.getX(), p.getY());

           }

           g2.draw(path);

           g2.setStroke(new BasicStroke(4));
           g2.setColor(new Color(255, 0,0, 255));

           g2.draw(path);
           for (Point p : nodes) {

               g2.drawImage(red_pointer, (int) (p.getX()) - 20, (int) (p.getY()) - 40, null);
           }
           
       }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
    }
}
