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
public class BillDetail {
    
    private String billId;
    private String billDate;
    private String custId;
    private int isIssued;

    public BillDetail(String billId, String billDate, String custId, int isIssued) {
        this.billId = billId;
        this.billDate = billDate;
        this.custId = custId;
        this.isIssued = isIssued;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public int isIsIssued() {
        return isIssued;
    }

    public void setIsIssued(int isIssued) {
        this.isIssued = isIssued;
    }
    
}
