package chapter06;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/4/8 10:31
 */
public class Account1 {
    private static long numAccounts;

    static {
        numAccounts = 0;
    }

    private double balance;
    private String name;
    // 银行需要追踪当前的账户数
    private long acctNum;


    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account1(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
        numAccounts += 1;
    }

    public Account1(double initBal, String owner) {
        balance = initBal;
        name = owner;
        acctNum = (int) (Math.random() * 10000);
        //生成0~10000的随机数
        numAccounts += 1;
    }

    public Account1(String owner) {
        balance = 0;
        name = owner;
        acctNum = (int) (Math.random() * 10000);
        //生成0~100的随机数
        numAccounts += 1;
    }

    public static long getNumAccounts() {
        return numAccounts;
    }

    // 创建一个新的账户（新账户balance的值为acct1 和 acct2的balance之和，
    // 同时关闭acct1 和 acct2）并返回新创建的账户对象
    public static Account1 consolidate(Account1 acct1, Account1 acct2) {
        Account1 newacct = null;
        if (acct1.getName().equals(acct2.getName()) && acct1.getAcctNum() != acct2.getAcctNum()) {
            try {
                newacct = new Account1(acct1.getBalance() + acct2.getBalance(), acct1.getName());
                acct1.close();
                acct2.close();
            } catch (Exception e) {
                System.out.println(e);
            }

        } else {
            System.out.println("姓名或者账号不合规范");
        }
        return newacct;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(long acctNum) {
        this.acctNum = acctNum;
    }

    void close() {
        name = "CLOSED";
        balance = 0;
        numAccounts -= 1;
    }

    @Override
    public String toString() {
        return "Name:" + name +
                "\nAccount Number: " + acctNum +
                "\nBalance: " + balance;
    }

    public String printf() {
        return "Account1{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                ", acctNum=" + acctNum +
                '}';
    }
}
