package chapter07;

import javax.swing.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/4 10:35
 */
public class ColorOptions {
    // -------------------------------------------------------------
    //  Creates and presents the frame for the color change panel.
    // -------------------------------------------------------------
    public static void main(String[] args) {
        JFrame colorFrame = new JFrame("Color Options");
        colorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ColorOptionsPanel panel = new ColorOptionsPanel();
        colorFrame.getContentPane().add(panel);

        colorFrame.pack();
        // colorFrame.setSize(400, 400);
        colorFrame.setVisible(true);
    }

}
