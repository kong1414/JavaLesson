package extra;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Description: 第三章补充实验
 * @Author: QiuGuanLin
 * @Date: 2018/3/29 18:44
 */
public class MyJframe extends JFrame {

    private JPanel contentPane;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel usernameLabel;
    private JLabel passwordlabel;
    private JButton loginButton;
    private JButton emptyButton;

    /**
     * Create the frame.
     */
    public MyJframe() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        passwordField = new JPasswordField();
        passwordField.setBounds(186, 115, 120, 30);

        usernameField = new JTextField();
        usernameField.setBounds(186, 75, 120, 30);
        usernameField.setColumns(10);
        contentPane.setLayout(null);
        contentPane.add(passwordField);
        contentPane.add(usernameField);

        usernameLabel = new JLabel("用户名");
        usernameLabel.setFont(new Font("宋体", Font.PLAIN, 14));
        usernameLabel.setBounds(126, 75, 50, 30);
        contentPane.add(usernameLabel);

        passwordlabel = new JLabel("密 码");
        passwordlabel.setFont(new Font("宋体", Font.PLAIN, 14));
        passwordlabel.setBounds(126, 115, 50, 30);
        contentPane.add(passwordlabel);

        loginButton = new JButton("登录");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 声明账户密码
                String username = "admin";
                String password = "123456";
                // 获取文本框的内容
                String u = usernameField.getText();
                // 由于密码框获取的内容是字符数组需要转型成String才能比较
                String p = new String(passwordField.getPassword());

                if (username.equals(u) && password.equals(p)) {
                    System.out.println("登录成功");
                    // 调用swing里的弹窗函数传入参数
                    JOptionPane.showMessageDialog(null, "恭喜您，登录成功！！！");
                } else {
                    JOptionPane.showMessageDialog(null, "登录失败！");
                }
            }
        });
        loginButton.setBounds(114, 201, 93, 23);
        contentPane.add(loginButton);

        emptyButton = new JButton("清空");
        emptyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                usernameField.setText(null);
                passwordField.setText(null);
            }
        });
        emptyButton.setBounds(225, 201, 93, 23);
        contentPane.add(emptyButton);
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MyJframe frame = new MyJframe();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
