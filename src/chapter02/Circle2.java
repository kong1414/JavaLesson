package chapter02;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/23 10:57
 */
public class Circle2 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        int radius = 10;
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("The area of a circle with radius " + radius +
                " is " + area);
        System.out.println("The circumference of a circle with radius " + radius +
                " is " + circumference);

        radius = 20;
        double area1 = PI * radius * radius;
        double circumference1 = 2 * PI * radius;
        System.out.println("The area of a circle with radius " + radius +
                " is " + area);
        System.out.println("The circumference of a circle with radius " + radius +
                " is " + circumference);

        System.out.println("Area of difference between the two is " + (area1 - area));
        System.out.println("Circumference of difference between the two is " + (circumference1 - circumference));

    }

}
