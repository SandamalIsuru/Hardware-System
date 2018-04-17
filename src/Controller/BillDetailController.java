/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DBConnect.DBconnect;
import Model.BillDetail;
import Model.SoldItem;
import java.sql.SQLException;

/**
 *
 * @author IsuruR
 */
public class BillDetailController {
    
    public static int addBillDetail(BillDetail billDetail) throws SQLException {
        String query = "Insert into bill_detail values('" + billDetail.getBillId() + "','" + billDetail.getBillDate()+ "','" + billDetail.getCustId()+ "','" + billDetail.isIsIssued() + "','" + billDetail.getTotal()+ "','" + billDetail.getCashReceivd() + "')";
        return DBconnect.DBconnect().createStatement().executeUpdate(query);
    }
}
