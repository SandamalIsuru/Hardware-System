/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DBConnect.DBconnect;
import Model.LendDetail;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Isuru SanDamal
 */
public class LendDetailController {

    public static int addLendDetail(LendDetail lenddetail) throws SQLException {
        String query = "insert into lend_detail values(null,'" + lenddetail.getCustId() + "','" + lenddetail.getItemId() + "','" + lenddetail.getDate() + "','" + lenddetail.getQTY() + "','" + lenddetail.getDiscount() + "'," + lenddetail.getUnitSellPrice() + ")";
        return DBconnect.DBconnect().createStatement().executeUpdate(query);
    }

    public static ArrayList<LendDetail> getAllLendingDetail(String custName) throws SQLException, ClassNotFoundException {
        String query = "SELECT date,qty,discount,unitprice,descr FROM lend_detail JOIN item ON lend_detail.item_id=item.item_code JOIN customer_detail ON lend_detail.cust_id=customer_detail.cust_id WHERE customer_detail.cust_name='" + custName + "'";
        ResultSet rst = DBconnect.DBconnect().createStatement().executeQuery(query);

        ArrayList<LendDetail> lenddetails = new ArrayList<>();
        while (rst.next()) {
            LendDetail lenddetail = new LendDetail(rst.getString("descr"), rst.getString("date"), rst.getInt("qty"), rst.getInt("discount"), rst.getDouble("unitprice"));
            lenddetails.add(lenddetail);
        }
        return lenddetails;
    }

}
