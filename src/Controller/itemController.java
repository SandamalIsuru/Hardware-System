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

/**
 *
 * @author Isuru SanDamal
 */
public class itemController {

    public static int addItem(Item item) throws SQLException {
        String query = "Insert into item values('" + item.getItemCode() + "','" + item.getDescription() + "','" + item.getPurchasePrice() + "','" + item.getUnitPrice() + "','" + item.getQtyOnHand() + "')";
        return DBconnect.DBconnect().createStatement().executeUpdate(query);
    }

    public static ArrayList<Item> getAllItems() throws SQLException, ClassNotFoundException {
        String query = "select * from item";
        ResultSet rst = DBconnect.DBconnect().createStatement().executeQuery(query);
        ArrayList<Item> items = new ArrayList<>();
        while (rst.next()) {
            Item item = new Item(rst.getString("item_code"), rst.getString("descr"), rst.getDouble("purchasing_price"), rst.getDouble("selling_price"), rst.getInt("qtyonhand"));
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

    public static ResultSet getItemDetailsByName(String description) throws SQLException, ClassNotFoundException {
        String query = "select item_code,selling_price from item where descr='" + description + "'";
        ResultSet rst = DBconnect.DBconnect().createStatement().executeQuery(query);
        if (rst.first()) {
            return rst;
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
        String query = "update item set descr='" + item.getDescription() + "', purchasing_price='" + item.getPurchasePrice() + "', selling_price='" + item.getUnitPrice() + "', qtyonhand='" + item.getQtyOnHand() + "' where item_code='" + item.getItemCode() + "'";
        return DBconnect.DBconnect().createStatement().executeUpdate(query);
    }

    public static int updateItemQty(int x, int y, String ic) throws SQLException, ClassNotFoundException {
        int z = x - y;
        String query = "update Item set qtyonhand='" + z + "' where item_code='" + ic + "'";
        return DBconnect.DBconnect().createStatement().executeUpdate(query);
    }

    public static int reupdateItemQty(int x, int y, String ic) throws SQLException, ClassNotFoundException {
        int z = x + y;
        String query = "update Item set qtyonhand='" + z + "' where item_code='" + ic + "'";
        return DBconnect.DBconnect().createStatement().executeUpdate(query);
    }

    public static int deleteItem(String itemCode) throws SQLException, ClassNotFoundException {
        String query = "delete from item where item_code='" + itemCode + "'";
        return DBconnect.DBconnect().createStatement().executeUpdate(query);
    }

}
