package com.example.simATM;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageFilter;
import java.util.Scanner;
import java.net.URL;

public class GUI_simATM{

    private JFrame frame1;
    private JFrame frame2;
    JTextField textField;

    private MyFrame frame;

    public GUI_simATM(){

        frame = new MyFrame("simulated ATM");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(350,180,800,600);
        frame.setVisible(true);
    //    initialize();
    }

    public void mainFrame(){
        frame1.dispose();

        // 初始化窗体
        frame2 = new JFrame("ATM machine");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setBounds(350,180,800,600);
        frame2.getContentPane().setLayout(null);

        Container contentPane = frame2.getContentPane();
        contentPane.setLayout(new FlowLayout());

        // 设置背景
/*
        JPanel panel = new JPanel();
        URL resource2 = this.getClass().getResource("ATM.jpg");
        ImageIcon icon2 = new ImageIcon(resource2);
        JLabel background = new JLabel();
        background.setIcon(icon2);
        background.setBounds(0,0,icon2.getIconWidth(),icon2.getIconHeight());
        contentPane.add(background);*/

        // 按钮1
        JButton button1 = new JButton();
        button1.setText("test");
        button1.setBounds(450,190,100,60);
        button1.setFont(new Font("Consolas",Font.BOLD,30));
        button1.setBackground(new Color(0,199,22));
        button1.setOpaque(true);
        contentPane.add(button1);

        // 按钮2

        JButton button2 = new JButton("AD!");
        button2.setBounds(300,190,40,30);
        button2.setFont(new Font("Consolas",Font.BOLD,10));
        button2.setBackground(new Color(0,173,232));
        button2.setOpaque(true);
        contentPane.add(button2);

        // 菜单显示
        JLabel text = new JLabel("Main menu\n" +
                "1: check balance\n" +
                "2: withdraw\n" +
                "3: deposit\n" +
                "4: transfer\n" +
                "5: exit\n");
        text.setBounds(304,200,400,250);
        text.setForeground(new Color(100,15,250));
        text.setFont(new Font("Consolas",Font.BOLD,50));
        contentPane.add(text);

        // 用户输入
        JTextField textfield = new JTextField(16);
        JButton button3 = new JButton("Enter");
        contentPane.add(textfield);
        contentPane.add(button3);

        button3.addActionListener(e -> {
            onButtonOK();
        });

        frame2.setVisible(true);
    }

    private void onButtonOK(){
        String str = textField.getText();
       // JOptionPane.showMessageDialog(this,"input "+str);
    }


    private void initialize(){
        // 初始化窗体
        frame1 = new JFrame("ATM machine");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setBounds(100,100,1200,757);
        frame1.getContentPane().setLayout(null);

        // 设置背景
        JLabel background = new JLabel();
        URL resource = this.getClass().getResource("Row-of-ATMs.jpg");
        ImageIcon icon = new ImageIcon(resource);
        background.setIcon(icon);
        background.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
        frame1.getContentPane().add(background);

        // 按钮1
        JButton button1 = new JButton("GO AHEAD!");
        button1.setBounds(500,350,200,100);
        Font f = new Font("Consolas",Font.BOLD,30);
        button1.setFont(f);
        button1.setBackground(new Color(0,173,232));
        button1.setOpaque(true);
        button1.setBorderPainted(false);
        frame1.getContentPane().add(button1);

        button1.addActionListener(e -> {
            System.out.println("Pressing..");
            GUI_simATM.this.mainFrame();
        });

        frame1.setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUI_simATM window = new GUI_simATM();
            }
        });
    }
}
