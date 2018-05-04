package chapter07;

import com.sun.media.sound.MidiUtils;

import java.util.Scanner;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/4 10:20
 */
public class Parameters {
    //-----------------------------------------------
    //  Calls the average and minimum methods with
    //  different numbers of parameters.
    //-----------------------------------------------
    public static void main(String[] args) {
        double mean1, mean2, mean3, mean4;
        int[] means = new int[20];
        Scanner sc = new Scanner(System.in);
        mean1 = average(42, 69, 37);
        mean2 = average(35, 43, 93, 23, 40, 21, 75);
        mean3 = average(13);
        System.out.println("mean1 = " + mean1);
        System.out.println("mean2 = " + mean2);
        System.out.println("mean3 = " + mean3);
        int num = 0;
        do {
            int temp = sc.nextInt();
            if (temp < 0) {
                break;
            }
            means[num++] = temp;
        } while (num < 20);
        mean4 = average(means);
        int min = minimum(means);
        System.out.println("mean4 = " + mean4);
        System.out.println("min = " + min);

    }

    //----------------------------------------------
    //  Returns the average of its parameters.
    //----------------------------------------------
    public static double average(int... list) {
        double result = 0.0;

        if (list.length != 0) {
            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            result = (double) sum / list.length;
        }
        return result;
    }

    /**
     * 求数组中最小值
     *
     * @param list
     * @return
     */
    public static int minimum(int... list) {
        int min = Integer.MAX_VALUE;
        if (list.length != 0) {
            for (int num : list) {
                if (num < min) {
                    min = num;
                }
            }
        }
        return min;
    }
}
