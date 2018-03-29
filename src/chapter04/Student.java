package chapter04;

import java.util.Scanner;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/29 16:35
 */
public class Student {
    Scanner scan = new Scanner(System.in);
    String name;
    double test1, test2;

    public Student(String studentName) {
        name = studentName;
    }

    public void inputGrades() {
        System.out.print("Please enter the score for test1 and test2:");
        test1 = scan.nextDouble();
        test2 = scan.nextDouble();
    }

    public double getAverage() {
        return (test1 + test2) / 2;
    }

    public String printName() {
        //add body of printName
        return name;
    }

    @Override
    public String toString() {
        return name + " test1: " + test1 + " , " + "test2: " + test2 + " .";
    }

}
