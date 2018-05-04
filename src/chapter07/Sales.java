package chapter07;

import java.util.Scanner;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/4/13 10:44
 */
public class Sales {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int SALESPEOPLE = 5;

        int sum;
        int maxtemp = 0;
        int mintemp = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("请输入人数");

        int[] sales = new int[scan.nextInt()];
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
            if (max < sales[i]) {
                max = sales[i];
                maxtemp = i;
            }
            if (min > sales[i]) {
                min = sales[i];
                mintemp = i;
            }
        }

        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i = 0; i < sales.length; i++) {
            System.out.println("     " + i + "         " + sales[i]);
            sum += sales[i];
        }

        System.out.println("\nTotal sales: " + sum);
        System.out.println("平均值为" + (sum / sales.length));
        System.out.println("salesperon" + maxtemp + "had the highest sale with $" + max);
        System.out.println("salesperon" + mintemp + "had the lowest sale with $" + min);

        System.out.println("请输入销售额");

        int wanto = scan.nextInt();
        int temp = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > wanto) {
                System.out.println(" " + i + " " + sales[i]);
                temp++;
            }
        }

        System.out.println("超过人数为" + temp);
        System.out.println("ID修改后");
        for (int i = 0; i < sales.length; i++) {
            System.out.println(" " + (i + 1) + " " + sales[i]);
        }
    }
}
