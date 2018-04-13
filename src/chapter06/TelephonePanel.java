package chapter06;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/4/8 11:20
 */
public class TelephonePanel extends JPanel {

    JPanel keypadPanel;
    private JButton[] button;

    public TelephonePanel() {
        //set BorderLayout for this panel
        this.setLayout(new BorderLayout());

        //create a JLabel with "Your Telephone" title
        JLabel NameJLabel = new JLabel("My Telephone");

        JPanel title = new JPanel();
        title.add(NameJLabel);

        //add title label to north of this panel
        this.add(title, BorderLayout.NORTH);
        //create panel to hold keypad and give it a 4x3 GridLayout
        keypadPanel = new JPanel(new GridLayout(4, 3));
        //add buttons representing keys to key panel

        String name[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
        button = new JButton[name.length];

        for (int i = 0; i < name.length; i++) {
            button[i] = new JButton(name[i]);
            button[i].setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            button[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            button[i].setPreferredSize(new Dimension(5, 35));
            // button[i].addActionListener();
            keypadPanel.add(button[i]);
        }


        //add key panel to center of this panel
        this.add(keypadPanel, BorderLayout.CENTER);
    }

}