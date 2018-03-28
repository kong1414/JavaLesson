package chapter02;
// ****************************************************
//   PlusTest.java
//
//   Demonstrate the different behaviors of the + operator
// **************************************************

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/23 10:45
 */
public class PlusTest {
    // -------------------------------------------------
    // main prints some expressions using the + operator
    // -------------------------------------------------
    public static void main(String[] args) {
        //如果 + 一边是字符串，另一边将转换为字符串再连接
        System.out.println("This is a long string that is the " +
                "concatenation of two shorter strings.");

        //如果 + 一边是字符串，另一边将转换为字符串再连接
        System.out.println("The first computer was invented about" + 55 +
                "years ago.");

        //如果+一边是字符串，另一边将转换为字符串再连接
        System.out.println("8 plus 5 is " + 8 + 5);

        //如果有圆括号，圆括号先算，没有括号从左到右计算
        System.out.println("8 plus 5 is " + (8 + 5));

        //如果+运算符两边都是数字，则表示加法运算
        System.out.println(8 + 5 + " equals 8 plus 5.");

        System.out.println("Ten robins plus " + 13 + " canaries is " + 23 + " birds.");
    }

}

