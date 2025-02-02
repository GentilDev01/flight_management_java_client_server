/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Component;
import java.awt.Window;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import model.Ticket;

/**
 *
 * @author ingab
 */
public class AdminPage extends javax.swing.JFrame {
    
 DefaultTableModel tableModel = new DefaultTableModel();
    /**
     * Creates new form AdminPage
     */
    public AdminPage() {
        initComponents();
        jDesktopPane.removeAll();
        WelcomePage welcome = new WelcomePage();
        jDesktopPane.add(welcome).setVisible(true);
    
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        AdminConfPanel = new javax.swing.JPanel();
        regEmpBtn = new javax.swing.JButton();
        RegCusBtn = new javax.swing.JButton();
        CreateFlightBtn = new javax.swing.JButton();
        BookTicketBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDesktopPane = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(0, 102, 102));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminConfPanel.setBackground(new java.awt.Color(0, 102, 102));
        AdminConfPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        AdminConfPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regEmpBtn.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        regEmpBtn.setForeground(new java.awt.Color(0, 0, 204));
        regEmpBtn.setText("Register Employee");
        regEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEmpBtnActionPerformed(evt);
            }
        });
        AdminConfPanel.add(regEmpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 170, 60));

        RegCusBtn.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        RegCusBtn.setForeground(new java.awt.Color(0, 0, 204));
        RegCusBtn.setText("Register Customer");
        RegCusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegCusBtnActionPerformed(evt);
            }
        });
        AdminConfPanel.add(RegCusBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 50));

        CreateFlightBtn.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        CreateFlightBtn.setForeground(new java.awt.Color(0, 0, 204));
        CreateFlightBtn.setText("Create Flight");
        CreateFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateFlightBtnActionPerformed(evt);
            }
        });
        AdminConfPanel.add(CreateFlightBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 170, 60));

        BookTicketBtn.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        BookTicketBtn.setForeground(new java.awt.Color(0, 0, 204));
        BookTicketBtn.setText("Book Ticket");
        BookTicketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookTicketBtnActionPerformed(evt);
            }
        });
        AdminConfPanel.add(BookTicketBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 170, 60));

        mainPanel.add(AdminConfPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 189, 530));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Transport Management System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/Icons/icons8-change-user-50.png"))); // NOI18N
        jLabel3.setText("Active");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/Icons/icons8-circle-40.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 40, 40));

        mainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 10, 1890, 150));

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1690, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );

        mainPanel.add(jDesktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 1690, 1060));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/Icons/icons8-exit-50 (1).png"))); // NOI18N
        jLabel2.setText("Exit");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        mainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 770, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1489, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 892, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEmpBtnActionPerformed

            EmployeeForm empMgt = new EmployeeForm();
            jDesktopPane.removeAll();
        jDesktopPane.repaint();
        jDesktopPane.revalidate();
        jDesktopPane.add(empMgt).setVisible(true);
    }//GEN-LAST:event_regEmpBtnActionPerformed

    private void RegCusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegCusBtnActionPerformed
        // TODO add your handling code here:
        CustomerForm empMgt = new CustomerForm();
            jDesktopPane.removeAll();
        jDesktopPane.repaint();
        jDesktopPane.revalidate();
        jDesktopPane.add(empMgt).setVisible(true);
//        custIdtxt.setText(custdao.AutoCustomer_id());
        
        
    }//GEN-LAST:event_RegCusBtnActionPerformed

    private void CreateFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateFlightBtnActionPerformed
       
         FlightInfoForm empMgt = new FlightInfoForm();
            jDesktopPane.removeAll();
        jDesktopPane.repaint();
        jDesktopPane.revalidate();
        jDesktopPane.add(empMgt).setVisible(true);
        
       
    }//GEN-LAST:event_CreateFlightBtnActionPerformed

    private void BookTicketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookTicketBtnActionPerformed
        
        TicketForm ticketMgt = new TicketForm();
            jDesktopPane.removeAll();
            jDesktopPane.removeAll();
        jDesktopPane.repaint();
        jDesktopPane.revalidate();
        jDesktopPane.add(ticketMgt).setVisible(true);
        
    }//GEN-LAST:event_BookTicketBtnActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        // TODO add your handling code here:
      int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);

    // Check the user's response
    if (response == JOptionPane.YES_OPTION) {
        // If the user clicked "Yes", open the login page
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);

        // Optionally, close the current window
        Component source = (Component) evt.getSource();
        Window currentWindow = SwingUtilities.getWindowAncestor(source);
        if (currentWindow != null) {
            currentWindow.dispose();
        }
    }
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminConfPanel;
    private javax.swing.JButton BookTicketBtn;
    private javax.swing.JButton CreateFlightBtn;
    private javax.swing.JButton RegCusBtn;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton regEmpBtn;
    // End of variables declaration//GEN-END:variables
}
