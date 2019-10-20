package com.tramway.windows;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Windows extends javax.swing.JFrame {
	public PathPanelForm Panel=new PathPanelForm();

    int xmouse, ymouse, x, y;

    public Windows() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/lb/images/train.png")));
        initComponents();
        aboutIconMouseClicked(null);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AtlasPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pathPanel = new javax.swing.JPanel();
        pathIcon = new javax.swing.JLabel();
        aboutPanel = new javax.swing.JPanel();
        aboutIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AtlasPanel.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(AtlasPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 850, 490));

        jPanel2.setBackground(new java.awt.Color(63, 61, 61));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Quicksand", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 153));
        jLabel1.setText("TramWay");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 0, -1, 56));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lb/images/Delete_25px_2.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 0, 30, 60));

        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lb/images/Logout Rounded Down_25px_4.png"))); // NOI18N
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minMouseExited(evt);
            }
        });
        jPanel2.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, -1, 60));

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lb/images/Circled User Male_25px_2.png"))); // NOI18N
        jPanel2.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 0, 30, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 60));

        jPanel3.setBackground(new java.awt.Color(84, 80, 80));

        pathPanel.setBackground(new java.awt.Color(84, 80, 80));

        pathIcon.setBackground(new java.awt.Color(84, 80, 80));
        pathIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pathIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lb/images/Map Marker_50px_4.png"))); // NOI18N
        pathIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pathIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pathIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pathIconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pathPanelLayout = new javax.swing.GroupLayout(pathPanel);
        pathPanel.setLayout(pathPanelLayout);
        pathPanelLayout.setHorizontalGroup(
            pathPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pathIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pathPanelLayout.setVerticalGroup(
            pathPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pathIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );

        aboutPanel.setBackground(new java.awt.Color(84, 80, 80));

        aboutIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aboutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lb/images/Info_50px_2.png"))); // NOI18N
        aboutIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutIconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout aboutPanelLayout = new javax.swing.GroupLayout(aboutPanel);
        aboutPanel.setLayout(aboutPanelLayout);
        aboutPanelLayout.setHorizontalGroup(
            aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aboutIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        aboutPanelLayout.setVerticalGroup(
            aboutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aboutIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pathPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(aboutPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(pathPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 274, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 100, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lb/images/Delete_25px_1.png")));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        // TODO add your handling code here:

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lb/images/Delete_25px_2.png")));
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseEntered
        // TODO add your handling code here:
        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lb/images/Logout Rounded Down_25px_6.png")));
    }//GEN-LAST:event_minMouseEntered

    private void minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseExited
        // TODO add your handling code here:
        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lb/images/Logout Rounded Down_25px_4.png")));
    }//GEN-LAST:event_minMouseExited

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        x = evt.getXOnScreen();
        y = evt.getYOnScreen();
        this.setLocation(x - xmouse, y - ymouse);
        this.setOpacity(0.9f);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased
        // TODO add your handling code here:
        this.setOpacity(1.0f);
    }//GEN-LAST:event_jPanel2MouseReleased

    private void pathIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pathIconMouseEntered
        // TODO add your handling code here:
        pathPanel.setBackground(new Color(0, 153, 102));
    }//GEN-LAST:event_pathIconMouseEntered

    private void aboutIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutIconMouseEntered
        // TODO add your handling code here:
        aboutPanel.setBackground(new Color(0, 153, 102));
    }//GEN-LAST:event_aboutIconMouseEntered

    private void pathIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pathIconMouseExited
        // TODO add your handling code here:
        pathPanel.setBackground(new Color(84, 80, 80));
    }//GEN-LAST:event_pathIconMouseExited

    private void aboutIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutIconMouseExited
        // TODO add your handling code here:
        aboutPanel.setBackground(new Color(84, 80, 80));
    }//GEN-LAST:event_aboutIconMouseExited

    private void pathIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pathIconMouseClicked
        // TODO add your handling code here:
        AtlasPanel.removeAll();
        AtlasPanel.add(Panel);
        AtlasPanel.repaint();
        AtlasPanel.revalidate();
        pathIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lb/images/Map Marker_50px_6.png")));
        aboutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lb/images/Info_50px_2.png")));

        pathPanel.setBackground(new Color(0, 153, 102));
        aboutPanel.setBackground(new Color(84, 80, 80));

    }//GEN-LAST:event_pathIconMouseClicked

    private void aboutIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutIconMouseClicked

        AtlasPanel.removeAll();
        AtlasPanel.add(new AboutPanelForm());
        AtlasPanel.repaint();
        AtlasPanel.revalidate();

        pathIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lb/images/Map Marker_50px_4.png")));
        aboutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lb/images/Info_50px_3.png")));

        pathPanel.setBackground(new Color(84, 80, 80));
        aboutPanel.setBackground(new Color(0, 153, 102));
    }//GEN-LAST:event_aboutIconMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windowsd".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Windows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AtlasPanel;
    private javax.swing.JLabel aboutIcon;
    private javax.swing.JPanel aboutPanel;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel min;
    private javax.swing.JLabel pathIcon;
    private javax.swing.JPanel pathPanel;
    private javax.swing.JLabel profile;
    // End of variables declaration//GEN-END:variables
}
