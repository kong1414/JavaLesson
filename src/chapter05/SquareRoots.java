package chapter05;

import javax.swing.*;

/**
 * @Description: 计算并显示所输入整数的平方根
 * @Author: QiuGuanLin
 * @Date: 2018/3/30 10:58
 */
public class SquareRoots {
    public static void main(String[] args) {
        String numStr, result;
        int num, again;
        do {
            numStr = JOptionPane.showInputDialog("计算并显示所输入整数的平方根\nEnter an integer: ");
            num = Integer.parseInt(numStr);
            result = "That number's SquareRoots is " + Math.sqrt(num);
            JOptionPane.showMessageDialog(null, result);
            again = JOptionPane.showConfirmDialog(null, "Do Another?");
        }
        while (again == JOptionPane.YES_OPTION);
    }

}
