package chapter10;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/25 15:59
 */
public class MathUtils {

    //----------------------------------------------
    // Returns the factorial of the argument given
    // ---------------------------------------------
    public static int factorial(int n) {
        int fac = 1;
        IllegalArgumentException ill = new IllegalArgumentException();
        if (n > 16 || n < 0) {
            throw ill;
        }
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
