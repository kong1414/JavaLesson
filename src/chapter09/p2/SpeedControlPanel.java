package chapter09.p2;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/25 10:48
 */
public class SpeedControlPanel extends JPanel {
    private final int WIDTH = 600;
    private final int HEIGHT = 400;
    private final int BALL_SIZE = 50;

    private Circle bouncingBall;
    // the object that moves
    private Timer timer;
    private int moveX, moveY;
    // increment to move each time
    private JSlider slider;
    private JPanel sliderPanel;
    private JLabel jLabel;

    // ---------------------------------------------
    //  Sets up the panel, including the timer
    //  for the animation
    // ---------------------------------------------
    public SpeedControlPanel() {

        timer = new Timer(30, new ReboundListener());
        this.setLayout(new BorderLayout());
        bouncingBall = new Circle(BALL_SIZE);
        moveX = moveY = 5;
        // Set up a slider object here

        jLabel = new JLabel("Timer Delay: " + 30);
        sliderPanel = new JPanel();
        sliderPanel.setLayout(new BorderLayout());
        sliderPanel.add(jLabel, BorderLayout.WEST);
        slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 30);
        sliderPanel.add(slider, BorderLayout.CENTER);
        slider.setMajorTickSpacing(40);
        slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setAlignmentX(Component.LEFT_ALIGNMENT);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                jLabel.setText("Timer Delay: " + slider.getValue());
                timer.setDelay(slider.getValue());
            }
        });
        this.add(sliderPanel, BorderLayout.SOUTH);

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
        timer.start();
    }

    // --------------------
    // Draw the ball
    // --------------------
    @Override
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        bouncingBall.draw(page);
    }

    // ***************************************************
    //   An action listener for the timer
    // ***************************************************
    public class ReboundListener implements ActionListener {
        // ----------------------------------------------------
// actionPerformed is called by the timer -- it updates
        // the position of the bouncing ball
        // ----------------------------------------------------
        @Override
        public void actionPerformed(ActionEvent action) {
            bouncingBall.move(moveX, moveY);

            // change direction if ball hits a side
            int x = bouncingBall.getX();
            int y = bouncingBall.getY();
            if (x < 0 || x >= WIDTH - BALL_SIZE) {
                moveX = moveX * -1;
            }
            if (y <= 0 || y >= HEIGHT - BALL_SIZE) {
                moveY = moveY * -1;
            }
            repaint();
        }
    }
    //
    // private class SlideListener implements ChangeListener {
    //     @Override
    //     public void stateChanged(ChangeEvent event) {
    //         jLabel.setText("Timer Delay: " + slider.getValue());
    //         timer.setDelay(slider.getValue());
    //     }
    // }
}
