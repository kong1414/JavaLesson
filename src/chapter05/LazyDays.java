package chapter05;

import java.util.Scanner;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/30 10:27
 */
public class LazyDays {
    public static void main(String[] args) {
        double temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the temp: ");
        temp = scan.nextDouble();
        if (temp > 95 || temp < 20) {
            System.out.println("Visit our shops!");
        } else if (temp >= 80) {
            System.out.println("swimming");
        } else if (temp >= 60) {
            System.out.println("tennis");
        } else if (temp >= 40) {
            System.out.println("golf");
        } else {
            System.out.println("skiing");
        }
    }

}
