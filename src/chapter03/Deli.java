package chapter03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/28 17:04
 */
public class Deli {
    // ---------------------------------------------------
    // main reads in the price per pound of a deli item
    // and number of ounces of a deli item then computes
    // the total price and prints a "label" for the item
    // --------------------------------------------------
    public static void main(String[] args) {
        final double OUNCES_PER_POUND = 16.0;
        double pricePerPound; // price per pound
        double weightOunces; // weight in ounces
        double weight; // weight in pounds
        double totalPrice; // total price for the item
        Scanner scan = new Scanner(System.in);
        // Declare money as a NumberFormat object and use the getCurrencyInstance method to assign it a value
        // 将货币声明为NumberFormat对象，并使用getCurrencyInstance方法为其赋值
        NumberFormat money = NumberFormat.getCurrencyInstance();

        // Declare fmt as a DecimalFormat object and instantiate
        // 将fmt声明为十进制格式对象并实例化
        // it to format numbers with at least one digit to the left of the
        // decimal and the fractional part rounded to two digits.
        // 它可以在小数点左边至少有一位数的数字，小数部分四舍五入为两位数。
        DecimalFormat fmt = new DecimalFormat("0.##");

        // prompt the user and read in each input
        // 提示用户并阅读每个输入
        System.out.println("Welcome to the CS Deli!!\n ");
        System.out.print("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();
        System.out.print("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();
        // Convert ounces to pounds and compute the total price
        // 将盎司换算成磅并计算总价格
        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;
        // Print the label using the formatting objects

        // fmt for the weight in pounds and money for the prices
        System.out.println("*****  CS Deli  *****\n ");
        System.out.println("Unit Price: " + money.format(pricePerPound) + " per pound ");
        System.out.println(" Weight: " + fmt.format(weight) + " pounds \n");
        System.out.println("TOTAL:  " + money.format(totalPrice));

    }

}
