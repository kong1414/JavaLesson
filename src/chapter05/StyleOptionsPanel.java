package chapter05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/30 11:04
 */
public class StyleOptionsPanel extends JPanel {
    private int fontSize = 36;
    private int style = Font.PLAIN;
    private JLabel saying;
    private JCheckBox bold, italic;

    //-----------------------------------------------------------------
    //  Sets up a panel with a label and some check boxes that
    //  control the style of the label's font.
    //-----------------------------------------------------------------
    public StyleOptionsPanel() {
        saying = new JLabel("Say it with style!");
        saying.setFont(new Font("Helvetica", style, fontSize));

        bold = new JCheckBox("Bold");
        bold.setBackground(Color.cyan);
        italic = new JCheckBox("Italic");
        italic.setBackground(Color.cyan);
        StyleListener listener = new StyleListener();
        bold.addItemListener(listener);
        italic.addItemListener(listener);

        add(saying);
        add(bold);
        add(italic);

        setBackground(Color.cyan);
        setPreferredSize(new Dimension(300, 100));
    }


    //*****************************************************************
    //  Represents the listener for both check boxes.
    //*****************************************************************
    private class StyleListener implements ItemListener {
        //--------------------------------------------------------------
        //  Updates the style of the label font style.
        //--------------------------------------------------------------
        @Override
        public void itemStateChanged(ItemEvent event) {
            style = Font.PLAIN;
            if (bold.isSelected()) {
                style = Font.BOLD;
            }
            if (italic.isSelected()) {
                style += Font.ITALIC;
            }

            saying.setFont(new Font("Helvetica", style, fontSize));
        }
    }

}
