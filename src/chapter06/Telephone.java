package chapter06;

import javax.swing.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/4/8 11:19
 */
public class Telephone {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Telephone");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TelephonePanel());
        frame.pack();
        frame.setVisible(true);
    }
}
