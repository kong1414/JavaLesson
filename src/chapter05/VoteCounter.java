package chapter05;

import javax.swing.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/30 10:50
 */
public class VoteCounter {
    //----------------------------------------------
    // Creates the main program frame.
    //----------------------------------------------
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new VoteCounterPanel());
        frame.pack();
        frame.setVisible(true);
    }

}
