package chapter08.p2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/18 10:36
 */
public class DotsPanel extends JPanel implements MouseListener {
    private final int SIZE = 6;
    // radius of each dot

    private ArrayList<Point> pointList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this panel to listen for mouse events.
    //-----------------------------------------------------------------
    public DotsPanel() {
        pointList = new ArrayList<Point>();
        addMouseListener(this);
        setBackground(Color.black);
        setPreferredSize(new Dimension(300, 200));
    }

    //-----------------------------------------------------------------
    //  Draws all of the dots stored in the list.
    //-----------------------------------------------------------------
    @Override
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        page.setColor(Color.green);
        for (Point spot : pointList) {
            page.fillOval(spot.x - SIZE, spot.y - SIZE, SIZE * 2, SIZE * 2);
        }
        page.drawString("Count: " + pointList.size(), 5, 15);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        pointList.add(e.getPoint());
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}


