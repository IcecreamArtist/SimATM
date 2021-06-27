package com.example.simATM;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SimATMTest {

    Account[] accounts;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // test get balance
    @Test
    public void process() throws FileNotFoundException {
        // initialize
        accounts = new Account[10];
        for (int i = 0; i < 10; ++i) {
            // create new account object
            accounts[i] = new Account(i, 100);
        }
        // input stream change to local file
        Scanner input = new Scanner(new File("002.in"));
        // display the current balance
        assertEquals("The balance is 100.0", SimATM.process(input, accounts, 1, 1));
    }

    // test deposit
    @Test
    public void process2() throws FileNotFoundException {
        // initialize
        accounts = new Account[10];
        for (int i = 0; i < 10; ++i) {
            // create new account object
            accounts[i] = new Account(i, 100);
        }
        // input stream change to local file
        Scanner input = new Scanner(new File("001.in"));
        // deposit money
        SimATM.process(input, accounts, 1, 3);
        // display the current balance
        assertEquals("The balance is 200.0", SimATM.process(input, accounts, 1, 1));
    }

    // test transfer
    @Test
    public void process3() throws FileNotFoundException {
        // initialize
        accounts = new Account[10];
        for (int i = 0; i < 10; ++i) {
            // create new account object
            accounts[i] = new Account(i, 100);
        }
        // input stream change to local file
        Scanner input = new Scanner(new File("003.in"));
        // transfer money to id=2
        SimATM.process(input, accounts, 2, 4);
        // display the balance of id=2
        assertEquals("The balance is 101.0", SimATM.process(input, accounts, 1, 1));
    }

    @Test
    public void process4() throws FileNotFoundException {
        // initialize
        accounts = new Account[10];
        for (int i = 0; i < 10; ++i) {
            // create new account object
            accounts[i] = new Account(i, 100);
        }
        // input stream change to local file
        Scanner input = new Scanner(new File("004.in"));
        // withdraw money
        // no enough money: prompt
        SimATM.process(input, accounts, 1, 2);
        // have enough money
        SimATM.process(input, accounts, 1, 2);
        // display the current balance
        assertEquals("The balance is 20.0", SimATM.process(input, accounts, 1, 1));
    }
}