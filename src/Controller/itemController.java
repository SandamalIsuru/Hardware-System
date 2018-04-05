/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DBConnect.DBconnect;
import Model.Item;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Isuru SanDamal
 */
public class itemController {
    
    public static int addItem(Item item){
        try{
            String query = "Insert into item values('" + item.getItemCode() + "','" + item.getDescription() + "','" + item.getUnitPrice() + "'," + item.getQtyOnHand() + ")";
            return DBconnect.DBconnect().createStatement().executeUpdate(query);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }
        
    }
    
    
    public static ArrayList<Item> getAllItems() throws SQLException, ClassNotFoundException {
        String query = "select * from item";
        ResultSet rst = DBconnect.DBconnect().createStatement().executeQuery(query);

        ArrayList<Item> items = new ArrayList<>();
        while (rst.next()) {
            Item item = new Item(rst.getString("item_code"), rst.getString("descr"), rst.getDouble("price"), rst.getInt("qtyonhand"));
            items.add(item);
        }
        return items;
    }
    
    public static String getLastItemCode() throws SQLException, ClassNotFoundException {
        String query = "select item_code from item order by 1 desc limit 1";
        ResultSet rst = DBconnect.DBconnect().createStatement().executeQuery(query);
        if (rst.first()) {
            return rst.getString("item_code");
        }
        return null;
    }
    
    public static String getItemCode(String description) throws SQLException, ClassNotFoundException {
        String query = "select item_code from item where descr='" + description + "'";
        ResultSet rst = DBconnect.DBconnect().createStatement().executeQuery(query);
        if (rst.first()) {
            return rst.getString("item_code");
        }
        return null;
    }
    
    public static String getQtyOnHand(String ic) throws SQLException, ClassNotFoundException {
        String query = "select qtyonhand from item where item_code='" + ic + "'";
        ResultSet rst = DBconnect.DBconnect().createStatement().executeQuery(query);
        if (rst.first()) {
            return rst.getString("qtyonhand");
        }
        return null;
    }
    
    public static int updateItems(Item item) throws SQLException, ClassNotFoundException {
        String query = "update item set descr='" + item.getDescription() + "', price='" + item.getUnitPrice() + "',qtyonhand='" + item.getQtyOnHand() + "' where item_code='" + item.getItemCode() + "'";
        return DBconnect.DBconnect().createStatement().executeUpdate(query);
    }
    
    public static int updateItemQty(int x, int y, String ic) throws SQLException, ClassNotFoundException {
        int z = x-y;
        String query = "update Item set qtyonhand='" + z + "' where item_code='" + ic + "'";
        return DBconnect.DBconnect().createStatement().executeUpdate(query);
    }
    
    public static int reupdateItemQty(int x, int y, String ic) throws SQLException, ClassNotFoundException {
        int z = x+y;
        String query = "update Item set qtyonhand='" + z + "' where item_code='" + ic + "'";
        return DBconnect.DBconnect().createStatement().executeUpdate(query);
    }

    public static int deleteItem(String itemCode) throws SQLException, ClassNotFoundException {
//        String query1 = "SET foreign_key_checks = 0";
        String query = "delete from item where item_code='" + itemCode + "'";
//        String query2 = "SET foreign_key_checks = 1";
//        DBconnect.DBconnect().createStatement().executeUpdate(query1);
        int isAdded =  DBconnect.DBconnect().createStatement().executeUpdate(query);
//        DBconnect.DBconnect().createStatement().executeUpdate(query2);
        return isAdded;
    }
    
}
