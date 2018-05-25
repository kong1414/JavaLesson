package chapter09.p2;

import javax.swing.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/25 10:47
 */
public class SpeedControl {
    // -------------------------------------
    //  Sets up the frame for the animation.
    // -------------------------------------
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Balls");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new SpeedControlPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
