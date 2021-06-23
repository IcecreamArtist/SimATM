package com.example.simATM;

import java.awt.*;
import javax.swing.*;
import java.net.URL;

public class GUI_simATM{

    private MyFrame frame;
    private MyFrame menu;
    private MyFrame trans;
    private MyFrame start;

    int ans;

    static Account[] accounts = new Account[10];

    public void getbalance(int id){

        menu.setVisible(false);
        MyFrame tmp = new MyFrame("get balance","ATM2.jpg");
        tmp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tmp.setBounds(350,180,800,600);
        tmp.setVisible(true);


        String msg = "The balance is ";
        JLabel text = new JLabel(msg);
        text.setBounds(198,170,200,100);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Consolas",Font.BOLD,20));
        tmp.add(text);

        String msg2 = "" + accounts[id].getBalance();
        JLabel text2 = new JLabel(msg2);
        text2.setBounds(250,200,200,100);
        text2.setForeground(Color.WHITE);
        text2.setFont(new Font("Consolas",Font.BOLD,20));
        tmp.add(text2);

        JLabel text3 = new JLabel("exit");
        text3.setBounds(170,230,200,100);
        text3.setForeground(Color.WHITE);
        text3.setFont(new Font("Consolas",Font.BOLD,15));
        tmp.add(text3);

        JButton button1 = new JButton();
        button1.setText("");
        button1.setBounds(105,260,40,38);
        button1.setBackground(Color.LIGHT_GRAY);
        button1.setOpaque(true);
        tmp.add(button1);

        tmp.setVisible(true);
        button1.addActionListener(e -> {
            tmp.setVisible(false);
            menu.setVisible(true);
        });

    }

