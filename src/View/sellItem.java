/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.itemController;
import static Controller.itemController.getItemCode;
import static Controller.itemController.getQtyOnHand;
import Model.Item;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Isuru SanDamal
 */
public class sellItem extends javax.swing.JInternalFrame {

    double total = 0;

    /**
     * Creates new form sellItem
     */
    public sellItem() {
        initComponents();

        itemCode.setEditable(false);

        try {
            fillItemComboBox();
            itemCode.setText(fillItemCode(itemCombo));
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(sellItem.this, ex, "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(sellItem.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        itemCombo = new javax.swing.JComboBox();
        qtyText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        addbut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        discount = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        itemCode = new javax.swing.JTextField();
        removebut = new javax.swing.JButton();
        okbut = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        totalText = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sell Items");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Item");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Discount");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Quantity");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Unit Price");

        itemCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemComboActionPerformed(evt);
            }
        });

        qtyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyTextActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        addbut.setText("Add");
        addbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutActionPerformed(evt);
            }
        });

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Description", "QTY", "Unit Price", "Discount", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(itemTable);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Item code");

        removebut.setText("Remove");
        removebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebutActionPerformed(evt);
            }
        });

        okbut.setText("Ok");
        okbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbutActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(discount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(priceText, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addbut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removebut))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(29, 29, 29)
                                .addComponent(itemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(okbut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(itemCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(itemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbut)
                    .addComponent(removebut))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(okbut))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed

        int res = JOptionPane.showConfirmDialog(sellItem.this, "Are you sure you want to exit ?", "Select Option", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            sellItem.this.dispose();
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void addbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutActionPerformed
        if (itemCode.getText().isEmpty() || priceText.getText().isEmpty() || qtyText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(sellItem.this, "Please Fill All Fields...", "Warnning", JOptionPane.WARNING_MESSAGE);
        } else {

            String description = (itemCombo.getSelectedItem()).toString();
            String Qtyonhand = itemCode.getText();
            String unitPrice = priceText.getText();
            String qty = qtyText.getText();
            int disc = (Integer) discount.getValue();
            double up = Double.parseDouble(unitPrice);
            double qtty = Double.parseDouble(qty);
            double ammount = ((up * qtty) - ((up * qtty) * (disc / 100.0)));

            String dbQty;
            try {
                dbQty = getQOHtoCompare(Qtyonhand);
                int dbQty1 = Integer.parseInt(dbQty);

                if (dbQty1 < Integer.parseInt(qty)) {

                    JOptionPane.showMessageDialog(sellItem.this, "Stock Out....Remain " + dbQty + " Items", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    total += ammount;
                    Object[] rowData = {Qtyonhand, description, qty, unitPrice, Integer.toString(disc), Double.toString(ammount)};
                    ((DefaultTableModel) itemTable.getModel()).addRow(rowData);
                    //int res = itemController.updateItemQty(dbQty1, Integer.parseInt(qty), Qtyonhand);
                    qtyText.setText("");
                    priceText.setText("");
                    discount.setValue(0);
                    totalText.setText(Double.toString(total));
                }

            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(sellItem.this, ex, "Error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(sellItem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_addbutActionPerformed

    private void itemComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemComboActionPerformed
        try {
            itemCode.setText(fillItemCode(itemCombo));
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(sellItem.this, ex, "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(sellItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemComboActionPerformed

    private void qtyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyTextActionPerformed

    private void removebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebutActionPerformed
        int selectedRowCount = itemTable.getSelectedRowCount();

        if (selectedRowCount > 0) {
            int selectedRowIndex = itemTable.getSelectedRow();
            String val = (String) itemTable.getValueAt(selectedRowIndex, 5);
            total -= Double.parseDouble(val);

            for (int i = 0; i < selectedRowCount; i++) {
                int selectedRow = itemTable.getSelectedRow();
                ((DefaultTableModel) itemTable.getModel()).removeRow(selectedRow);
            }
            totalText.setText(Double.toString(total));
        } else {
            JOptionPane.showMessageDialog(sellItem.this, "Select an Item..", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_removebutActionPerformed

    private void okbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbutActionPerformed
        int rowCount = itemTable.getRowCount();
        if (rowCount > 0) {

            for (int i = 0; i < rowCount; i++) {
                String itemCode = (String) itemTable.getValueAt(i, 0);
                int qty = Integer.parseInt((String) itemTable.getValueAt(i, 2));
                String dbQty;
                try {
                    dbQty = getQOHtoCompare(itemCode);
                    int dbQty1 = Integer.parseInt(dbQty);
                    int res = itemController.updateItemQty(dbQty1, qty, itemCode);
                } catch (SQLException | ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(sellItem.this, ex, "Error", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(sellItem.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            for (int i = rowCount - 1; i >= 0; i--) {
                ((DefaultTableModel) itemTable.getModel()).removeRow(i);
            }
            totalText.setText("");
            JOptionPane.showMessageDialog(sellItem.this, "Bill Printed", "", JOptionPane.YES_NO_CANCEL_OPTION);
        }
    }//GEN-LAST:event_okbutActionPerformed

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
            java.util.logging.Logger.getLogger(sellItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sellItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sellItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sellItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sellItem().setVisible(true);
            }
        });
    }

    private void fillItemComboBox() throws SQLException, ClassNotFoundException {
        ArrayList<Item> items = itemController.getAllItems();
        itemCombo.removeAllItems();
        for (Item item : items) {
            itemCombo.addItem(item.getDescription());
        }
    }

    private String fillItemCode(JComboBox combo) throws SQLException, ClassNotFoundException {
        String description = (combo.getSelectedItem()).toString();
        String iCode = getItemCode(description);
        return iCode;
    }

    private String getQOHtoCompare(String ic) throws SQLException, ClassNotFoundException {
        String Qty = getQtyOnHand(ic);
        return Qty;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbut;
    private javax.swing.JButton cancel;
    private javax.swing.JSpinner discount;
    private javax.swing.JTextField itemCode;
    private javax.swing.JComboBox itemCombo;
    private javax.swing.JTable itemTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton okbut;
    private javax.swing.JTextField priceText;
    private javax.swing.JTextField qtyText;
    private javax.swing.JButton removebut;
    private javax.swing.JTextField totalText;
    // End of variables declaration//GEN-END:variables
}
