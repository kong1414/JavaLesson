package chapter04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/29 19:23
 */
public class BMIPanel extends JPanel {
    private int WIDTH = 300;
    private int HEIGHT = 120;

    private JLabel heightLabel, weightLabel, BMILabel, resultLabel;
    private JTextField height, weight;
    private JButton calculate;

    //-----------------------------------------------------------------
    //  Sets up the GUI.
    //-----------------------------------------------------------------
    public BMIPanel() {

        //create labels for the height and weight textfields
        heightLabel = new JLabel("Your height in cm: ");
        weightLabel = new JLabel("Your weight in kg: ");

        //create a "this is your BMI" label
        BMILabel = new JLabel("Your BMI is: ");
        //create a result label to hold the BMI value
        resultLabel = new JLabel("Your BMI value is: ");
        //create a JTextField to hold the person's height in inches
        height = new JTextField(5);
        //create a JTextField to hold the person's weight in pounds
        weight = new JTextField(5);
        //create a button to press to calculate BMI
        calculate = new JButton("calculate BMI");
        //create a BMIListener and make it listen for the button to be pressed
        calculate.addActionListener(new BMIListener());
        add(Box.createHorizontalStrut(30000));

        //add the height label and height textfield to the panel
        add(heightLabel);
        add(height);
        add(Box.createHorizontalStrut(30000));

        //add the weight label and weight textfield to the panel
        add(weightLabel);
        add(weight);
        add(Box.createHorizontalStrut(30000));

        //add the button to the panel
        add(calculate);
        add(Box.createHorizontalStrut(30000));
        //add the BMI label to the panel
        add(BMILabel);
        add(Box.createHorizontalStrut(30000));

        //add the label that holds the result to the panel
        add(resultLabel);
        //set the size of the panel to the WIDTH and HEIGHT constants
        setPreferredSize(new Dimension(300, 240));
        //set the color of the panel to whatever you choose
        setBackground(Color.white);
    }

    //*****************************************************************
    //  Represents an action listener for the calculate button.
    //*****************************************************************
    private class BMIListener implements ActionListener {
        //--------------------------------------------------------------
        //  Compute the BMI when the button is pressed
        //--------------------------------------------------------------
        @Override
        public void actionPerformed(ActionEvent event) {
            String heightText, weightText;
            String value = "";
            int heightVal, weightVal;
            double bmi;
            DecimalFormat fmt = new DecimalFormat("0.#");
            //get the text from the height and weight textfields
            heightText = height.getText();
            weightText = weight.getText();
            //Use Integer.parseInt to convert the text to integer values
            heightVal = Integer.parseInt(heightText);
            weightVal = Integer.parseInt(weightText);
            //Calculate the bmi = 703 * weight in pounds / (height in inches)^2
            bmi = 10000.0 * weightVal / (heightVal * heightVal);
            //Put result in result label.  Use Double.toString to convert double to string.

            BMILabel.setText("Your BMI is: " + fmt.format(bmi));

            if (bmi < 18.5) {
                value = "Underweight";
            } else if (bmi < 24) {
                value = "Normal range";
            } else if (bmi < 27) {
                value = "Overweight ";
            } else if (bmi < 30) {
                value = "Mild obesity";
            } else if (bmi < 35) {
                value = "Moderate obesity";
            } else {
                value = "Severe obesity";
            }

            resultLabel.setText("Your BMI value is: " + value);

        }
    }

}
