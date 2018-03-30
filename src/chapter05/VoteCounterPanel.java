package chapter05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/30 10:50
 */
public class VoteCounterPanel extends JPanel {
    private int votesForJoe;
    private JButton joe;
    private JLabel labelJoe;
    private int votesForSam;
    private JButton sam;
    private JLabel labelSam;
    private JButton js;
    private JLabel labelJs;

    //----------------------------------------------
    // Constructor: Sets up the GUI.
    //----------------------------------------------
    public VoteCounterPanel() {
        votesForJoe = 0;
        votesForSam = 0;
        joe = new JButton("Vote for Joe");
        sam = new JButton("Vote for Sam");
        joe.addActionListener(new VoteButtonListener());
        sam.addActionListener(new VoteButtonListener());
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        add(joe);
        add(labelJoe);
        add(sam);
        add(labelSam);
        js = new JButton("统 计 结 果 :");
        labelJs = new JLabel("                ");
        add(js);
        add(labelJs);
        js.addActionListener(new VoteButtonListener());
        setPreferredSize(new Dimension(300, 120));
        setBackground(Color.orange);
    }

    //***************************************************
    // Represents a listener for button push (action) events
    //***************************************************
    private class VoteButtonListener implements ActionListener {
        //----------------------------------------------
        // Updates the appropriate vote counter when a
        // button is pushed for one of the candidates.
        //----------------------------------------------
        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == joe) {
                votesForJoe++;
                labelJoe.setText("Votes for Joe: " + votesForJoe);
            } else if (event.getSource() == sam) {
                votesForSam++;
                labelSam.setText("Votes for Sam: " + votesForSam);
            } else if (event.getSource() == js) {
                if (votesForJoe > votesForSam) {
                    labelJs.setText("Joe win !");
                } else if (votesForJoe < votesForSam) {
                    labelJs.setText("Sam win !");
                } else {
                    labelJs.setText("Tie !");
                }

            }
        }

    }

}
