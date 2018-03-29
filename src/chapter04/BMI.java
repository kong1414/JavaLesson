package chapter04;

import javax.swing.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/29 19:23
 */
public class BMI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BMI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BMIPanel panel = new BMIPanel();

        frame.getContentPane().add(panel);
        frame.pack();

        frame.setVisible(true);
    }

}
