package chapter04;

import javax.swing.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/29 19:06
 */
public class VoteCounter {
    //----------------------------------------------
    // Creates the main program frame.
    //----------------------------------------------
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new VoteCounterPanel());
        // 窗口容器自适应
        frame.pack();
        frame.setVisible(true);
    }

}
