package chapter08.p3;

import javax.swing.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/18 10:47
 */
public class Rebound {
    //-----------------------------------------------------------------
    //  Displays the main frame of the program.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rebound");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new ReboundPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
