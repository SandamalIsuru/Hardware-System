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
public class Customer {

    private String custID;
    private String custName;
    private String address;
    private String tel;

    public Customer() {

    }

    public Customer(String custid, String custname, String address, String tel) {

        this.custID = custid;
        this.custName = custname;
        this.address = address;
        this.tel = tel;
    }

    //return custID
    public String getCustID() {
        return custID;
    }

    //set custID
    public void setCustID(String custid) {
        this.custID = custid;
    }

    //return custName
    public String getCustName() {
        return custName;
    }

    //set custName
    public void setCustName(String custname) {
        this.custName = custname;
    }

    //return address
    public String getCustAddress() {
        return address;
    }

    //set address
    public void setCustAddress(String address) {
        this.address = address;
    }

    //return tel
    public String getCustTel() {
        return tel;
    }

    //set custID
    public void setCustTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return custName;
    }
}
