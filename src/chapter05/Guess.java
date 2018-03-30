package chapter05;

import java.util.Random;
import java.util.Scanner;

/**
 * @Description: Play a game where the user guesses a number from 1 to 10
 * @Author: QiuGuanLin
 * @Date: 2018/3/30 10:29
 */
public class Guess {
    public static void main(String[] args) {
        int numToGuess;       //Number the user tries to guess
        int guess;            //The user's guess
        int gn = 1;
        int high = 0, low = 0;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        //randomly generate the  number to guess
        numToGuess = generator.nextInt(10) + 1;
        //print message asking user to enter a guess
        System.out.print("Please enter a guess number between 1 and 10:");
        //read in guess
        guess = scan.nextInt();
        //keep going as long as the guess is wrong
        while (numToGuess != guess) {
            //print message saying guess is wrong
            if (numToGuess < guess) {
                high++;
                System.out.println("The guess is wrong ! The guess is too high!"
                        + "Guess high time is " + high);
            } else {
                low++;
                System.out.println("The guess is wrong ! The guess is too low!"
                        + "Guess low time is " + low);
            }
            //get another guess from the user
            System.out.print("Please enter a guess number between 1 and 10 again:");
            guess = scan.nextInt();
            gn++;
        }
        //print message saying guess is right
        System.out.println("The guess is right ! Guess number is " + gn);
    }

}
