package chapter08.p3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/18 10:48
 */
public class ReboundPanel extends JPanel {
    private final int WIDTH = 800, HEIGHT = 600;
    private final int DELAY = 20, IMAGE_SIZE = 160;

    private ImageIcon image;
    private ImageIcon image2;
    private Timer timer;
    private int x, y, moveX, moveY;
    private int x2, y2, moveX2, moveY2;

    //-----------------------------------------------------------------
    //  Sets up the panel, including the timer for the animation.
    //-----------------------------------------------------------------
    public ReboundPanel() {
        timer = new Timer(DELAY, new ReboundListener());
        // 使用绝对定位确认文件位置
        image = new ImageIcon("C:\\Users\\QGL-XPS\\Desktop\\face.png");
        image2 = new ImageIcon("C:\\Users\\QGL-XPS\\Desktop\\face.png");

        x = 0;
        y = 40;
        moveX = moveY = 3;

        x2 = 200;
        y2 = 40;
        moveX2 = 6;
        moveY2 = -6;

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
        timer.start();
    }

    //-----------------------------------------------------------------
    //  Draws the image in the current location.
    //-----------------------------------------------------------------
    @Override
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        image.paintIcon(this, page, x, y);
        image.paintIcon(this, page, x2, y2);
    }

    //*****************************************************************
    //  Represents the action listener for the timer.
    //*****************************************************************
    private class ReboundListener implements ActionListener {
        //--------------------------------------------------------------
        //  Updates the position of the image and possibly the direction
        //  of movement whenever the timer fires an action event.
        //--------------------------------------------------------------
        @Override
        public void actionPerformed(ActionEvent event) {
            x += moveX;
            y += moveY;

            if (x <= 0 || x >= WIDTH - IMAGE_SIZE) {
                moveX = moveX * -1;
            }

            if (y <= 0 || y >= HEIGHT - IMAGE_SIZE) {
                moveY = moveY * -1;
            }

            x2 += moveX2;
            y2 += moveY2;
            if (x2 <= 0 || x2 >= WIDTH - IMAGE_SIZE) {
                moveX2 = moveX2 * -1;
            }

            if (y2 <= 0 || y2 >= HEIGHT - IMAGE_SIZE) {
                moveY2 = moveY2 * -1;
            }

            if (Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2)) <= image.getIconWidth()) {
                System.out.println("x= " + x + " y= " + y + " x2= " + x2 + " y2= " + y2);
                if (Math.abs(x2 - x) >= Math.abs(y2 - y)) {
                    moveX = moveX * -1;
                    moveY = moveY * -1;
                }
                if (Math.abs(x2 - x) <= Math.abs(y2 - y)) {
                    moveY = moveY * -1;
                    moveY2 = moveY2 * -1;
                }
            }

            repaint();
        }
    }
}

