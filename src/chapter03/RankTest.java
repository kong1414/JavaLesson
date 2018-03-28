package chapter03;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/28 13:21
 */
public class RankTest {
    enum Rank {
        ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king
    }

    public static void main(String[] args) {
        Rank highCard = Rank.ace;
        Rank faceCard = Rank.jack;
        System.out.println("A blackjack hand: " + highCard + " and " + faceCard);

        Rank card1 = Rank.two;
        Rank card2 = Rank.three;
        // 默认情况下，枚举类会给所有的枚举变量一个默认的次序，该次序从0开始，类似于数组的下标。
        // 而.ordinal()方法就是获取这个次序（或者说下标）
        // 所以结尾还要加 1 才能代表卡片的数字
        int card1Val = card1.ordinal() + 1;
        int card2Val = card2.ordinal() + 1;

        System.out.println("A two card hand: " + card1 + " " + card2);
        System.out.println("Hand value: " + (card1Val + card2Val));

    }
}
