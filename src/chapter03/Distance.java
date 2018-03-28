package chapter03;

import java.util.Scanner;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/28 17:01
 */
public class Distance {
    public static void main(String[] args) {
        double x1, y1, x2, y2; // coordinates of two points
        double distance; // distance between the points
        Scanner scan = new Scanner(System.in);
        // Read in the two points
        System.out.print("Enter the coordinates of the first point " +
                "(put a space between them): ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        System.out.print("Enter the coordinates of the second point: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        // Compute the distance
        // Print out the answer
        distance = Math.sqrt(Math.pow((x1 - x2), 2.0) + Math.pow((y1 - y2), 2.0));
        System.out.print("The distance of two point is : " + distance);
    }

}
