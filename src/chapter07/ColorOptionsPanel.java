package chapter07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/4 10:35
 */
public class ColorOptionsPanel extends JPanel {
    private final int WIDTH = 350, HEIGHT = 100, FONT_SIZE = 20;
    private final int NUM_COLORS = 5;
    private Color[] color = new Color[NUM_COLORS];
    private JLabel heading;
    private JRadioButton[] colorButton = new JRadioButton[NUM_COLORS];

    // ------------------------------------------------------------------
    //  Sets up a panel with a label at the top and a set of radio buttons
    //  that control the background color of the panel.
    // ------------------------------------------------------------------
    public ColorOptionsPanel() {
        // Set up heading and colors
        heading = new JLabel("Choose the background color!");
        heading.setFont(new Font("Helvetica", Font.BOLD, FONT_SIZE));

        color[0] = Color.yellow;
        color[1] = Color.cyan;
        color[2] = Color.red;
        color[3] = Color.green;
        color[4] = Color.magenta;

        // Instantiate a ButtonGroup object and a ColorListener object
        ButtonGroup buttonGroup = new ButtonGroup();
        ColorListener colorListener = new ColorListener();

        colorButton[0] = new JRadioButton("yellow");
        colorButton[1] = new JRadioButton("cyan");
        colorButton[2] = new JRadioButton("red");
        colorButton[3] = new JRadioButton("green");
        colorButton[4] = new JRadioButton("magenta");

        for (int i = 0; i < NUM_COLORS; i++) {
            colorButton[i].addActionListener(colorListener);
            buttonGroup.add(colorButton[i]);
            this.add(colorButton[i]);
        }

        // Set up the panel
        add(heading);
        setBackground(Color.yellow);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        // Group the radio buttons, add a ColorListener to each,
        // set the background color of each and add each to the panel.
        this.setBackground(Color.white);
    }

    // **************************************************************
    //   Represents the listener for the radio buttons.
    // **************************************************************
    private class ColorListener implements ActionListener {
        // --------------------------------------------------------
        //  Updates the background color of the panel based on
        //  which radio button is selected.
        // --------------------------------------------------------
        @Override
        public void actionPerformed(ActionEvent event) {
            Object source = event.getSource();
            for (int i = 0; i < color.length; i++) {
                if (source == colorButton[i]) {
                    setBackground(color[i]);
                    break;
                }
            }
        }
    }
}