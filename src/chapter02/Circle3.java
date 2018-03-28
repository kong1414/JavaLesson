package chapter02;

import java.util.Scanner;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/23 10:57
 */
public class Circle3 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner scan = new Scanner(System.in);
        int radius;
        System.out.print("Please enter the radius(A positive integer):");
        radius = scan.nextInt();
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("The area of a circle with radius " + radius +
                " is " + area);
        System.out.println("The circumference of a circle with radius " + radius +
                " is " + circumference);
    }


}
