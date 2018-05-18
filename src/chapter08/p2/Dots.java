package chapter08.p2;

import javax.swing.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/18 10:35
 */
public class Dots {
    //-----------------------------------------------------------------
    //  Creates and displays the application frame.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dots");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new DotsPanel());

        frame.pack();
        frame.setVisible(true);
    }
}
