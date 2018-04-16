/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author IsuruR
 */
public class SoldItem {
    
    private int quantity;
    private String billId;
    private String itemCode;
    private double soldPrice;
    
    public SoldItem(String billId, int quantity, String itemCode, double soldPrice) {

        this.billId = billId;
        this.quantity = quantity;
        this.itemCode = itemCode;
        this.soldPrice = soldPrice;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }
   
    
}
