package com.example.simATM;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.net.URL;

public class GUI_simATM {

    /*
    学姐，那个GUI-simATM是要做按钮事件吗？
    就是原本有一个frame，显示menu，有一个输入文本框。
    输入之后按确定按钮，然后原来的frame窗口就会弹出一个新frame，要求输入数据。
     */
    static Scanner input;  // input from keyboard
    private JFrame frame;

    public GUI_simATM(){
        initialize();
    }


    private void initialize()
    {
        // 初始化窗体
        frame = new JFrame("GUI simATM");
        frame.setBounds(100, 100, 1200, 757);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // 设置背景
        JLabel lblBackground = new JLabel(); // 创建一个标签组件对象
        URL resource = this.getClass().getResource("Row-of-ATMs.jpg"); // 获取背景图片路径
        ImageIcon icon = new ImageIcon(resource); // 创建背景图片对象
        lblBackground.setIcon(icon); // 设置标签组件要显示的图标
        lblBackground.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight()); // 设置组件的显示位置及大小
        frame.getContentPane().add(lblBackground); // 将组件添加到面板中

        // 按钮1
        JButton button1 = new JButton("GO HEAD!");
        button1.setBounds(500, 350, 200, 100);
        Font f=new Font("Consolas",Font.BOLD,30);
        button1.setFont(f);
        button1.setBackground(new Color(0,173,232));
        button1.setOpaque(true);
        button1.setBorderPainted(false);
        frame.getContentPane().add(button1);

        // 场景2
        JFrame frame1 = new JFrame("Test");
        frame1.setBounds(360, 200, 800, 600);
        JLabel lblBackground1 = new JLabel(); // 创建一个标签组件对象
        URL resource1 = this.getClass().getResource("ATM.jpg"); // 获取背景图片路径
        ImageIcon icon1 = new ImageIcon(resource1); // 创建背景图片对象
        lblBackground1.setIcon(icon1); // 设置标签组件要显示的图标
        lblBackground1.setBounds(0, 0, icon1.getIconWidth(), icon1.getIconHeight()); // 设置组件的显示位置及大小
        frame1.getContentPane().add(lblBackground1); // 将组件添加到面板中

        // 按钮事件
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame1.setBackground(Color.cyan);
                frame1.setVisible(true);
            }
        });

        // 场景2操作
        // 弹出语句
        JLabel jlbl1 = new JLabel("Enter an id: ");
        //int id = ;

    }

    public static void main(String[] args) {

        //  create the account array
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; ++i) {
            // create new account object
            accounts[i] = new Account(i, 100);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI_simATM window = new GUI_simATM();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

/*
        input = new Scanner(System.in);   // get input from keyboard



        // infinite loop for input
        while (true) {
            // read a number in the range [0,10)
            int id = read("Enter an id: ", 0, 10);

            while (true) {
                // print the menu everytime before operation
                printMenu();  //   for one user, there will be a lot of operations

                // read a number in the range [1,6)
                int choice = read("Enter a choice: ", 1, 6);

                // if the input exits the current account
                boolean flg = process(accounts, id, choice);

                // we need to break this loop and waiting for operations of the next account
                if (flg) break;
            }
        }
        */
    }

    // method for processing the given operations
    static boolean process(Account[] accounts, int id, int choice) {
        // check if the current one is exiting account
        boolean flg = false;
        switch (choice) {
            // obtain the current balance
            case 1:
                System.out.println("The balance is " +
                        accounts[id].getBalance());
                break;
            // withdraw money from the current account
            case 2:
                int amount = read("Enter an amount to withdraw: ",
                        0, 1000000000);
                accounts[id].withdraw(amount);
                break;
            // deposit money to the account
            case 3:
                amount = read("Enter an amount to deposit: ",
                        0, 1000000000);
                accounts[id].deposit(amount);
                break;
            // transfer money from one account to another
            case 4:
                int idb = read("Enter another id to transfer: ",
                        0, 10);
                amount = read("Enter an amount to transfer: ",
                        0, 1000000000);
                accounts[id].transfer(accounts[idb], amount);
                break;
            // if one wants to log out
            case 5:
                flg = true;
                break;
        }
        return flg;
    }

    // method for printing the menu
    // of course, we can also store the menu in a string object
    static void printMenu() {
        System.out.println("Main menu\n" +
                "1: check balance\n" +
                "2: withdraw\n" +
                "3: deposit\n" +
                "4: transfer\n" +
                "5: exit\n");
    }

    // method for reading a integer in the given range
    static int read(String str, int l, int r) {
        int result;
        while (true) {
            try {
                System.out.print(str);
                result = Integer.parseInt(input.nextLine());
                if (result >= l && result < r) break;
            } catch (NumberFormatException e) {
                // if something other than number is read
                System.out.println("Invalid input!");
            }
            // if the number is not in the range
            System.out.println("Number out of range!");
        }
        return result;
    }

}
