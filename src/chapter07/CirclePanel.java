package chapter07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/4 11:03
 */
public class CirclePanel extends JPanel {
    private final int WIDTH = 600, HEIGHT = 400;
    private Circle circle;

    //----------------------------------------------------------------
    // Sets up this panel to listen for mouse events. //----------------------------------------------------------------
    public CirclePanel() {
        addMouseListener(new CirclesListener());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    //----------------------------------------------------------------
    // Draws the current circle, if any.
    //----------------------------------------------------------------
    @Override
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        if (circle != null) {
            circle.draw(page);
        }
    }

    //*****************************************************************
    // Represents the listener for mouse events.
    //*****************************************************************
    private class CirclesListener implements MouseListener {
        //-------------------------------------------------------------
        // Creates a new circle at the current location whenever the
        // mouse button is pressed and repaints.
        //-------------------------------------------------------------
        @Override
        public void mousePressed(MouseEvent event) {
            if (circle == null) {
                circle = new Circle(event.getPoint());
            } else {
                if (circle.isInside(event.getPoint())) {
                    circle = null;
                } else {
                    circle.move(event.getPoint());
                }
            }
            repaint();
        }

        //----------------------------------------------------------------
        // Provide empty definitions for unused event methods. //----------------------------------------------------------------
        @Override
        public void mouseClicked(MouseEvent event) {
        }

        @Override
        public void mouseReleased(MouseEvent event) {
        }

        @Override
        public void mouseEntered(MouseEvent event) {
        }

        @Override
        public void mouseExited(MouseEvent event) {
        }
    }
}