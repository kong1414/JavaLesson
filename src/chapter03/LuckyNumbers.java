package chapter03;

import java.util.Random;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/28 9:49
 */
public class LuckyNumbers {
    public static void main(String[] args) {
        Random generator = new Random();
        int lucky1, lucky2, lucky3;
        // Generate lucky1 (a random integer between 50 and 79) using the
        // nextInt method (with no parameter)
        lucky1 = generator.nextInt(29) + 50;

        // Generate lucky2 (a random integer between 90 and 100) using the
        // nextInt method with an integer parameter
        lucky2 = generator.nextInt(10) + 90;

        //Chapter 3: Using Classes and Objects 39
        // Generate lucky3 (a random integer between 11 and 30) using nextFloat
        lucky3 = (int) (generator.nextFloat() * 19 + 11);

        System.out.println("Your lucky numbers are " + lucky1 + ", " + lucky2
                + ", and " + lucky3);
    }
}
