package chapter06;

import javax.swing.*;
import java.awt.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/4/8 11:20
 */
public class TelephonePanel extends JPanel {
    public TelephonePanel() {
        //set BorderLayout for this panel
        this.setLayout(new BorderLayout());

        //create a JLabel with "Your Telephone" title
        JLabel NameJLabel = new JLabel("My Telephone");

        //add title label to north of this panel
        this.add(NameJLabel, BorderLayout.NORTH);
        //create panel to hold keypad and give it a 4x3 GridLayout
        JPanel keypadPanel = new JPanel(new GridLayout(4, 3));
        //add buttons representing keys to key panel

        //add key panel to center of this panel
    }

}