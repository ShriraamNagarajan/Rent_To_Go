/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rent_to_go;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class CustomerPaymentReceipt extends javax.swing.JFrame {
    Customer customer;
   
    /**
     * Creates new form CustomerPaymentReceipt
     */
    public CustomerPaymentReceipt() {
        initComponents();
        this.getContentPane().setBackground(new Color(228,231,242));
        ImageIcon image = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_renttogologo.jpg");
        lblLogo.setIcon(image);
        lblLogo.setText("");
    
    }
    
    public CustomerPaymentReceipt(CarBooking booking){
    
        this.customer = booking.getCustomer();
        initComponents();
        this.getContentPane().setBackground(new Color(228,231,242));
        ImageIcon image = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_renttogologo.jpg");
        lblLogo.setIcon(image);
        lblLogo.setText("");
        PaymentReceipt pr = new PaymentReceipt(booking);
        backPanel.removeAll();
        backPanel.setLayout(new GridLayout(1, 1, 3, 3));
        backPanel.removeAll();
        backPanel.add(pr);
        backPanel.revalidate();
        this.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNotification = new javax.swing.JLabel();
        lblExplore = new javax.swing.JLabel();
        lblProfile = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblMyBookings = new javax.swing.JLabel();
        backPanel = new javax.swing.JPanel();
        lblProfile1 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNotification.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblNotification.setForeground(new java.awt.Color(0, 0, 102));
        lblNotification.setText("Notifications");
        lblNotification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblNotificationMouseReleased(evt);
            }
        });

        lblExplore.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblExplore.setForeground(new java.awt.Color(0, 0, 102));
        lblExplore.setText("Explore");
        lblExplore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExploreMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblExploreMouseReleased(evt);
            }
        });

        lblProfile.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblProfile.setForeground(new java.awt.Color(0, 0, 102));
        lblProfile.setText("Profile");
        lblProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblProfileMouseReleased(evt);
            }
        });

        lblLogo.setText("jLabel2");

        btnBack.setBackground(new java.awt.Color(240, 240, 192));
        btnBack.setForeground(new java.awt.Color(0, 0, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblMyBookings.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblMyBookings.setForeground(new java.awt.Color(0, 0, 102));
        lblMyBookings.setText("MyBookings");

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        lblProfile1.setFont(new java.awt.Font("STHupo", 0, 18)); // NOI18N
        lblProfile1.setText("Customer Payment Receipt");

        btnPrint.setBackground(new java.awt.Color(67, 136, 204));
        btnPrint.setForeground(new java.awt.Color(240, 240, 192));
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblExplore)
                        .addGap(40, 40, 40)
                        .addComponent(lblProfile)
                        .addGap(42, 42, 42)
                        .addComponent(lblMyBookings)
                        .addGap(30, 30, 30)
                        .addComponent(lblNotification)
                        .addGap(32, 32, 32)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblProfile1)
                                .addGap(437, 437, 437)
                                .addComponent(btnPrint)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMyBookings)
                    .addComponent(lblNotification)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProfile)
                    .addComponent(lblExplore)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblProfile1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnPrint)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNotificationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotificationMouseReleased
        
            // TODO add your handling code here:
            CustomerNotifications notificationPage;
        try {
            notificationPage = new CustomerNotifications(customer);
            notificationPage.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(CustomerPaymentReceipt.class.getName()).log(Level.SEVERE, null, ex);
        }
           
   
    }//GEN-LAST:event_lblNotificationMouseReleased

    private void lblExploreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExploreMouseReleased
        // TODO add your handling code here:
        CustomerExplore explorePage = new CustomerExplore(customer);
        explorePage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblExploreMouseReleased

    private void lblProfileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProfileMouseReleased
        // TODO add your handling code here:
        CustomerProfile profilePage = new CustomerProfile(customer);
        profilePage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblProfileMouseReleased

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CustomerBooking bookingPage;
        try {
            bookingPage = new CustomerBooking(customer);
            bookingPage.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(CustomerPaymentReceipt.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        printRecord(backPanel);

    }//GEN-LAST:event_btnPrintActionPerformed

    private void lblExploreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExploreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblExploreMouseClicked

    private void printRecord(JPanel panel){
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setJobName("Print Record");
        printerJob.setPrintable(new Printable(){
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex){
                if(pageIndex>0){
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D graphics2D = (Graphics2D) graphics;
                graphics2D.translate(pageFormat.getImageableX()*2, pageFormat.getImageableY()*2);
                graphics2D.scale(0.5, 0.5);
                panel.paint(graphics2D);
                
                return Printable.PAGE_EXISTS;
               
            }
          
        });
        
        boolean returningResult = printerJob.printDialog();
        if(returningResult){
            try {
                printerJob.print();
            } catch (PrinterException ex) {
                Logger.getLogger(CustomerPaymentReceipt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(CustomerPaymentReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerPaymentReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerPaymentReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerPaymentReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerPaymentReceipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel lblExplore;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMyBookings;
    private javax.swing.JLabel lblNotification;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JLabel lblProfile1;
    // End of variables declaration//GEN-END:variables
}
