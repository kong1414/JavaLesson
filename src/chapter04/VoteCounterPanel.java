package chapter04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/29 19:06
 */
public class VoteCounterPanel extends JPanel {
    private int votesForJoe, votesForSam;
    private JButton joe, sam;
    private JLabel labelJoe, labelSam;

    //----------------------------------------------
    // Constructor: Sets up the GUI.
    //----------------------------------------------
    public VoteCounterPanel() {
        // 投票数
        votesForJoe = 0;

        joe = new JButton("Vote for Joe");
        //对joe这个按钮添加一个事件
        joe.addActionListener(new JoeButtonListener());

        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);

        add(joe);
        add(labelJoe);

        votesForSam = 0;

        sam = new JButton("Vote for Sam");
        sam.addActionListener(new SamButtonListener());

        labelSam = new JLabel("Votes for Sam: " + votesForSam);

        add(sam);
        add(labelSam);

        setPreferredSize(new Dimension(300, 80));
        setBackground(Color.white);
    }

    //***************************************************
    // Represents a listener for button push (action) events
    //***************************************************
    private class JoeButtonListener implements ActionListener {
        //----------------------------------------------
        // Updates the counter and label when Vote for Joe
        // button is pushed
        //----------------------------------------------
        @Override
        public void actionPerformed(ActionEvent event) {
            votesForJoe++;
            labelJoe.setText("Votes for Joe: " + votesForJoe);
        }
    }

    private class SamButtonListener implements ActionListener {
        //----------------------------------------------
        // Updates the counter and label when Vote for Sam
        // button is pushed
        //----------------------------------------------
        @Override
        public void actionPerformed(ActionEvent event) {
            votesForSam++;
            labelSam.setText("Votes for Sam: " + votesForSam);
        }
    }

}
