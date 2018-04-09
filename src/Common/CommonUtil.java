/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import View.SellItem;
import java.awt.Component;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IsuruR
 */
public class CommonUtil {

    public int[] reverseArray(int[] array) {
        int n, temp;
        n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
