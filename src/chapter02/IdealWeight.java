package chapter02;

import java.util.Scanner;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/23 11:09
 */
public class IdealWeight {
    public static void main(String args[]) {
        String sex;
        Scanner scan = new Scanner(System.in);
        int ft, in;
        double weight;
        System.out.print("Please enter the sex : ");
        sex = scan.nextLine();
        System.out.print("Please enter the height(ft and in ex. 1 2) : ");
        ft = scan.nextInt();
        in = scan.nextInt();
        if (sex.equals("男")) {
            in = in + ft * 12;
            weight = 106 + 6 * (in - 60);
        } else {
            in = in + ft * 12;
            weight = 100 + 5 * (in - 60);
        }

        System.out.println("The best weight is :" + weight);
        System.out.println("The health is :" + (weight - weight * 0.15) + " ~ "
                + (weight + weight * 0.15));
    }
}
