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
    JTextField textField;

    private MyFrame frame;
    private MyFrame menu;

    public void MenuPage(int id){
        frame.setVisible(false);
        menu = new MyFrame("simulated ATM","ATM2.jpg");
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setBounds(350,180,800,600);
        menu.setVisible(true);

        // 然后菜单显示
        JLabel text = new JLabel("Main menu");
        JLabel text1 = new JLabel("check balance");//1
        JLabel text2 = new JLabel("withdraw");//2
        JLabel text3 = new JLabel("deposit");//3
        JLabel text4 = new JLabel("transfer");//4
        JLabel text5 = new JLabel("exit");//5
        text.setBounds(188,90,200,100);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Consolas",Font.BOLD,40));
        text1.setBounds(163,135,200,100);
        text1.setForeground(Color.WHITE);
        text1.setFont(new Font("Consolas",Font.BOLD,15));
        text2.setBounds(350,135,200,100);
        text2.setForeground(Color.WHITE);
        text2.setFont(new Font("Consolas",Font.BOLD,15));
        text3.setBounds(163,180,200,100);
        text3.setForeground(Color.WHITE);
        text3.setFont(new Font("Consolas",Font.BOLD,15));
        text4.setBounds(350,180,200,100);
        text4.setForeground(Color.WHITE);
        text4.setFont(new Font("Consolas",Font.BOLD,15));
        text5.setBounds(170,230,200,100);
        text5.setForeground(Color.WHITE);
        text5.setFont(new Font("Consolas",Font.BOLD,15));
        menu.add(text);
        menu.add(text1);
        menu.add(text2);
        menu.add(text3);
        menu.add(text4);
        menu.add(text5);

    }

    public GUI_simATM(){

        frame = new MyFrame("simulated ATM","ATM2.jpg");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(350,180,800,600);
        frame.setVisible(true);
        // 先登录

        JLabel loginmsg = new JLabel("Enter an id");
        loginmsg.setBounds(220,150,200,100);
        loginmsg.setForeground(Color.WHITE);
        loginmsg.setFont(new Font("Consolas",Font.BOLD,20));
        frame.add(loginmsg);

        JButton button1 = new JButton();
        button1.setText("0");
        button1.setBounds(190,355,40,25);
        button1.setFont(new Font("Consolas",Font.BOLD,10));
        button1.setBackground(new Color(233,239,200));
        button1.setOpaque(true);
        frame.add(button1);
        button1.addActionListener(e -> {
            GUI_simATM.this.MenuPage(0);
        });


        JButton button2 = new JButton();
        button2.setText("1");
        button2.setBounds(230,355,40,25);
        button2.setFont(new Font("Consolas",Font.BOLD,10));
        button2.setBackground(new Color(233,239,200));
        button2.setOpaque(true);
        frame.add(button2);
        button2.addActionListener(e -> {
            GUI_simATM.this.MenuPage(1);
        });


        JButton button3 = new JButton();
        button3.setText("2");
        button3.setBounds(270,355,40,25);
        button3.setFont(new Font("Consolas",Font.BOLD,10));
        button3.setBackground(new Color(233,239,200));
        button3.setOpaque(true);
        frame.add(button3);
        button3.addActionListener(e -> {
            GUI_simATM.this.MenuPage(2);
        });


        JButton button4 = new JButton();
        button4.setText("3");
        button4.setBounds(175,380,40,25);
        button4.setFont(new Font("Consolas",Font.BOLD,10));
        button4.setBackground(new Color(233,239,200));
        button4.setOpaque(true);
        frame.add(button4);
        button4.addActionListener(e -> {
            GUI_simATM.this.MenuPage(3);
        });


        JButton button5 = new JButton();
        button5.setText("4");
        button5.setBounds(215,380,40,25);
        button5.setFont(new Font("Consolas",Font.BOLD,10));
        button5.setBackground(new Color(233,239,200));
        button5.setOpaque(true);
        frame.add(button5);
        button5.addActionListener(e -> {
            GUI_simATM.this.MenuPage(4);
        });


        JButton button6 = new JButton();
        button6.setText("5");
        button6.setBounds(255,380,40,25);
        button6.setFont(new Font("Consolas",Font.BOLD,10));
        button6.setBackground(new Color(233,239,200));
        button6.setOpaque(true);
        frame.add(button6);
        button6.addActionListener(e -> {
            GUI_simATM.this.MenuPage(5);
        });


        JButton button7 = new JButton();
        button7.setText("6");
        button7.setBounds(150,405,40,25);
        button7.setFont(new Font("Consolas",Font.BOLD,10));
        button7.setBackground(new Color(233,239,200));
        button7.setOpaque(true);
        frame.add(button7);
        button7.addActionListener(e -> {
            GUI_simATM.this.MenuPage(6);
        });

        JButton button8 = new JButton();
        button8.setText("7");
        button8.setBounds(190,405,40,25);
        button8.setFont(new Font("Consolas",Font.BOLD,10));
        button8.setBackground(new Color(233,239,200));
        button8.setOpaque(true);
        frame.add(button8);
        button8.addActionListener(e -> {
            GUI_simATM.this.MenuPage(7);
        });

        JButton button9 = new JButton();
        button9.setText("8");
        button9.setBounds(230,405,40,25);
        button9.setFont(new Font("Consolas",Font.BOLD,10));
        button9.setBackground(new Color(233,239,200));
        button9.setOpaque(true);
        frame.add(button9);
        button9.addActionListener(e -> {
            GUI_simATM.this.MenuPage(8);
        });

        JButton button10 = new JButton();
        button10.setText("9");
        button10.setBounds(175,430,40,25);
        button10.setFont(new Font("Consolas",Font.BOLD,10));
        button10.setBackground(new Color(233,239,200));
        button10.setOpaque(true);
        frame.add(button10);
        button10.addActionListener(e -> {
            GUI_simATM.this.MenuPage(9);
        });





        // 读取输入

        // 进行操作

    //    initialize();
    }

