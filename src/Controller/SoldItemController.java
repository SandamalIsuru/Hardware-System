/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DBConnect.DBconnect;
import Model.Customer;
import Model.SoldItem;
import java.sql.SQLException;

/**
 *
 * @author IsuruR
 */
public class SoldItemController {
    
    public static int addSoldItem(SoldItem soldItem) throws SQLException {
        String query = "Insert into sold_item values(null,'" + soldItem.getItemCode() + "','" + soldItem.getQuantity()+ "','" + soldItem.getBillId()+ "','" + soldItem.getSoldPrice() + "')";
        return DBconnect.DBconnect().createStatement().executeUpdate(query);
    }
}
