package chapter04;

import java.util.Scanner;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/29 18:59
 */
public class TestNames {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Name name1, name2;
        String first, middle, last;
        System.out.println("Please enter the two person's full name(e.g : first middle last):");

        first = scan.next();
        middle = scan.next();
        last = scan.next();
        name1 = new Name(first, middle, last);

        first = scan.next();
        middle = scan.next();
        last = scan.next();
        name2 = new Name(first, middle, last);

        System.out.println(name1.firstMiddleLast());
        System.out.println(name1.lastFirstMiddle());
        System.out.println(name1.initials());
        System.out.println(name1.length());

        System.out.println(name2.firstMiddleLast());
        System.out.println(name2.lastFirstMiddle());
        System.out.println(name2.initials());
        System.out.println(name2.length());
        //*************************************
        System.out.println(name1.equals(name2.firstMiddleLast()));

    }

}
