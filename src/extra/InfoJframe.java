package extra;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

/**
 * @Description: 第五章课外题
 * @Author: QiuGuanLin
 * @Date: 2018/5/3 18:00
 */
public class InfoJframe extends JFrame {

    PerInfo perInfo;// 用户信息类
    private JPanel contentPane;
    private JTextField nameTextField;
    private JTextField sexTextField;
    private JTextField addressTextField;
    private JTextField telTextField;
    private JButton btnNewButton;
    private JButton btnNewButton_1;

    /**
     * Create the frame.
     */
    public InfoJframe() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        nameTextField = new JTextField();
        nameTextField.setBounds(116, 40, 110, 21);
        nameTextField.setEditable(false);
        contentPane.add(nameTextField);
        nameTextField.setColumns(10);

        JLabel label = new JLabel("姓名");
        label.setBounds(52, 43, 54, 15);
        contentPane.add(label);

        JLabel label_1 = new JLabel("性别");
        label_1.setBounds(52, 81, 54, 15);
        contentPane.add(label_1);

        sexTextField = new JTextField();
        sexTextField.setEditable(false);
        sexTextField.setBounds(116, 78, 110, 21);
        contentPane.add(sexTextField);
        sexTextField.setColumns(10);

        addressTextField = new JTextField();
        addressTextField.setEditable(false);
        addressTextField.setBounds(116, 117, 110, 21);
        contentPane.add(addressTextField);
        addressTextField.setColumns(10);

        JLabel label_2 = new JLabel("地址");
        label_2.setBounds(52, 120, 54, 15);
        contentPane.add(label_2);

        JLabel label_3 = new JLabel("电话");
        label_3.setBounds(52, 158, 54, 15);
        contentPane.add(label_3);

        telTextField = new JTextField();
        telTextField.setBounds(116, 155, 110, 21);
        telTextField.setEditable(false);
        contentPane.add(telTextField);
        telTextField.setColumns(10);

        btnNewButton = new JButton("读取");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                nameTextField.setEditable(true);
                sexTextField.setEditable(true);
                telTextField.setEditable(true);
                perInfo = PerInfo.getAllFromFile("D:/1.txt");
                nameTextField.setText(perInfo.getName());
                sexTextField.setText(perInfo.getSex());
                addressTextField.setText(perInfo.getAddress());
                telTextField.setText(perInfo.getTel());
                btnNewButton_1.setEnabled(true);
            }
        });
        btnNewButton.setBounds(260, 56, 93, 23);
        contentPane.add(btnNewButton);

        btnNewButton_1 = new JButton("保存");
        btnNewButton_1.setEnabled(false);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                // 通过正则判断手机号是否合法
                String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
                Pattern p = Pattern.compile(regExp);
                Matcher m = p.matcher(telTextField.getText());
                if (m.matches()) {
                    System.out.println("手机号合法");
                } else {
                    System.out.println("手机号不合法");
                    JOptionPane.showMessageDialog(null, "手机号不合法");
                    return;
                }
                //如果不想验证手机号时候合法就删掉上面的代码
                perInfo.setName(nameTextField.getText());
                perInfo.setSex(sexTextField.getText());
                perInfo.setTel(telTextField.getText());
                if (PerInfo.setAllFromFile(perInfo, "D:/1.txt") == 0) {
                    JOptionPane.showMessageDialog(null, "保存成功");
                }

            }
        });
        btnNewButton_1.setBounds(260, 131, 93, 23);
        contentPane.add(btnNewButton_1);
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    InfoJframe frame = new InfoJframe();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
