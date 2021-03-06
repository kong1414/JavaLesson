package chapter04;

import java.text.NumberFormat;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/29 15:13
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
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return name + "\t" + acctNum + "\t" + fmt.format(balance);
    }

    //----------------------------------------------
    // Deducts $10 service fee
    //----------------------------------------------
    public double chargeFee() {
        balance -= 10.0;
        return balance;

    }

    //----------------------------------------------
    // Changes the name on the account
    //----------------------------------------------
    public void changeName(String newName) {
        name = newName;
    }
}