//    public void mainFrame(){
//        frame1.dispose();
//
//        // 初始化窗体
//        frame2 = new JFrame("ATM machine");
//        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame2.setBounds(350,180,800,600);
//        frame2.getContentPane().setLayout(null);
//
//        Container contentPane = frame2.getContentPane();
//        contentPane.setLayout(new FlowLayout());
//
//        // 按钮1
//        JButton button1 = new JButton();
//        button1.setText("test");
//        button1.setBounds(450,190,100,60);
//        button1.setFont(new Font("Consolas",Font.BOLD,30));
//        button1.setBackground(new Color(0,199,22));
//        button1.setOpaque(true);
//        contentPane.add(button1);
//
//        // 按钮2
//
//        JButton button2 = new JButton("AD!");
//        button2.setBounds(300,190,40,30);
//        button2.setFont(new Font("Consolas",Font.BOLD,10));
//        button2.setBackground(new Color(0,173,232));
//        button2.setOpaque(true);
//        contentPane.add(button2);
//
//        // 菜单显示
//        JLabel text = new JLabel("Main menu\n" +
//                "1: check balance\n" +
//                "2: withdraw\n" +
//                "3: deposit\n" +
//                "4: transfer\n" +
//                "5: exit\n");
//        text.setBounds(304,200,400,250);
//        text.setForeground(new Color(100,15,250));
//        text.setFont(new Font("Consolas",Font.BOLD,50));
//        contentPane.add(text);
//
//        // 用户输入
//        JTextField textfield = new JTextField(16);
//        JButton button3 = new JButton("Enter");
//        contentPane.add(textfield);
//        contentPane.add(button3);
//
//        button3.addActionListener(e -> {
//            onButtonOK();
//        });
//
//        frame2.setVisible(true);
//    }

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
           // GUI_simATM.this.mainFrame();
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
