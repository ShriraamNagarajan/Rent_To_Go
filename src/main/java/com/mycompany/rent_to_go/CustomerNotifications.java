/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rent_to_go;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class CustomerNotifications extends javax.swing.JFrame {
    Customer customer;

    /**
     * Creates new form CustomerNotifications
     */
    public CustomerNotifications() {
        initComponents();
    }
    
    public CustomerNotifications(Customer customer) throws IOException {
        this.customer = customer;
        initComponents();
        this.getContentPane().setBackground(new Color(228,231,242));
        ImageIcon image = new ImageIcon("./src/main/java/com/mycompany/rent_to_go/Pictures/rsz_renttogologo.jpg");
        lblLogo.setIcon(image);
        lblLogo.setText("");

        addNotifications(Notification.getCustomerNotifications(customer));
        
    }
    
    
    public void addNotifications(ArrayList<Notification> notificationList){
        int notificationLength = notificationList.size();
        if(notificationLength==0){
            backPanel.setLayout(new GridLayout(2, 1, 3, 3));
            backPanel.removeAll();
            NoResults resultPanel = new NoResults();
            backPanel.add(resultPanel);
            backPanel.validate();
        }
        else{
            
            if(notificationLength<4){
                notificationLength = 4;
            }
            backPanel.setLayout(new GridLayout(notificationLength, 1, 3, 3));
            backPanel.removeAll();
            NotificationResult resultPane1;
            for(int i=notificationList.size()-1; i>=0; i--){
                Notification notification = notificationList.get(i);
                resultPane1 = new NotificationResult(notification);
                backPanel.add(resultPane1);
            
            }
            backPanel.validate();
        }
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        lblMyBookings = new javax.swing.JLabel();
        lblNotifications = new javax.swing.JLabel();
        lblExplore = new javax.swing.JLabel();
        lblProfile = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        backPanel = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLogo.setText("jLabel2");

        lblMyBookings.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblMyBookings.setForeground(new java.awt.Color(0, 0, 102));
        lblMyBookings.setText("MyBookings");
        lblMyBookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblMyBookingsMouseReleased(evt);
            }
        });

        lblNotifications.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblNotifications.setForeground(new java.awt.Color(0, 0, 102));
        lblNotifications.setText("Notifications");
        lblNotifications.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblNotificationsMouseReleased(evt);
            }
        });

        lblExplore.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblExplore.setForeground(new java.awt.Color(0, 0, 102));
        lblExplore.setText("Explore");
        lblExplore.addMouseListener(new java.awt.event.MouseAdapter() {
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

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 783, Short.MAX_VALUE)
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(backPanel);

        btnLogOut.setBackground(new java.awt.Color(240, 240, 192));
        btnLogOut.setForeground(new java.awt.Color(0, 0, 102));
        btnLogOut.setText("Logout");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblExplore)
                        .addGap(40, 40, 40)
                        .addComponent(lblProfile)
                        .addGap(42, 42, 42)
                        .addComponent(lblMyBookings)
                        .addGap(30, 30, 30)
                        .addComponent(lblNotifications)
                        .addGap(59, 59, 59)
                        .addComponent(btnLogOut)
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMyBookings)
                    .addComponent(lblNotifications)
                    .addComponent(lblProfile)
                    .addComponent(lblExplore)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogOut))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExploreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExploreMouseReleased
        // TODO add your handling code here:
        CustomerExplore mainPage = new CustomerExplore(customer);
        this.setVisible(false);
        mainPage.setVisible(true);
    }//GEN-LAST:event_lblExploreMouseReleased

    private void lblProfileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProfileMouseReleased
        // TODO add your handling code here:
        CustomerProfile profilePage = new CustomerProfile(customer);
        this.setVisible(false);
        profilePage.setVisible(true);
    }//GEN-LAST:event_lblProfileMouseReleased

    private void lblMyBookingsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMyBookingsMouseReleased
        // TODO add your handling code here:
                CustomerBooking bookingPage;
        try {
            bookingPage = new CustomerBooking(customer);
            this.setVisible(false);
            bookingPage.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(CustomerExploreProductCheckout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblMyBookingsMouseReleased

    private void lblNotificationsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotificationsMouseReleased
        // TODO add your handling code here:
        CustomerNotifications notificationPage;
        try {
            notificationPage = new CustomerNotifications(customer);
            notificationPage.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(CustomerExploreProductCheckout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblNotificationsMouseReleased

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        loginPage lg = new loginPage();
        lg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerNotifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerNotifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerNotifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerNotifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerNotifications().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExplore;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMyBookings;
    private javax.swing.JLabel lblNotifications;
    private javax.swing.JLabel lblProfile;
    // End of variables declaration//GEN-END:variables
}
