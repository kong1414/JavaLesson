package chapter03;

import java.util.Scanner;

/**
 * @Description: 已知三角形两边，计算斜边
 * @Author: QiuGuanLin
 * @Date: 2018/3/28 9:44
 */
public class RightTriangle {

    public static void main(String[] args) {
        double side1, side2; // lengths of the sides of a right triangle
        double hypotenuse; // length of the hypotenuse
        Scanner scan = new Scanner(System.in);
        // Get the lengths of the sides as input
        System.out.print("Please enter the lengths of the two sides of " +
                "a right triangle (separate by a blank space): ");

        side1 = scan.nextDouble();
        side2 = scan.nextDouble();
        // Compute the length of the hypotenuse

        hypotenuse = Math.sqrt(Math.pow(side1, 2.0) + Math.pow(side2, 2.0));
        // Print the result

        System.out.println("Length of the hypotenuse: " + hypotenuse);
    }

}
