/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Isuru SanDamal
 */
public class lendDetail {

    private String custID;
    private String itemID;
    private String itemName;
    private String date;
    private int QTY;
    private int discount;
    private double unitSellPrice;

    public lendDetail() {
    }

    public lendDetail(String custId, String itemId, String date, int qty, int discount, double unitSellPrice) {
        this.custID = custId;
        this.itemID = itemId;
        this.date = date;
        this.QTY = qty;
        this.discount = discount;
        this.unitSellPrice = unitSellPrice;
    }

    public lendDetail(String itemName, String date, int qty, int discount, double unitSellPrice) {
        this.itemName = itemName;
        this.date = date;
        this.QTY = qty;
        this.discount = discount;
        this.unitSellPrice = unitSellPrice;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustId(String custId) {
        this.custID = custId;
    }

    /**
     * @return the itemID
     */
    public String getItemId() {
        return itemID;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setItemId(String itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    public int getQTY() {
        return QTY;
    }

    /**
     * @param QTY the QTY to set
     */
    public void setQTY(int QTY) {
        this.QTY = QTY;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    /**
     * @return the unitSellPrice
     */
    public double getUnitSellPrice() {
        return unitSellPrice;
    }

    /**
     * @param unitSellPrice the unitSellPrice to set
     */
    public void setUnitSellPrice(double unitSellPrice) {
        this.unitSellPrice = unitSellPrice;
    }

}
