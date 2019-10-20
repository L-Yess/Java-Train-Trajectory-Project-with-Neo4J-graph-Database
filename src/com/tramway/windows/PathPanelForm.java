package com.tramway.windows;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

import com.tramway.dao.mapDao;
import com.tramway.model.Gare;

public class PathPanelForm extends javax.swing.JPanel {

    private String distanceVar;
    private String timeVar;
    private String arrivalTimeVar;
    private String[] fromList;
    private String[] toList;
    private mapDao dao;
    public Map MAP = new Map();
    
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
    	System.out.println("clicked!");
    	String from=fromCombo.getItemAt(fromCombo.getSelectedIndex());
    	String to=toCombo.getItemAt(toCombo.getSelectedIndex());
    	
    	Long dist = this.dao.distance(from, to);
    	Double t = this.dao.time(from, to);
    	System.out.println("distance="+dist);
    	System.out.println("time="+t);
    	this.distance.setText(dist.toString());
    	this.time.setText(t.toString());
    	this.distance.repaint();
    	this.time.repaint();
    	
    }   
    
    public void setFromList(String [] fromTab) {
    	this.fromList=fromTab;
    	fromCombo.setModel(new javax.swing.DefaultComboBoxModel<>(fromList));
    	fromCombo.repaint();
    	fromCombo.revalidate();
    }
    
    public void setDAO(mapDao dao) {
    	this.dao=dao;
    }
    

    public PathPanelForm() {
        this.fromList = new String[]{""};
        this.toList = new String[]{"a","n"};

        initComponents();
        this.distance.setText(distanceVar);
        this.time.setText(timeVar);
        this.arrivalTime.setText(this.arrivalTimeVar);
        this.mapContainer.setLayout(new FlowLayout(0, 0, 0));
        this.mapContainer.add(this.MAP);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MapPanel = new javax.swing.JPanel();
        mapContainer = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fromCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        toCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        distance = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        arrivalTime = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(840, 480));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MapPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mapContainer.setBackground(new java.awt.Color(255, 255, 255));
        MapPanel.add(mapContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 460));

        add(MapPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 570, 460));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("LOCATION");

        fromCombo.setBackground(new java.awt.Color(0, 153, 102));
        fromCombo.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        fromCombo.setForeground(new java.awt.Color(255, 255, 255));
        fromCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ""}));
        fromCombo.setAutoscrolls(true);
        fromCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fromCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fromCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromComboActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("From :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("To   :");

        toCombo.setBackground(new java.awt.Color(0, 153, 102));
        toCombo.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        toCombo.setForeground(new java.awt.Color(255, 255, 255));
        toCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ""}));
        toCombo.setAutoscrolls(true);
        toCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        toCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toComboActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("INFO");

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Quicksand", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Start");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("");

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 102));
        jLabel9.setText("Km");

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 102));
        jLabel10.setText("min");

        distance.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        distance.setForeground(new java.awt.Color(0, 153, 102));
        distance.setText("20");

        time.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        time.setForeground(new java.awt.Color(0, 153, 102));
        time.setText("30");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("TIME");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("DISTANCE");

        arrivalTime.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        arrivalTime.setForeground(new java.awt.Color(0, 153, 102));
        arrivalTime.setText("7 h25min");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fromCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(toCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                        .addComponent(jLabel12)
                                                        .addGap(28, 28, 28))
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(46, 46, 46)))
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(distance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addComponent(arrivalTime, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(time)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(toCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(distance, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        jPanel1.setBackground(new java.awt.Color(5, 194, 131));
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        // TODO add your handling code here:
        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
    }//GEN-LAST:event_jPanel1MouseExited

    private void fromComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromComboActionPerformed
        //
        //      Action listener for from
    	
    	this.toList=this.dao.getToList(fromCombo.getItemAt(fromCombo.getSelectedIndex()));
    	toCombo.setModel(new javax.swing.DefaultComboBoxModel<>(this.toList));
    	
    	
        ArrayList<Point> liste = new ArrayList<Point>();
        
        //this.dao.getGare(gareName, stationName)
        String station=fromCombo.getItemAt(fromCombo.getSelectedIndex());
        Gare g1 = this.dao.getGare(station, this.dao.getGareLigne(station));
        
        liste.add(new Point(  g1.getX(), g1.getY()));

        this.MAP.setNodes(liste);
        this.MAP.repaint();
        this.mapContainer.repaint();
    }//GEN-LAST:event_fromComboActionPerformed

    private void toComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toComboActionPerformed
        //
        //      Action listener for To
        //
    	
    		ArrayList<Point> liste = new ArrayList<Point>();
    		String from =    fromCombo.getItemAt(fromCombo.getSelectedIndex());
    		String to   =    toCombo.getItemAt( toCombo.getSelectedIndex( ));
    		Gare j=dao.getGare(from, dao.getGareLigne(from));
    		//liste.add(new Point(  j.getX(), j.getY()));
    		
    		//System.out.println("selected index="+from);
    		System.out.println("from="+from);
    		System.out.println("to="+to);
	        //this.dao.getGare(gareName, stationName)
	        
	        ArrayList<Gare> GListe = this.dao.getPath(from, to);
	        
	        System.out.println("\n\n ====");
	        for (Gare g: GListe) {
	        	System.out.println("----"+ g.getName());
	        }
	        for (Gare g: GListe) {
	        	liste.add(new Point(  g.getX(), g.getY()));
			}
	        
	        
	        this.MAP.setNodes(liste);
	        this.MAP.repaint();
	        this.mapContainer.repaint();
	        
	        

    }//GEN-LAST:event_toComboActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MapPanel;
    private javax.swing.JLabel arrivalTime;
    private javax.swing.JLabel distance;
    private javax.swing.JComboBox<String> fromCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel mapContainer;
    private javax.swing.JLabel time;
    private javax.swing.JComboBox<String> toCombo;
    // End of variables declaration//GEN-END:variables
}