    public void withdraw(int id){

        menu.setVisible(false);
        MyFrame tmp = new MyFrame("withdraw","ATM2.jpg");
        tmp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tmp.setBounds(350,180,800,600);
        tmp.setVisible(true);


        String msg = "Enter an amount";
        JLabel text = new JLabel(msg);
        text.setBounds(188,170,300,100);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Consolas",Font.BOLD,25));
        tmp.add(text);

        String msg2 = "to withdraw";
        JLabel text2 = new JLabel(msg2);
        text2.setBounds(212,200,200,100);
        text2.setForeground(Color.WHITE);
        text2.setFont(new Font("Consolas",Font.BOLD,25));
        tmp.add(text2);

        ans = 0;

        JButton button1 = new JButton();
        button1.setText("0");
        button1.setBounds(190, 355, 40, 25);
        button1.setFont(new Font("Consolas", Font.BOLD, 10));
        button1.setBackground(Color.GRAY);
        button1.setOpaque(true);
        tmp.add(button1);
        button1.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+0;
        });

        JButton button2 = new JButton();
        button2.setText("1");
        button2.setBounds(230, 355, 40, 25);
        button2.setFont(new Font("Consolas", Font.BOLD, 10));
        button2.setBackground(Color.GRAY);
        button2.setOpaque(true);
        tmp.add(button2);
        button2.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+1;
        });


        JButton button3 = new JButton();
        button3.setText("2");
        button3.setBounds(270, 355, 40, 25);
        button3.setFont(new Font("Consolas", Font.BOLD, 10));
        button3.setBackground(Color.GRAY);
        button3.setOpaque(true);
        tmp.add(button3);
        button3.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+2;
        });


        JButton button4 = new JButton();
        button4.setText("3");
        button4.setBounds(175, 380, 40, 25);
        button4.setFont(new Font("Consolas", Font.BOLD, 10));
        button4.setBackground(Color.GRAY);
        button4.setOpaque(true);
        tmp.add(button4);
        button4.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+3;
        });


        JButton button5 = new JButton();
        button5.setText("4");
        button5.setBounds(215, 380, 40, 25);
        button5.setFont(new Font("Consolas", Font.BOLD, 10));
        button5.setBackground(Color.GRAY);
        button5.setOpaque(true);
        tmp.add(button5);
        button5.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+4;
        });


        JButton button6 = new JButton();
        button6.setText("5");
        button6.setBounds(255, 380, 40, 25);
        button6.setFont(new Font("Consolas", Font.BOLD, 10));
        button6.setBackground(Color.GRAY);
        button6.setOpaque(true);
        tmp.add(button6);
        button6.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+5;
        });


        JButton button7 = new JButton();
        button7.setText("6");
        button7.setBounds(150, 405, 40, 25);
        button7.setFont(new Font("Consolas", Font.BOLD, 10));
        button7.setBackground(Color.GRAY);
        button7.setOpaque(true);
        tmp.add(button7);
        button7.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+6;
        });

        JButton button8 = new JButton();
        button8.setText("7");
        button8.setBounds(190, 405, 40, 25);
        button8.setFont(new Font("Consolas", Font.BOLD, 10));
        button8.setBackground(Color.GRAY);
        button8.setOpaque(true);
        tmp.add(button8);
        button8.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+7;
        });

        JButton button9 = new JButton();
        button9.setText("8");
        button9.setBounds(230, 405, 40, 25);
        button9.setFont(new Font("Consolas", Font.BOLD, 10));
        button9.setBackground(Color.GRAY);
        button9.setOpaque(true);
        tmp.add(button9);
        button9.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+8;
        });

        JButton button10 = new JButton();
        button10.setText("9");
        button10.setBounds(175, 430, 40, 25);
        button10.setFont(new Font("Consolas", Font.BOLD, 10));
        button10.setBackground(Color.GRAY);
        button10.setOpaque(true);
        tmp.add(button10);
        button10.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+9;
        });

        JButton button11 = new JButton();
        button11.setText("CLEAR");
        button11.setBounds(315, 365, 80, 45);
        button11.setFont(new Font("Consolas", Font.PLAIN, 15));
        button11.setBackground(Color.GRAY);
        button11.setOpaque(true);
        tmp.add(button11);
        button11.addActionListener(e -> {
            GUI_simATM.this.ans = 0;
        });

        JButton button12 = new JButton();
        button12.setText("ENTER");
        button12.setBounds(275, 410, 80, 45);
        button12.setFont(new Font("Consolas", Font.PLAIN, 15));
        button12.setBackground(Color.GRAY);
        button12.setOpaque(true);
        tmp.add(button12);
        button12.addActionListener(e -> {
            accounts[id].withdraw(ans);
            tmp.setVisible(false);
            menu.setVisible(true);
        });
    }

    public void deposit(int id){

        menu.setVisible(false);
        MyFrame tmp = new MyFrame("withdraw","ATM2.jpg");
        tmp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tmp.setBounds(350,180,800,600);
        tmp.setVisible(true);


        String msg = "Enter an amount";
        JLabel text = new JLabel(msg);
        text.setBounds(188,170,300,100);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Consolas",Font.BOLD,25));
        tmp.add(text);

        String msg2 = "to deposit";
        JLabel text2 = new JLabel(msg2);
        text2.setBounds(212,200,200,100);
        text2.setForeground(Color.WHITE);
        text2.setFont(new Font("Consolas",Font.BOLD,25));
        tmp.add(text2);

        ans = 0;

        JButton button1 = new JButton();
        button1.setText("0");
        button1.setBounds(190, 355, 40, 25);
        button1.setFont(new Font("Consolas", Font.BOLD, 10));
        button1.setBackground(Color.GRAY);
        button1.setOpaque(true);
        tmp.add(button1);
        button1.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+0;
        });

        JButton button2 = new JButton();
        button2.setText("1");
        button2.setBounds(230, 355, 40, 25);
        button2.setFont(new Font("Consolas", Font.BOLD, 10));
        button2.setBackground(Color.GRAY);
        button2.setOpaque(true);
        tmp.add(button2);
        button2.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+1;
        });


        JButton button3 = new JButton();
        button3.setText("2");
        button3.setBounds(270, 355, 40, 25);
        button3.setFont(new Font("Consolas", Font.BOLD, 10));
        button3.setBackground(Color.GRAY);
        button3.setOpaque(true);
        tmp.add(button3);
        button3.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+2;
        });


        JButton button4 = new JButton();
        button4.setText("3");
        button4.setBounds(175, 380, 40, 25);
        button4.setFont(new Font("Consolas", Font.BOLD, 10));
        button4.setBackground(Color.GRAY);
        button4.setOpaque(true);
        tmp.add(button4);
        button4.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+3;
        });


        JButton button5 = new JButton();
        button5.setText("4");
        button5.setBounds(215, 380, 40, 25);
        button5.setFont(new Font("Consolas", Font.BOLD, 10));
        button5.setBackground(Color.GRAY);
        button5.setOpaque(true);
        tmp.add(button5);
        button5.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+4;
        });


        JButton button6 = new JButton();
        button6.setText("5");
        button6.setBounds(255, 380, 40, 25);
        button6.setFont(new Font("Consolas", Font.BOLD, 10));
        button6.setBackground(Color.GRAY);
        button6.setOpaque(true);
        tmp.add(button6);
        button6.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+5;
        });


        JButton button7 = new JButton();
        button7.setText("6");
        button7.setBounds(150, 405, 40, 25);
        button7.setFont(new Font("Consolas", Font.BOLD, 10));
        button7.setBackground(Color.GRAY);
        button7.setOpaque(true);
        tmp.add(button7);
        button7.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+6;
        });

        JButton button8 = new JButton();
        button8.setText("7");
        button8.setBounds(190, 405, 40, 25);
        button8.setFont(new Font("Consolas", Font.BOLD, 10));
        button8.setBackground(Color.GRAY);
        button8.setOpaque(true);
        tmp.add(button8);
        button8.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+7;
        });

        JButton button9 = new JButton();
        button9.setText("8");
        button9.setBounds(230, 405, 40, 25);
        button9.setFont(new Font("Consolas", Font.BOLD, 10));
        button9.setBackground(Color.GRAY);
        button9.setOpaque(true);
        tmp.add(button9);
        button9.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+8;
        });

        JButton button10 = new JButton();
        button10.setText("9");
        button10.setBounds(175, 430, 40, 25);
        button10.setFont(new Font("Consolas", Font.BOLD, 10));
        button10.setBackground(Color.GRAY);
        button10.setOpaque(true);
        tmp.add(button10);
        button10.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+9;
        });

        JButton button11 = new JButton();
        button11.setText("CLEAR");
        button11.setBounds(315, 365, 80, 45);
        button11.setFont(new Font("Consolas", Font.PLAIN, 15));
        button11.setBackground(Color.GRAY);
        button11.setOpaque(true);
        tmp.add(button11);
        button11.addActionListener(e -> {
            GUI_simATM.this.ans = 0;
        });

        JButton button12 = new JButton();
        button12.setText("ENTER");
        button12.setBounds(275, 410, 80, 45);
        button12.setFont(new Font("Consolas", Font.PLAIN, 15));
        button12.setBackground(Color.GRAY);
        button12.setOpaque(true);
        tmp.add(button12);
        button12.addActionListener(e -> {
            accounts[id].deposit(ans);
            tmp.setVisible(false);
            menu.setVisible(true);
        });
    }

    public void transfer2(int id,int idb){
        trans.dispose();

        MyFrame tmp = new MyFrame("transfer","ATM2.jpg");
        tmp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tmp.setBounds(350,180,800,600);
        tmp.setVisible(true);


        String msg = "Enter an amount";
        JLabel text = new JLabel(msg);
        text.setBounds(188,170,300,100);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Consolas",Font.BOLD,25));
        tmp.add(text);

        String msg2 = "to transfer";
        JLabel text2 = new JLabel(msg2);
        text2.setBounds(212,200,200,100);
        text2.setForeground(Color.WHITE);
        text2.setFont(new Font("Consolas",Font.BOLD,25));
        tmp.add(text2);

        ans = 0;

        JButton button1 = new JButton();
        button1.setText("0");
        button1.setBounds(190, 355, 40, 25);
        button1.setFont(new Font("Consolas", Font.BOLD, 10));
        button1.setBackground(Color.GRAY);
        button1.setOpaque(true);
        tmp.add(button1);
        button1.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+0;
        });

        JButton button2 = new JButton();
        button2.setText("1");
        button2.setBounds(230, 355, 40, 25);
        button2.setFont(new Font("Consolas", Font.BOLD, 10));
        button2.setBackground(Color.GRAY);
        button2.setOpaque(true);
        tmp.add(button2);
        button2.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+1;
        });


        JButton button3 = new JButton();
        button3.setText("2");
        button3.setBounds(270, 355, 40, 25);
        button3.setFont(new Font("Consolas", Font.BOLD, 10));
        button3.setBackground(Color.GRAY);
        button3.setOpaque(true);
        tmp.add(button3);
        button3.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+2;
        });


        JButton button4 = new JButton();
        button4.setText("3");
        button4.setBounds(175, 380, 40, 25);
        button4.setFont(new Font("Consolas", Font.BOLD, 10));
        button4.setBackground(Color.GRAY);
        button4.setOpaque(true);
        tmp.add(button4);
        button4.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+3;
        });


        JButton button5 = new JButton();
        button5.setText("4");
        button5.setBounds(215, 380, 40, 25);
        button5.setFont(new Font("Consolas", Font.BOLD, 10));
        button5.setBackground(Color.GRAY);
        button5.setOpaque(true);
        tmp.add(button5);
        button5.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+4;
        });


        JButton button6 = new JButton();
        button6.setText("5");
        button6.setBounds(255, 380, 40, 25);
        button6.setFont(new Font("Consolas", Font.BOLD, 10));
        button6.setBackground(Color.GRAY);
        button6.setOpaque(true);
        tmp.add(button6);
        button6.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+5;
        });


        JButton button7 = new JButton();
        button7.setText("6");
        button7.setBounds(150, 405, 40, 25);
        button7.setFont(new Font("Consolas", Font.BOLD, 10));
        button7.setBackground(Color.GRAY);
        button7.setOpaque(true);
        tmp.add(button7);
        button7.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+6;
        });

        JButton button8 = new JButton();
        button8.setText("7");
        button8.setBounds(190, 405, 40, 25);
        button8.setFont(new Font("Consolas", Font.BOLD, 10));
        button8.setBackground(Color.GRAY);
        button8.setOpaque(true);
        tmp.add(button8);
        button8.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+7;
        });

        JButton button9 = new JButton();
        button9.setText("8");
        button9.setBounds(230, 405, 40, 25);
        button9.setFont(new Font("Consolas", Font.BOLD, 10));
        button9.setBackground(Color.GRAY);
        button9.setOpaque(true);
        tmp.add(button9);
        button9.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+8;
        });

        JButton button10 = new JButton();
        button10.setText("9");
        button10.setBounds(175, 430, 40, 25);
        button10.setFont(new Font("Consolas", Font.BOLD, 10));
        button10.setBackground(Color.GRAY);
        button10.setOpaque(true);
        tmp.add(button10);
        button10.addActionListener(e -> {
            GUI_simATM.this.ans = GUI_simATM.this.ans*10+9;
        });

        JButton button11 = new JButton();
        button11.setText("CLEAR");
        button11.setBounds(315, 365, 80, 45);
        button11.setFont(new Font("Consolas", Font.PLAIN, 15));
        button11.setBackground(Color.GRAY);
        button11.setOpaque(true);
        tmp.add(button11);
        button11.addActionListener(e -> {
            GUI_simATM.this.ans = 0;
        });

        JButton button12 = new JButton();
        button12.setText("ENTER");
        button12.setBounds(275, 410, 80, 45);
        button12.setFont(new Font("Consolas", Font.PLAIN, 15));
        button12.setBackground(Color.GRAY);
        button12.setOpaque(true);
        tmp.add(button12);
        button12.addActionListener(e -> {
            accounts[id].transfer(accounts[idb], ans);
            tmp.setVisible(false);
            menu.setVisible(true);
        });
    }

    public void transfer(int id){

        menu.setVisible(false);
        trans = new MyFrame("transfer","ATM2.jpg");
        trans.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        trans.setBounds(350,180,800,600);
        trans.setVisible(true);


        String msg = "Enter an id";
        JLabel text = new JLabel(msg);
        text.setBounds(188,170,300,100);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Consolas",Font.BOLD,25));
        trans.add(text);

        String msg2 = "to transfer";
        JLabel text2 = new JLabel(msg2);
        text2.setBounds(212,200,200,100);
        text2.setForeground(Color.WHITE);
        text2.setFont(new Font("Consolas",Font.BOLD,25));
        trans.add(text2);


        JButton button1 = new JButton();
        button1.setText("0");
        button1.setBounds(190, 355, 40, 25);
        button1.setFont(new Font("Consolas", Font.BOLD, 10));
        button1.setBackground(Color.GRAY);
        button1.setOpaque(true);
        trans.add(button1);
        button1.addActionListener(e -> {
            GUI_simATM.this.transfer2(id,0);
        });

        JButton button2 = new JButton();
        button2.setText("1");
        button2.setBounds(230, 355, 40, 25);
        button2.setFont(new Font("Consolas", Font.BOLD, 10));
        button2.setBackground(Color.GRAY);
        button2.setOpaque(true);
        trans.add(button2);
        button2.addActionListener(e -> {
            GUI_simATM.this.transfer2(id,1);
        });


        JButton button3 = new JButton();
        button3.setText("2");
        button3.setBounds(270, 355, 40, 25);
        button3.setFont(new Font("Consolas", Font.BOLD, 10));
        button3.setBackground(Color.GRAY);
        button3.setOpaque(true);
        trans.add(button3);
        button3.addActionListener(e -> {
            GUI_simATM.this.transfer2(id,2);
        });


        JButton button4 = new JButton();
        button4.setText("3");
        button4.setBounds(175, 380, 40, 25);
        button4.setFont(new Font("Consolas", Font.BOLD, 10));
        button4.setBackground(Color.GRAY);
        button4.setOpaque(true);
        trans.add(button4);
        button4.addActionListener(e -> {
            GUI_simATM.this.transfer2(id,3);
        });


        JButton button5 = new JButton();
        button5.setText("4");
        button5.setBounds(215, 380, 40, 25);
        button5.setFont(new Font("Consolas", Font.BOLD, 10));
        button5.setBackground(Color.GRAY);
        button5.setOpaque(true);
        trans.add(button5);
        button5.addActionListener(e -> {
            GUI_simATM.this.transfer2(id,4);
        });


        JButton button6 = new JButton();
        button6.setText("5");
        button6.setBounds(255, 380, 40, 25);
        button6.setFont(new Font("Consolas", Font.BOLD, 10));
        button6.setBackground(Color.GRAY);
        button6.setOpaque(true);
        trans.add(button6);
        button6.addActionListener(e -> {
            GUI_simATM.this.transfer2(id,5);
        });


        JButton button7 = new JButton();
        button7.setText("6");
        button7.setBounds(150, 405, 40, 25);
        button7.setFont(new Font("Consolas", Font.BOLD, 10));
        button7.setBackground(Color.GRAY);
        button7.setOpaque(true);
        trans.add(button7);
        button7.addActionListener(e -> {
            GUI_simATM.this.transfer2(id,6);
        });

        JButton button8 = new JButton();
        button8.setText("7");
        button8.setBounds(190, 405, 40, 25);
        button8.setFont(new Font("Consolas", Font.BOLD, 10));
        button8.setBackground(Color.GRAY);
        button8.setOpaque(true);
        trans.add(button8);
        button8.addActionListener(e -> {
            GUI_simATM.this.transfer2(id,7);
        });

        JButton button9 = new JButton();
        button9.setText("8");
        button9.setBounds(230, 405, 40, 25);
        button9.setFont(new Font("Consolas", Font.BOLD, 10));
        button9.setBackground(Color.GRAY);
        button9.setOpaque(true);
        trans.add(button9);
        button9.addActionListener(e -> {
            GUI_simATM.this.transfer2(id,8);
        });

        JButton button10 = new JButton();
        button10.setText("9");
        button10.setBounds(175, 430, 40, 25);
        button10.setFont(new Font("Consolas", Font.BOLD, 10));
        button10.setBackground(Color.GRAY);
        button10.setOpaque(true);
        trans.add(button10);
        button10.addActionListener(e -> {
            GUI_simATM.this.transfer2(id,9);
        });
    }

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

        // 按钮
        JButton button1 = new JButton();
        button1.setText("");
        button1.setBounds(105,165,40,38);
        button1.setBackground(Color.LIGHT_GRAY);
        button1.setOpaque(true);
        menu.add(button1);
        button1.addActionListener(e -> {
            GUI_simATM.this.getbalance(id);
        });


        JButton button2 = new JButton();
        button2.setText("");
        button2.setBounds(430,165,40,38);
        button2.setBackground(Color.LIGHT_GRAY);
        button2.setOpaque(true);
        menu.add(button2);
        button2.addActionListener(e -> {
            GUI_simATM.this.withdraw(id);
        });


        JButton button3 = new JButton();
        button3.setText("");
        button3.setBounds(105,210,40,38);
        button3.setBackground(Color.LIGHT_GRAY);
        button3.setOpaque(true);
        menu.add(button3);
        button3.addActionListener(e -> {
            GUI_simATM.this.deposit(id);
        });


        JButton button4 = new JButton();
        button4.setText("");
        button4.setBounds(430,210,40,38);
        button4.setBackground(Color.LIGHT_GRAY);
        button4.setOpaque(true);
        menu.add(button4);
        button4.addActionListener(e -> {
            GUI_simATM.this.transfer(id);
        });


        JButton button5 = new JButton();
        button5.setText("");
        button5.setBounds(105,260,40,38);
        button5.setBackground(Color.LIGHT_GRAY);
        button5.setOpaque(true);
        menu.add(button5);
        button5.addActionListener(e -> {
            frame.setVisible(true);
            menu.dispose();
        });

    }

    public void initialize(){
        start = new MyFrame("simulated ATM", "Row-of-ATMs.jpg");
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setBounds(100, 100, 1200, 757);
        start.setVisible(true);

        JButton button = new JButton("START");
        button.setBounds(500,350,200,100);
        button.setFont(new Font("Consolas",Font.BOLD,30));
        button.setBackground(Color.pink);
        button.setOpaque(true);
        start.add(button);
        button.addActionListener(e -> {
            start.setVisible(false);
            frame.setVisible(true);
        });
    }

    public GUI_simATM() {
        frame = new MyFrame("simulated ATM", "ATM2.jpg");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(350, 180, 800, 600);
        frame.setVisible(false);
        initialize();
        // 先登录

        JLabel loginmsg = new JLabel("Enter an id");
        loginmsg.setBounds(220, 150, 200, 100);
        loginmsg.setForeground(Color.WHITE);
        loginmsg.setFont(new Font("Consolas", Font.BOLD, 20));
        frame.add(loginmsg);

        JButton button1 = new JButton();
        button1.setText("0");
        button1.setBounds(190, 355, 40, 25);
        button1.setFont(new Font("Consolas", Font.BOLD, 10));
        button1.setBackground(Color.GRAY);
        button1.setOpaque(true);
        frame.add(button1);
        button1.addActionListener(e -> {
            GUI_simATM.this.MenuPage(0);
        });


        JButton button2 = new JButton();
        button2.setText("1");
        button2.setBounds(230, 355, 40, 25);
        button2.setFont(new Font("Consolas", Font.BOLD, 10));
        button2.setBackground(Color.GRAY);
        button2.setOpaque(true);
        frame.add(button2);
        button2.addActionListener(e -> {
            GUI_simATM.this.MenuPage(1);
        });


        JButton button3 = new JButton();
        button3.setText("2");
        button3.setBounds(270, 355, 40, 25);
        button3.setFont(new Font("Consolas", Font.BOLD, 10));
        button3.setBackground(Color.GRAY);
        button3.setOpaque(true);
        frame.add(button3);
        button3.addActionListener(e -> {
            GUI_simATM.this.MenuPage(2);
        });


        JButton button4 = new JButton();
        button4.setText("3");
        button4.setBounds(175, 380, 40, 25);
        button4.setFont(new Font("Consolas", Font.BOLD, 10));
        button4.setBackground(Color.GRAY);
        button4.setOpaque(true);
        frame.add(button4);
        button4.addActionListener(e -> {
            GUI_simATM.this.MenuPage(3);
        });


        JButton button5 = new JButton();
        button5.setText("4");
        button5.setBounds(215, 380, 40, 25);
        button5.setFont(new Font("Consolas", Font.BOLD, 10));
        button5.setBackground(Color.GRAY);
        button5.setOpaque(true);
        frame.add(button5);
        button5.addActionListener(e -> {
            GUI_simATM.this.MenuPage(4);
        });


        JButton button6 = new JButton();
        button6.setText("5");
        button6.setBounds(255, 380, 40, 25);
        button6.setFont(new Font("Consolas", Font.BOLD, 10));
        button6.setBackground(Color.GRAY);
        button6.setOpaque(true);
        frame.add(button6);
        button6.addActionListener(e -> {
            GUI_simATM.this.MenuPage(5);
        });


        JButton button7 = new JButton();
        button7.setText("6");
        button7.setBounds(150, 405, 40, 25);
        button7.setFont(new Font("Consolas", Font.BOLD, 10));
        button7.setBackground(Color.GRAY);
        button7.setOpaque(true);
        frame.add(button7);
        button7.addActionListener(e -> {
            GUI_simATM.this.MenuPage(6);
        });

        JButton button8 = new JButton();
        button8.setText("7");
        button8.setBounds(190, 405, 40, 25);
        button8.setFont(new Font("Consolas", Font.BOLD, 10));
        button8.setBackground(Color.GRAY);
        button8.setOpaque(true);
        frame.add(button8);
        button8.addActionListener(e -> {
            GUI_simATM.this.MenuPage(7);
        });

        JButton button9 = new JButton();
        button9.setText("8");
        button9.setBounds(230, 405, 40, 25);
        button9.setFont(new Font("Consolas", Font.BOLD, 10));
        button9.setBackground(Color.GRAY);
        button9.setOpaque(true);
        frame.add(button9);
        button9.addActionListener(e -> {
            GUI_simATM.this.MenuPage(8);
        });

        JButton button10 = new JButton();
        button10.setText("9");
        button10.setBounds(175, 430, 40, 25);
        button10.setFont(new Font("Consolas", Font.BOLD, 10));
        button10.setBackground(Color.GRAY);
        button10.setOpaque(true);
        frame.add(button10);
        button10.addActionListener(e -> {
            GUI_simATM.this.MenuPage(9);
        });
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            // create new account object
            accounts[i] = new Account(i, 100);
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUI_simATM window = new GUI_simATM();
            }
        });
    }
}
