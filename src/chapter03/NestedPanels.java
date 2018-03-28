package chapter03;

import javax.swing.*;
import java.awt.*;

/**
 * @Description: Demonstrates a basic component hierarchy.
 * @Author: QiuGuanLin
 * @Date: 2018/3/28 21:32
 */
public class NestedPanels {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nested Panels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set up first subpanel
        // 实例化一个Jpanel容器
        JPanel subPanel1 = new JPanel();
        // 设置宽高
        subPanel1.setPreferredSize(new Dimension(150, 100));
        // 设置背景样式
        subPanel1.setBackground(Color.green);
        // 声明一个JLabel标签 用来放文字
        JLabel label1 = new JLabel("One");
        // 将JLabel标签 添加到 JPanel类型的subPanel1里
        subPanel1.add(label1);

        // Set up second subpanel
        JPanel subPanel2 = new JPanel();
        subPanel2.setPreferredSize(new Dimension(150, 100));
        subPanel2.setBackground(Color.red);
        JLabel label2 = new JLabel("Two");
        subPanel2.add(label2);
        // Set up primary panel 声明一个基本面板
        JPanel primary = new JPanel();
        // 设置基本面板的背景颜色
        primary.setBackground(Color.blue);


        // 设置第三个子面板
        JPanel subPanel3 = new JPanel();
        subPanel3.setPreferredSize(new Dimension(300, 100));
        subPanel3.setBackground(Color.orange);
        JLabel label3 = new JLabel("Three");
        subPanel3.add(label3);
        // 将该子面板添加到基本面板
        // primary.add(subPanel3);

        // 现在增加另一个背景为蓝色,
        // 大小为320*20的面板,
        // 添加一个显示"My Panels"的label到该面板中
        JPanel primary2 = new JPanel();
        primary2.setPreferredSize(new Dimension(320, 20));
        primary2.setBackground(Color.blue);
        primary2.add(new JLabel("My Panels"));

        primary.add(primary2);

        // 往基本面板里加定义好的JPanel容器
        primary.add(subPanel1);
        primary.add(subPanel2);

        //先获得JFrame的内容面板，在添加primary
        frame.getContentPane().add(primary);
        // frame.pack()函数的作用根据窗口里面的布局及组件的preferedSize来确定frame的最佳大小
        frame.pack();
        //设置frame可见
        frame.setVisible(true);
        // 将面板大小设置为320*260
        frame.setSize(320, 260);
    }

}
