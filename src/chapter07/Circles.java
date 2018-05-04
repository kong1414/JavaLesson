package chapter07;

import javax.swing.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/4 11:02
 */
public class Circles {
    //-----------------------------------------------------------------
    //  Creates and displays the application frame.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        JFrame circlesFrame = new JFrame("Circles");
        circlesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        circlesFrame.getContentPane().add(new CirclePanel());

        circlesFrame.pack();
        circlesFrame.setVisible(true);
    }

}
