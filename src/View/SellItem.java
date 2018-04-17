/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static Controller.ItemController.getItemDetailsByName;
import Common.CommonUtil;
import Controller.BillDetailController;
import Controller.ItemController;
import static Controller.ItemController.getQtyOnHand;
import Controller.SoldItemController;
import Model.BillDetail;
import Model.Item;
import Model.SoldItem;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Isuru SanDamal
 */
public class SellItem extends javax.swing.JInternalFrame {

    int rowCount = 0;
    double total = 0;
    ArrayList<Item> items = null;
    Map<String, Integer> itemQtyList = new HashMap<String, Integer>(); //To keep QTY of all items
    CommonUtil commonUtil = null;

    /**
     * Creates new form sellItem
     */
    public SellItem() {
        initComponents();

        commonUtil = new CommonUtil();
        billNumber.setText(getDateAsString());
        try {
            items = ItemController.getAllItems();
            fillItemComboBox();
            autoCompletion1.enable(itemCombo);
            itemCode.setText(fillItemCode(itemCombo));
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(SellItem.this, ex, "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(SellItem.class.getName()).log(Level.SEVERE, null, ex);
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
        autoCompletion1 = new Common.AutoCompletion();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        itemCombo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        itemCode = new javax.swing.JTextField();
        addbut = new javax.swing.JButton();
        removebut = new javax.swing.JButton();
        qtyText = new javax.swing.JTextField();
        unitPriceText = new javax.swing.JTextField();
        discount = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        isIssued = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        totalText = new javax.swing.JTextField();
        okbut = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        billNumber = new javax.swing.JTextField();

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

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sell Items");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Item");

        itemCombo.setEditable(true);
        itemCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Item" }));
        itemCombo.setNextFocusableComponent(qtyText);
        itemCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemComboActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Item code");

        itemCode.setEditable(false);

        addbut.setText("Add");
        addbut.setNextFocusableComponent(okbut);
        addbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutActionPerformed(evt);
            }
        });
        addbut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addbutKeyPressed(evt);
            }
        });

        removebut.setText("Remove");
        removebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebutActionPerformed(evt);
            }
        });

        qtyText.setNextFocusableComponent(unitPriceText);

        unitPriceText.setNextFocusableComponent(discount);

        discount.setNextFocusableComponent(addbut);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Quantity");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Unit Price");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Discount");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(itemCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discount)
                    .addComponent(unitPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addbut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removebut))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(itemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(itemCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(itemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(unitPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removebut)
                    .addComponent(addbut))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        itemTable.setBackground(new java.awt.Color(204, 255, 255));
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
        itemTable.setNextFocusableComponent(removebut);
        jScrollPane2.setViewportView(itemTable);

        isIssued.setSelected(true);
        isIssued.setText("  Issued");
        isIssued.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isIssuedActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Total");

        totalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTextActionPerformed(evt);
            }
        });

        okbut.setText("Ok");
        okbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbutActionPerformed(evt);
            }
        });
        okbut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                okbutKeyPressed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Bill No");

        billNumber.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(billNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(isIssued)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(okbut)
                        .addGap(18, 18, 18)
                        .addComponent(cancel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(billNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(isIssued))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancel)
                            .addComponent(okbut))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        System.out.println("Key pressed");
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {  // handler
                if (ke.getKeyCode() == ke.VK_ESCAPE) {
                    System.out.println("escaped ?");
                    //setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // trying to close
                    setVisible(false);
                } else {
                    System.out.println("not escaped");
                }
            }
        });
    }//GEN-LAST:event_formKeyPressed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        System.out.println("Key pressed");
    }//GEN-LAST:event_formKeyTyped

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        int res = JOptionPane.showConfirmDialog(SellItem.this, "Are you sure you want to exit ?", "Select Option", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            SellItem.this.dispose();
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void okbutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_okbutKeyPressed
        saveSoldItem();
    }//GEN-LAST:event_okbutKeyPressed

    private void okbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbutActionPerformed
        saveSoldItem();
    }//GEN-LAST:event_okbutActionPerformed

    private void isIssuedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isIssuedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isIssuedActionPerformed

    private void removebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebutActionPerformed
        int selectedRowCount = itemTable.getSelectedRowCount();
        if (selectedRowCount > 0) {
            int selectedRowIndexies[] = itemTable.getSelectedRows();
            selectedRowIndexies = commonUtil.reverseArray(selectedRowIndexies);
            for (int selectedRowIndex : selectedRowIndexies) {
                String val = (String) itemTable.getValueAt(selectedRowIndex, 5);
                total -= Double.parseDouble(val);
                totalText.setText(Double.toString(total));
                String itemCodeStr = (String) itemTable.getValueAt(selectedRowIndex, 0);
                String qtyString = (String) itemTable.getValueAt(selectedRowIndex, 2);
                itemQtyList.put(itemCodeStr, itemQtyList.get(itemCodeStr) + Integer.parseInt(qtyString));
                ((DefaultTableModel) itemTable.getModel()).removeRow(selectedRowIndex);
            }
        } else {
            JOptionPane.showMessageDialog(SellItem.this, "Select an Item..", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_removebutActionPerformed

    private void addbutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addbutKeyPressed
        addDataToTable();
    }//GEN-LAST:event_addbutKeyPressed

    private void addbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutActionPerformed
        addDataToTable();
    }//GEN-LAST:event_addbutActionPerformed

    private void itemComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemComboActionPerformed
        if (itemCombo.getSelectedItem() == "Select Item") {
            itemCode.setText("");
            unitPriceText.setText("");
            qtyText.setText("");
            //            for (int i = rowCount - 1; i >= 0; i--) {
                //                ((DefaultTableModel) itemTable.getModel()).removeRow(i);
                //            }
            //            rowCount = 0;
        } else {
            try {
                itemCode.setText(fillItemCode(itemCombo));
                unitPriceText.setText(fillUnitPriceBox(itemCombo));
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(SellItem.this, ex, "Error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(SellItem.class.getName()).log(Level.SEVERE, null, ex);
            }
            qtyText.requestFocus();
        }
    }//GEN-LAST:event_itemComboActionPerformed

    private void totalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTextActionPerformed

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
            java.util.logging.Logger.getLogger(SellItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellItem().setVisible(true);
            }
        });
    }

    private void fillItemComboBox() throws SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<String>();
        for (Item item : items) {
            if (((DefaultComboBoxModel) itemCombo.getModel()).getIndexOf(item) == -1) {
                itemQtyList.put(item.getItemCode(), item.getQtyOnHand());
                itemCombo.addItem(item);
            }
        }
    }

    private String fillItemCode(JComboBox combo) throws SQLException, ClassNotFoundException {
        if (itemCombo.getSelectedItem() == "Select Item") {
            return "";
        } else {
            String itemCodeWithDescription = (combo.getSelectedItem()).toString();
            return itemCodeWithDescription.substring(0, itemCodeWithDescription.indexOf("-") - 1);
        }
    }

    private String fillUnitPriceBox(JComboBox combo) throws SQLException, ClassNotFoundException {
        String itemCodeWithDescription = (combo.getSelectedItem()).toString();
        String description = itemCodeWithDescription.substring(itemCodeWithDescription.indexOf("-") + 2);
        String iCode = getItemDetailsByName(description).getString("selling_price");
        return iCode;
    }

    private String getQOHtoCompare(String ic) throws SQLException, ClassNotFoundException {
        String Qty = getQtyOnHand(ic);
        return Qty;
    }

    private void addDataToTable() {
        if (itemCode.getText().isEmpty() || unitPriceText.getText().isEmpty() || qtyText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(SellItem.this, "Please Fill All Fields...", "Warnning", JOptionPane.WARNING_MESSAGE);
        } else {
            String description = (itemCombo.getSelectedItem()).toString();
            String itemCodeStr = itemCode.getText();
            String unitPrice = unitPriceText.getText();
            String qty = qtyText.getText();
            int disc = (Integer) discount.getValue();
            double up = Double.parseDouble(unitPrice);
            double qtty = Double.parseDouble(qty);
            double ammount = ((up * qtty) - ((up * qtty) * (disc / 100.0)));
            int dbQty = itemQtyList.get(itemCodeStr);
            if (dbQty < Integer.parseInt(qty)) {
                JOptionPane.showMessageDialog(SellItem.this, "Stock Out....Remain " + dbQty + " Items", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                total += ammount;
                Object[] rowData = {itemCodeStr, description, qty, unitPrice, Integer.toString(disc), Double.toString(ammount)};
                ((DefaultTableModel) itemTable.getModel()).addRow(rowData);
                itemQtyList.put(itemCodeStr, dbQty - Integer.parseInt(qty));
                qtyText.setText("");
                discount.setValue(0);
                totalText.setText(Double.toString(total));
            }
        }
        qtyText.requestFocus();
    }

    private void saveSoldItem(){
        int rowCount = itemTable.getRowCount();
        if (rowCount == 0) {
            JOptionPane.showMessageDialog(SellItem.this, "Please Add Items to the Table...", "Warnning", JOptionPane.WARNING_MESSAGE);
        }
        if (rowCount > 0 && itemCombo.getSelectedItem() != "Select Item") {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy-MM-dd");
            int issuedOrNot = isIssued.isSelected() == true ? 1 : 0;
            double total = Double.parseDouble(totalText.getText());
            try {
                int insertBillDetailRes = BillDetailController.addBillDetail(new BillDetail(billNumber.getText(), dateFormat.format(date).substring(4), "", issuedOrNot, total, total));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(SellItem.this, ex, "Error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(SellItem.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (int i = 0; i < rowCount; i++) {
                String itemCode = (String) itemTable.getValueAt(i, 0);
                int qty = Integer.parseInt((String) itemTable.getValueAt(i, 2));
                int soldPrice = Integer.parseInt((String) itemTable.getValueAt(i, 3));

                String dbQty;
                try {
                    dbQty = getQOHtoCompare(itemCode);
                    int dbQty1 = Integer.parseInt(dbQty);
                    int insertSoldItemRes = SoldItemController.addSoldItem(new SoldItem(billNumber.getText(), qty, itemCode, soldPrice));
                    int res = ItemController.updateItemQty(dbQty1, qty, itemCode);
                } catch (SQLException | ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(SellItem.this, ex, "Error", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(SellItem.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            for (int i = rowCount - 1; i >= 0; i--) {
                ((DefaultTableModel) itemTable.getModel()).removeRow(i);
            }
            total = 0;
            totalText.setText("");
            billNumber.setText(getDateAsString());
            JOptionPane.showMessageDialog(SellItem.this, "Bill Printed", "", JOptionPane.YES_NO_CANCEL_OPTION);
        }
    }
    
    private String getDateAsString() {
        String dateTimeAsString = "";
        Date date = new Date();
        System.out.println("Date : " + date.toString());
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        dateTimeAsString = dateTimeAsString + getStringOfInteger(cal.get(Calendar.YEAR));
        dateTimeAsString = dateTimeAsString + getStringOfInteger(cal.get(Calendar.MONTH)+1);
        dateTimeAsString = dateTimeAsString + getStringOfInteger(cal.get(Calendar.DATE));
        dateTimeAsString = dateTimeAsString + getStringOfInteger(cal.get(Calendar.HOUR_OF_DAY));
        dateTimeAsString = dateTimeAsString + getStringOfInteger(cal.get(Calendar.MINUTE));
        dateTimeAsString = dateTimeAsString + getStringOfInteger(cal.get(Calendar.SECOND));

        return dateTimeAsString;
    }

    private String getStringOfInteger(Integer integer) {
        return integer / 10 < 1 ? "0" + integer.toString() : integer.toString();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbut;
    private Common.AutoCompletion autoCompletion1;
    private javax.swing.JTextField billNumber;
    private javax.swing.JButton cancel;
    private javax.swing.JSpinner discount;
    private javax.swing.JCheckBox isIssued;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton okbut;
    private javax.swing.JTextField qtyText;
    private javax.swing.JButton removebut;
    private javax.swing.JTextField totalText;
    private javax.swing.JTextField unitPriceText;
    // End of variables declaration//GEN-END:variables
}
