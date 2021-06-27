package com.example.simATM;

import java.io.InputStream;
import java.util.Date;
import java.util.Scanner;

public class SimATM {

    static InputStream stream;
    static Scanner input;

    /**
     * main method
     */
    public static void main(String[] args) {
        stream = System.in;   // get input from keyboard
        input = new Scanner(stream);

        //  create the account array
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; ++i) {
            // create new account object
            accounts[i] = new Account(i, 100);
        }

        // infinite loop for input
        while (true) {
            // read a number in the range [0,10)
            int id = read(input, "Enter an id: ", 0, 10);

            while (true) {
                // print the menu everytime before operation
                printMenu();  //   for one user, there will be a lot of operations

                // read a number in the range [1,6)
                int choice = read(input, "Enter a choice: ", 1, 6);

                // if the input exits the current account
                // we need to break this loop and waiting for operations of the next account
                if (process(input, accounts, id, choice).equals("flag")) break;
            }
        }
    }

    /**
     * method for processing the given operations
     */
    static String process(Scanner input, Account[] accounts, int id, int choice) {
        // check if the current one is exiting account
        boolean flg = false;
        switch (choice) {
            // obtain the current balance
            case 1:
                String ret = "The balance is " + accounts[id].getBalance();
                System.out.println(ret);
                return ret;
            // withdraw money from the current account
            case 2:
                int amount = read(input, "Enter an amount to withdraw: ",
                        0, 1000000000);
                accounts[id].withdraw(amount);
                break;
            // deposit money to the account
            case 3:
                amount = read(input, "Enter an amount to deposit: ",
                        0, 1000000000);
                accounts[id].deposit(amount);
                break;
            // transfer money from one account to another
            case 4:
                int idb = read(input, "Enter another id to transfer: ",
                        0, 10);
                amount = read(input, "Enter an amount to transfer: ",
                        0, 1000000000);
                accounts[id].transfer(accounts[idb], amount);
                break;
            // if one wants to log out
            case 5:
                flg = true;
                break;
        }
        if (flg) return new String("flag");
        return new String("noflag");
    }

    /**
     * method for printing the menu
     * of course, we can also store the menu in a string object
     */
    static void printMenu() {
        System.out.println("Main menu\n" +
                "1: check balance\n" +
                "2: withdraw\n" +
                "3: deposit\n" +
                "4: transfer\n" +
                "5: exit\n");
    }

    /**
     * method for reading a integer in the given range
     */
    static int read(Scanner input, String str, int l, int r) {
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

class Account {

    private int id; // private int data field named id for the account (default 0)
    private double balance; // for the account (default 0)
    protected double annualInterestRate; // stores the current interest rate (default 0)
    // assume all accounts have the same interest rate
    final private Date dateCreated; // stores the date when the account was created

    /**
     * constructor without arguments
     */
    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    /**
     * constructor with arguments specifying the identity and initial money
     */
    Account(int i, double b) {
        id = i;
        balance = b;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    /**
     * get the identity of one account
     */
    public int getId() {
        return id;
    }

    /**
     * set the identity of one account
     */
    public void setId(int i) {
        id = i;
    }

    /**
     * get the balance of one account
     */
    public double getBalance() {
        return balance;
    }

    /**
     * set the balance of one account
     */
    public void setBalance(double b) {
        balance = b;
    }

    /**
     * get the annual interest rate of one account
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * set the annual interest rate of one account
     */
    public void setAnnualInterestRate(double anual) {
        annualInterestRate = anual / 100;
    }

    /**
     * get the created date of one account
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * get the monthly interest rate of one account
     */
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    /**
     * get the monthly interest of one account
     */
    public double getMonthlyInterest() {
        return balance * annualInterestRate / 12;
    }

    /**
     * withdraw an amount of money
     */
    public void withdraw(int amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("No enough money!");
        // money is not enough
    }

    /**
     * deposit an amount of money
     */
    public void deposit(int amount) {
        balance += amount;
    }

    /**
     * transfer money from one account to another
     */
    public void transfer(Account b, int amount) {
        // find another account to transfer money
        if (balance >= amount) {
            balance -= amount;
            b.balance += amount;
        }
        else
            System.out.println("No enough money!");
    }

}