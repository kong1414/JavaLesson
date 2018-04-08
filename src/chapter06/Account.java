package chapter06;

import java.util.Random;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/4/8 10:13
 */
public class Account {
    private double balance;
    private String name;
    private long acctNum;

    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    public Account(double initBal, String owner) {
        balance = initBal;
        name = owner;
        acctNum = (int) (Math.random() * 100);
        //生成0~100的随机数
    }

    public Account(String owner) {
        balance = 0;
        name = owner;
        acctNum = (int) (Math.random() * 100);
        //生成0~100的随机数
    }

    //----------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    //----------------------------------------------
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void withdraw(double amount, double fee) {
        if (balance >= amount + fee) {
            balance -= amount;
            balance -= fee;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    //----------------------------------------------
    // Adds deposit amount to balance.
    //----------------------------------------------
    public void deposit(double amount) {
        balance += amount;
    }

    //----------------------------------------------
    // Returns balance.
    //----------------------------------------------
    public double getBalance() {
        return balance;
    }

    //----------------------------------------------
    // Returns a string containing the name, account number, and balance.
    //----------------------------------------------
    @Override
    public String toString() {
        return "Name:" + name +
                "\nAccount Number: " + acctNum +
                "\nBalance: " + balance;
    }

}
