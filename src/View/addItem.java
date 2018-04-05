/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.itemController;
import Model.Item;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Isuru SanDamal
 */
public class addItem extends javax.swing.JInternalFrame {

    /**
     * Creates new form addItem
     */
    public addItem() {
        initComponents();
        this.getRootPane().setDefaultButton(addbut);
        try {
            itemCode.setText(generateItemCode());
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(addItem.this, ex, "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(addItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(true);
        itemDesc.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        itemCode = new javax.swing.JTextField();
        itemDesc = new javax.swing.JTextField();
        itemPrize = new javax.swing.JTextField();
        qtyOnHand = new javax.swing.JTextField();
        addbut = new javax.swing.JButton();
        cancelbut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Add Item");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Item Code");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Item Description");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Unit Price");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Qty on Hand");

        addbut.setText("Add");
        addbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutActionPerformed(evt);
            }
        });

        cancelbut.setText("Cancel");
        cancelbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(itemPrize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addComponent(qtyOnHand, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addbut, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelbut)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(itemDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itemPrize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtyOnHand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbut)
                    .addComponent(cancelbut))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbutActionPerformed
        int res = JOptionPane.showConfirmDialog(addItem.this, "Are you sure you want to exit ?", "Select Option", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            addItem.this.dispose();
        }
    }//GEN-LAST:event_cancelbutActionPerformed

    private void addbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutActionPerformed
        if (itemDesc.getText().isEmpty() || itemPrize.getText().isEmpty() || qtyOnHand.getText().isEmpty()) {
            JOptionPane.showMessageDialog(addItem.this, "Please Fill All Fields...", "Warnning", JOptionPane.WARNING_MESSAGE);
            itemDesc.requestFocus();
        } else {
            try {
                String itemcode = itemCode.getText();
                String description = itemDesc.getText();
                int qoh = Integer.parseInt(qtyOnHand.getText());
                double unitPrice = Double.parseDouble(itemPrize.getText());
                Item item = new Item(itemcode, description, unitPrice, qoh);

                if (isItemExist(item)) {
                    JOptionPane.showMessageDialog(addItem.this, "Item already exist....");
                    itemDesc.requestFocus();
                } else {
                    int res = itemController.addItem(item);
                    if (res > 0) {
                        JOptionPane.showMessageDialog(addItem.this, "Added Successfully....");
                        itemCode.setText(generateItemCode());
                        itemDesc.setText("");
                        itemPrize.setText("");
                        qtyOnHand.setText("");
                        itemDesc.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(addItem.this, "Added Fail.......", "", JOptionPane.ERROR_MESSAGE);
                        itemDesc.requestFocus();
                    }
                }
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(addItem.this, ex, "Error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(addItem.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(addItem.this, "Please insert correct value for Price & Qty...", "Error", JOptionPane.ERROR_MESSAGE);
                itemPrize.requestFocus();
            }
        }
    }//GEN-LAST:event_addbutActionPerformed

    private boolean isItemExist(Item item) throws ClassNotFoundException, SQLException {
        ArrayList<Item> allItems = itemController.getAllItems();
        for (Item oneItem : allItems) {
            if (oneItem.getDescription().equalsIgnoreCase(item.getDescription())) {
                return true;
            }
        }
        return false;
    }

    private String generateItemCode() throws SQLException, ClassNotFoundException {
        try {
            String itemCode = itemController.getLastItemCode();

            if (itemCode == null) {
                return "I0001";
            } else {
                int num = Integer.parseInt(itemCode.split("I")[1]);
                num++;
                if (num < 10) {
                    return "I000" + num;
                } else if (num < 100) {
                    return "I00" + num;
                } else if (num < 1000) {
                    return "I0" + num;
                } else {
                    return "I" + num;
                }
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
            return "h";
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbut;
    private javax.swing.JButton cancelbut;
    private javax.swing.JTextField itemCode;
    private javax.swing.JTextField itemDesc;
    private javax.swing.JTextField itemPrize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField qtyOnHand;
    // End of variables declaration//GEN-END:variables
}
