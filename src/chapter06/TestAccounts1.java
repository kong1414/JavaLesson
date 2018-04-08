package chapter06;

import java.util.Scanner;

/**
 * @Description: 实验六第6题
 * @Author: QiuGuanLin
 * @Date: 2018/4/8 10:30
 */
public class TestAccounts1 {
    public static void main(String[] args) {
        Account1 testAcct;
        Scanner scan = new Scanner(System.in);

        System.out.println("How many accounts would you like to create?");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            testAcct = new Account1(100, "Name" + i);
            System.out.println("\nCreated account " + testAcct);
            System.out.println("Now there are " + Account1.getNumAccounts() + " accounts");
        }

        Account1 a1 = null;
        Account1 a2 = null;
        Account1 a3 = null;
        Account1 a4 = null;

        a1 = new Account1(100, "name1");
        System.out.println(a1.printf());
        a2 = new Account1(100, "name2");
        System.out.println(a2.printf());
        a3 = new Account1(100, "name2");
        System.out.println(a3.printf());

        a1.close();
        System.out.println("第一个账户关闭成功");
        a4 = Account1.consolidate(a2, a3);
        System.out.println(a4.printf());
        System.out.println("第二三个账户合并成功");

    }
}
