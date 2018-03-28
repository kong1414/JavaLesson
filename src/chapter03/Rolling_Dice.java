package chapter03;

import java.util.Random;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/28 16:47
 */
public class Rolling_Dice {
    public static void main(String[] args) {
        Random generator = new Random();
        int lucky1, lucky2, result;

        lucky1 = generator.nextInt(6) + 1;
        lucky2 = generator.nextInt(6) + 1;
        result = lucky1 + lucky2;

        System.out.println("俩骰子的点数分别为  " + lucky1 + ", " + lucky2
                + ", 点数之和为 " + result);
    }

}
