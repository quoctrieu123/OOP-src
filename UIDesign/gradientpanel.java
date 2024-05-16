/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javausertable;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author User
 */
public class gradientpanel extends javax.swing.JFrame {

    public int width= 766;
    public int height= 50;
    public gradientpanel() {
        initComponents();
        
        JButton[] btns = {homebutton,aboutbutton,creatorbutton};
       
        for (JButton btn : btns)
        {
            btn.setBackground(new Color(21,25,28));
            btn.setUI(new BasicButtonUI());
            
            btn.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent e) {
                    
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setForeground(new Color(153,153,153));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setForeground(new Color(255,255,255));
                    
                     
                }
            });
        }
    }
    public void showform(Component comp)
    {
        this.jPanel2.removeAll();
        this.jPanel2.add(comp);
        this.jPanel2.repaint();
        this.revalidate();
    }
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        homebutton = new javax.swing.JButton();
        aboutbutton = new javax.swing.JButton();
        creatorbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setForeground(new java.awt.Color(204, 153, 0));
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 51, 51));
        kGradientPanel1.setkGradientFocus(100);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 51, 51));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        kGradientPanel1.setLayout(new java.awt.BorderLayout());

        kGradientPanel5.setBackground(new java.awt.Color(21, 25, 28));
        kGradientPanel5.setkEndColor(new java.awt.Color(21, 25, 28));
        kGradientPanel5.setkGradientFocus(100);
        kGradientPanel5.setkStartColor(new java.awt.Color(21, 25, 28));
        kGradientPanel5.setkTransparentControls(false);
        kGradientPanel5.setPreferredSize(new java.awt.Dimension(766, 50));
        kGradientPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 35, 5));

        jPanel6.setBackground(new java.awt.Color(21, 25, 28));
        jPanel6.setPreferredSize(new java.awt.Dimension(170, 50));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(21, 25, 28));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javausertable/icon/News.png"))); // NOI18N
        jPanel6.add(jLabel1, java.awt.BorderLayout.CENTER);

        kGradientPanel5.add(jPanel6);

        homebutton.setBackground(new java.awt.Color(21, 25, 28));
        homebutton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        homebutton.setForeground(new java.awt.Color(255, 255, 255));
        homebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javausertable/icon/Home_6.png"))); // NOI18N
        homebutton.setText("Home");
        homebutton.setBorder(null);
        buttonGroup1.add(homebutton);
        homebutton.setPreferredSize(new java.awt.Dimension(100, 50));
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });
        kGradientPanel5.add(homebutton);

        aboutbutton.setBackground(new java.awt.Color(21, 25, 28));
        aboutbutton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        aboutbutton.setForeground(new java.awt.Color(255, 255, 255));
        aboutbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javausertable/icon/Information_3.png"))); // NOI18N
        aboutbutton.setText("About us");
        aboutbutton.setBorder(null);
        buttonGroup1.add(aboutbutton);
        aboutbutton.setPreferredSize(new java.awt.Dimension(100, 50));
        aboutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutbuttonActionPerformed(evt);
            }
        });
        kGradientPanel5.add(aboutbutton);

        creatorbutton.setBackground(new java.awt.Color(21, 25, 28));
        creatorbutton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        creatorbutton.setForeground(new java.awt.Color(255, 255, 255));
        creatorbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javausertable/icon/News_1.png"))); // NOI18N
        creatorbutton.setText("Recent News");
        creatorbutton.setBorder(null);
        buttonGroup1.add(creatorbutton);
        creatorbutton.setPreferredSize(new java.awt.Dimension(120, 50));
        creatorbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creatorbuttonActionPerformed(evt);
            }
        });
        kGradientPanel5.add(creatorbutton);

        kGradientPanel1.add(kGradientPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(30, 40, 44));
        kGradientPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutbuttonActionPerformed
        showform(new AboutUsPanel());
    }//GEN-LAST:event_aboutbuttonActionPerformed

    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        showform(new searchPanel());
    }//GEN-LAST:event_homebuttonActionPerformed

    private void creatorbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creatorbuttonActionPerformed
        showform(new recentnews(new getrecent().printserver("All")));
    }//GEN-LAST:event_creatorbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gradientpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gradientpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gradientpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gradientpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gradientpanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutbutton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton creatorbutton;
    private javax.swing.JButton homebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel5;
    // End of variables declaration//GEN-END:variables
}