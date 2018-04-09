/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import View.AddCustomer;
import View.AddItem;
import View.DeleteCustomer;
import View.DeleteItem;
import View.LendingItem;
import View.SellItem;
import View.UpdateCustomer;
import View.UpdateItem;
import View.ViewCustomer;
import View.ViewItem;
import View.ViewLendDetail;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Isuru SanDamal
 */
public class mainGUI extends javax.swing.JFrame {

    /**
     * Creates new form mainGUI
     */
    public mainGUI() {
        initComponents();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
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
        jLabel1 = new javax.swing.JLabel();
        lendItem = new javax.swing.JButton();
        viewCustBut = new javax.swing.JButton();
        sellItem = new javax.swing.JButton();
        exitBut = new javax.swing.JButton();
        viewItemBut = new javax.swing.JButton();
        mainDesktopPane = new javax.swing.JDesktopPane();
        viewlendItemBut1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newMenuItem = new javax.swing.JMenu();
        addCustomerMenuItem = new javax.swing.JMenuItem();
        addItemMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        updateCustomerMenuItem = new javax.swing.JMenuItem();
        deleteCustomerMenuItem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        updateItemMenuItem = new javax.swing.JMenuItem();
        deleteItemMenuItem = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        viewAllCustomerMenuItem = new javax.swing.JMenuItem();
        viewAllItemMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel1.setBackground(new java.awt.Color(102, 0, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("        Pemasara Harware");
        jLabel1.setMaximumSize(new java.awt.Dimension(296, 42));
        jLabel1.setMinimumSize(new java.awt.Dimension(296, 42));

        lendItem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lendItem.setText("Lend Items");
        lendItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lendItemActionPerformed(evt);
            }
        });

        viewCustBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        viewCustBut.setText("View Customers");
        viewCustBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustButActionPerformed(evt);
            }
        });

        sellItem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sellItem.setText("Sell Items");
        sellItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellItemActionPerformed(evt);
            }
        });

        exitBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exitBut.setText("Exit");
        exitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButActionPerformed(evt);
            }
        });

        viewItemBut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        viewItemBut.setText("View Items");
        viewItemBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewItemButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainDesktopPaneLayout = new javax.swing.GroupLayout(mainDesktopPane);
        mainDesktopPane.setLayout(mainDesktopPaneLayout);
        mainDesktopPaneLayout.setHorizontalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
        mainDesktopPaneLayout.setVerticalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        viewlendItemBut1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        viewlendItemBut1.setText("View Lending Details");
        viewlendItemBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewlendItemBut1ActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        jMenu1.setText("File");

        newMenuItem.setText("New");

        addCustomerMenuItem.setText("Customer");
        addCustomerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerMenuItemActionPerformed(evt);
            }
        });
        newMenuItem.add(addCustomerMenuItem);

        addItemMenuItem.setText("Item");
        addItemMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemMenuItemActionPerformed(evt);
            }
        });
        newMenuItem.add(addItemMenuItem);

        jMenu1.add(newMenuItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenu3.setText("Customer");

        updateCustomerMenuItem.setText("Update");
        updateCustomerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustomerMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(updateCustomerMenuItem);

        deleteCustomerMenuItem.setText("Delete");
        deleteCustomerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(deleteCustomerMenuItem);

        jMenu2.add(jMenu3);

        jMenu4.setText("Item");

        updateItemMenuItem.setText("Update");
        updateItemMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(updateItemMenuItem);

        deleteItemMenuItem.setText("Delete");
        deleteItemMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(deleteItemMenuItem);

        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("View");

        viewAllCustomerMenuItem.setText("View All Customer");
        viewAllCustomerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllCustomerMenuItemActionPerformed(evt);
            }
        });
        jMenu5.add(viewAllCustomerMenuItem);

        viewAllItemMenuItem.setText("View All Item");
        viewAllItemMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllItemMenuItemActionPerformed(evt);
            }
        });
        jMenu5.add(viewAllItemMenuItem);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewCustBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewItemBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lendItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sellItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewlendItemBut1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainDesktopPane))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sellItem, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addComponent(lendItem, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addComponent(viewCustBut, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addComponent(viewItemBut, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewlendItemBut1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitBut, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addComponent(mainDesktopPane)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lendItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lendItemActionPerformed

        mainDesktopPane.removeAll();
        LendingItem l = new LendingItem();
        mainDesktopPane.add(l);
        centerJIF(l);
        mainDesktopPane.repaint();

    }//GEN-LAST:event_lendItemActionPerformed

    private void sellItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellItemActionPerformed

        mainDesktopPane.removeAll();
        SellItem si = new SellItem();
        mainDesktopPane.add(si);
        centerJIF(si);
        mainDesktopPane.repaint();
    }//GEN-LAST:event_sellItemActionPerformed

    private void viewCustButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustButActionPerformed
        mainDesktopPane.removeAll();
        ViewCustomer vc = new ViewCustomer();
        mainDesktopPane.add(vc);
        centerJIF(vc);
        mainDesktopPane.repaint();
    }//GEN-LAST:event_viewCustButActionPerformed

    private void viewItemButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewItemButActionPerformed
        mainDesktopPane.removeAll();
        ViewItem vi = new ViewItem();
        mainDesktopPane.add(vi);
        centerJIF(vi);
        mainDesktopPane.repaint();
    }//GEN-LAST:event_viewItemButActionPerformed

    private void exitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButActionPerformed
        int res = JOptionPane.showConfirmDialog(mainGUI.this, "Are you sure you want to exit ?", "Select Option", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            mainGUI.this.dispose();
        }
    }//GEN-LAST:event_exitButActionPerformed

    private void addCustomerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerMenuItemActionPerformed
        mainDesktopPane.removeAll();
        AddCustomer ac = new AddCustomer();
        mainDesktopPane.add(ac);
        centerJIF(ac);
        mainDesktopPane.repaint();
    }//GEN-LAST:event_addCustomerMenuItemActionPerformed

    private void addItemMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemMenuItemActionPerformed
        mainDesktopPane.removeAll();
        AddItem ai = new AddItem();
        mainDesktopPane.add(ai);
        centerJIF(ai);
        mainDesktopPane.repaint();
    }//GEN-LAST:event_addItemMenuItemActionPerformed

    private void viewAllCustomerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllCustomerMenuItemActionPerformed
        mainDesktopPane.removeAll();
        ViewCustomer vc = new ViewCustomer();
        mainDesktopPane.add(vc);
        centerJIF(vc);
        mainDesktopPane.repaint();
    }//GEN-LAST:event_viewAllCustomerMenuItemActionPerformed

    private void viewAllItemMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllItemMenuItemActionPerformed
        mainDesktopPane.removeAll();
        ViewItem vi = new ViewItem();
        mainDesktopPane.add(vi);
        centerJIF(vi);
        mainDesktopPane.repaint();
    }//GEN-LAST:event_viewAllItemMenuItemActionPerformed

    private void updateCustomerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCustomerMenuItemActionPerformed
        mainDesktopPane.removeAll();
        UpdateCustomer uc = new UpdateCustomer();
        mainDesktopPane.add(uc);
        centerJIF(uc);
        mainDesktopPane.repaint();
    }//GEN-LAST:event_updateCustomerMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        int res = JOptionPane.showConfirmDialog(mainGUI.this, "Do you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void updateItemMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemMenuItemActionPerformed
        mainDesktopPane.removeAll();
        UpdateItem ui = new UpdateItem();
        mainDesktopPane.add(ui);
        centerJIF(ui);
        mainDesktopPane.repaint();
    }//GEN-LAST:event_updateItemMenuItemActionPerformed

    private void deleteCustomerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerMenuItemActionPerformed
        mainDesktopPane.removeAll();
        DeleteCustomer dc = new DeleteCustomer();
        mainDesktopPane.add(dc);
        centerJIF(dc);
        mainDesktopPane.repaint();
    }//GEN-LAST:event_deleteCustomerMenuItemActionPerformed

    private void deleteItemMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemMenuItemActionPerformed
        mainDesktopPane.removeAll();
        DeleteItem di = new DeleteItem();
        mainDesktopPane.add(di);
        centerJIF(di);
        mainDesktopPane.repaint();
    }//GEN-LAST:event_deleteItemMenuItemActionPerformed

    private void viewlendItemBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewlendItemBut1ActionPerformed
        mainDesktopPane.removeAll();
        ViewLendDetail vld = new ViewLendDetail();
        mainDesktopPane.add(vld);
        centerJIF(vld);
        mainDesktopPane.repaint();
    }//GEN-LAST:event_viewlendItemBut1ActionPerformed

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
            java.util.logging.Logger.getLogger(mainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame mainFrame = new mainGUI();
                mainFrame.setVisible(true);
                mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addCustomerMenuItem;
    private javax.swing.JMenuItem addItemMenuItem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem deleteCustomerMenuItem;
    private javax.swing.JMenuItem deleteItemMenuItem;
    private javax.swing.JButton exitBut;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton lendItem;
    private javax.swing.JDesktopPane mainDesktopPane;
    private javax.swing.JMenu newMenuItem;
    private javax.swing.JButton sellItem;
    private javax.swing.JMenuItem updateCustomerMenuItem;
    private javax.swing.JMenuItem updateItemMenuItem;
    private javax.swing.JMenuItem viewAllCustomerMenuItem;
    private javax.swing.JMenuItem viewAllItemMenuItem;
    private javax.swing.JButton viewCustBut;
    private javax.swing.JButton viewItemBut;
    private javax.swing.JButton viewlendItemBut1;
    // End of variables declaration//GEN-END:variables

    public void centerJIF(JInternalFrame jif) {
        Dimension desktopSize = mainDesktopPane.getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }

}
