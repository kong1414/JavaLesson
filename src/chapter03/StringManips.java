package chapter03;

/**
 * @Description: Test several methods for manipulating String objects
 * @Author: QiuGuanLin
 * @Date: 2018/3/28 15:36
 */
public class StringManips {
    public static void main(String[] args) {
        String phrase = new String("This is a String test.");
        int phraseLength; // number of characters in the phrase String短语字符串中的字符数
        int middleIndex; // index of the middle character in the String字符串中中间字符的索引
        String firstHalf; // first half of the phrase String词组的前半部分
        String secondHalf; // second half of the phrase String短语字符串的后半部分
        String switchedPhrase; // a new phrase with original halves switched一种新短语，用原来的一半交换
// compute the length and middle index of the phrase计算短语的长度和中间索引
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;
// get the substring for each half of the phrase得到每一半的子字符串
        firstHalf = phrase.substring(0, middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
// concatenate the firstHalf at the end of the secondHalf
        switchedPhrase = secondHalf.concat(firstHalf);
// print information about the phrase
        System.out.println();
        System.out.println("Original phrase: " + phrase);
        System.out.println("Length of the phrase: " + phraseLength +
                " characters");
        System.out.println("Index of the middle: " + middleIndex);
        System.out.println("Character at the middle index: " +
                phrase.charAt(middleIndex));
        System.out.println("Switched phrase: " + switchedPhrase);
        System.out.println();
    }

}
