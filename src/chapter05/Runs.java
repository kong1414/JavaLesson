package chapter05;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/30 10:39
 */
public class Runs {
    public static void main(String[] args) {
        final int FLIPS = 100;
        // number of coin flips
        int currentRun = 0;
        // length of the current run of HEADS
        int maxRun = 0;
        // length of the maximum run so far
        // Create a coin object
        Coin myCoin = new Coin();
        // Flip the coin FLIPS times
        for (int i = 0; i < FLIPS; i++) {
            // Flip the coin & print the result
            myCoin.flip();
            // Update the run information
            if (myCoin.isHeads()) {
                currentRun++;
            } else {
                if (currentRun > maxRun) {
                    maxRun = currentRun;
                }
                currentRun = 0;
            }
        }
        // Print the results
        System.out.println("连续heads面朝上的最大次数为  " + maxRun + " 次.");
    }

}
