/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DBConnect.DBconnect;
import Model.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Isuru SanDamal
 */
public class customerController {

    public static int addCustomer(Customer customer) throws SQLException {
        String query = "Insert into customer_detail values('" + customer.getCustID() + "','" + customer.getCustName() + "','" + customer.getCustAddress() + "','" + customer.getCustTel() + "')";
        return DBconnect.DBconnect().createStatement().executeUpdate(query);
    }

    public static ArrayList<Customer> getAllCustomers() throws SQLException, ClassNotFoundException {
        String query = "select * from customer_detail";
        ResultSet rst = DBconnect.DBconnect().createStatement().executeQuery(query);

        ArrayList<Customer> customers = new ArrayList<>();
        while (rst.next()) {
            Customer customer = new Customer(rst.getString("cust_id"), rst.getString("cust_name"), rst.getString("address"), rst.getString("tel"));
            customers.add(customer);
        }
        return customers;
    }

    public static ArrayList<Customer> getAllBurrowCustomers() throws SQLException, ClassNotFoundException {
        String query1 = "SELECT DISTINCT cust_id FROM lend_detail";
        ResultSet rst1 = DBconnect.DBconnect().createStatement().executeQuery(query1);

        ArrayList<Customer> customers = new ArrayList<>();
        while (rst1.next()) {
            String custID = rst1.getString("cust_id");
            String query = "SELECT * FROM customer_detail WHERE cust_id='" + custID + "'";
            ResultSet rst = DBconnect.DBconnect().createStatement().executeQuery(query);
            while (rst.next()) {
                Customer customer = new Customer(rst.getString("cust_id"), rst.getString("cust_name"), rst.getString("address"), rst.getString("tel"));
                customers.add(customer);
            }
        }
        return customers;
    }

    public static String getLastCustId() throws SQLException, ClassNotFoundException {
        String query = "select cust_id from customer_detail order by 1 desc limit 1";
        ResultSet rst = DBconnect.DBconnect().createStatement().executeQuery(query);
        if (rst.first()) {
            return rst.getString("cust_id");
        }
        return null;
    }

    public static String getCustAddress(String name) throws SQLException, ClassNotFoundException {
        String query = "select address from customer_detail where cust_name='" + name + "'";
        ResultSet rst = DBconnect.DBconnect().createStatement().executeQuery(query);
        if (rst.first()) {
            return rst.getString("address");
        }
        return null;
    }

    public static String getCustID(String name) throws SQLException, ClassNotFoundException {
        String query = "select cust_id from customer_detail where cust_name='" + name + "'";
        ResultSet rst = DBconnect.DBconnect().createStatement().executeQuery(query);
        if (rst.first()) {
            return rst.getString("cust_id");
        }
        return null;
    }

    public static int updateCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        String query = "update customer_detail set cust_name='" + customer.getCustName() + "', address='" + customer.getCustAddress() + "', tel='" + customer.getCustTel() + "' where cust_id='" + customer.getCustID() + "'";
        return DBconnect.DBconnect().createStatement().executeUpdate(query);
    }

    public static int deleteCustomer(String custId) throws SQLException {
        String query = "delete from customer_detail where cust_id='" + custId + "'";
        return DBconnect.DBconnect().createStatement().executeUpdate(query);
    }
}
