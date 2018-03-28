package chapter03;

import java.sql.Struct;

/**
 * @Description: Play with String objects
 * @Author: QiuGuanLin
 * @Date: 2018/3/28 9:33
 */
public class StringPlay {
    public static void main(String[] args) {
        String college = new String("PoDunk College");

        // 规范不使用尾行注释
        String town = new String("Anytown, USA");
        // part (a)

        int stringLength;
        String change1, change2, change3;

        stringLength = college.length();
        // part (b)

        System.out.println(college + " contains " + stringLength + " characters.");

        change1 = college.toUpperCase();
        // part (c)

        change2 = change1.replace("o", "*");
        // part (d)

        change3 = college.concat(town);
        // part (e)

        System.out.println("The final string is " + change3);
    }
}
