package chapter09.p2;

import java.awt.*;
import java.util.Random;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/25 10:49
 */
public class Circle {
    static Random generator = new Random();
    private int x, y;
    // coordinates of the corner
    private int radius;
    // color of the circle
    // radius of the circle
    private Color color;

    //---------------------------------------------------------
    // Creates a random circle with properties in ranges given:
    //   -- radius 25..74
    //   -- color RGB value 0..16777215 (24-bit)
    //   -- x-coord of upper left-hand corner 0..599
    //   -- y-coord of upper left-hand corner 0..399
    //---------------------------------------------------------
    public Circle() {
        radius = Math.abs(generator.nextInt()) % 50 + 25;
        color = new Color(Math.abs(generator.nextInt()) % 16777216);
        x = Math.abs(generator.nextInt()) % 600;
        y = Math.abs(generator.nextInt()) % 400;
    }

    //----------------------------------------------------------
    // Creates a circle of a given size (diameter).  Other
    // attributes are random (as described above)
    //---------------------------------------------------------
    public Circle(int size) {
        radius = Math.abs(size / 2);
        color = new Color(Math.abs(generator.nextInt()) % 16777216);
        x = Math.abs(generator.nextInt()) % 600;
        y = Math.abs(generator.nextInt()) % 400;
    }

    //---------------------------------------------------------
    // Draws circle on graphics object given
    //---------------------------------------------------------
    public void draw(Graphics page) {
        page.setColor(color);
        page.fillOval(x, y, radius * 2, radius * 2);
    }
    //--------------------------------------------------------
    // Shifts the circle's position -- "over" is the number of
    // pixels to move horizontally (positive is to the right;

    // negative to the left); "down" is the number of pixels
    // to move vertically (positive is down; negative is up)
    //--------------------------------------------------------
    public void move(int over, int down) {
        x = x + over;
        y = y + down;
    }

    // ---------------------------------------------
    // Return the x coordinate of the circle corner
    // ---------------------------------------------
    public int getX() {
        return x;
    }

    // ---------------------------------------------
    // Return the y coordinate of the circle corner
    // ---------------------------------------------
    public int getY() {
        return y;
    }
}
