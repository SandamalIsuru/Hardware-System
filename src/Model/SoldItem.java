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
    
    private int billId;
    private int quantity;
    private String itemCode;
    private double soldPrice;
    
    public SoldItem(int billId, int quantity, String itemCode, double soldPrice) {

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
    
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }
   
    
}
