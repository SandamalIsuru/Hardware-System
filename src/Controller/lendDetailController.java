/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DBConnect.DBconnect;
import Model.Customer;
import Model.lendDetail;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Isuru SanDamal
 */
public class lendDetailController {
    
    public static int addLendDetail(lendDetail lenddetail){
        try{
            String query = "insert into lend_detail values(null,'" + lenddetail.getCustId() + "','" + lenddetail.getItemId() + "','" + lenddetail.getDate() + "','" + lenddetail.getQTY() + "','" + lenddetail.getDiscount() + "'," + lenddetail.getUnitSellPrice() + ")";
            return DBconnect.DBconnect().createStatement().executeUpdate(query);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }
    }
    
    public static ArrayList<lendDetail> getAllBurrowDetail(String custName) throws SQLException, ClassNotFoundException {
        String query = "SELECT date,qty,discount,unitprice,descr FROM lend_detail JOIN item ON lend_detail.item_id=item.item_code JOIN customer_detail ON lend_detail.cust_id=customer_detail.cust_id WHERE customer_detail.cust_name='" + custName + "'";
        ResultSet rst = DBconnect.DBconnect().createStatement().executeQuery(query);

        ArrayList<lendDetail> lenddetails = new ArrayList<>();
        try{
        while (rst.next()) {
            lendDetail lenddetail = new lendDetail(rst.getString("descr"), rst.getString("date"), rst.getInt("qty"), rst.getInt("discount"), rst.getDouble("unitprice"));
            lenddetails.add(lenddetail);
        }
        return lenddetails;
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
            return lenddetails;
        }
    }
    
}
