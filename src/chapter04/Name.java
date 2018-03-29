package chapter04;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/3/29 18:50
 */
public class Name {
    private String first, middle, last;

    public Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    /**
     * @return 返回first names
     */
    public String getFirst() {
        return first;
    }

    /**
     * @return 返回middle name
     */
    public String getMiddle() {
        return middle;
    }

    /**
     * @return 返回 last name
     */
    public String getLast() {
        return last;
    }

    /**
     * @return 返回一个人的全名，如"Mary Jane Smith"
     */
    public String firstMiddleLast() {
        return first + " " + middle + " " + last;
    }

    /**
     * @return 返回一个人的全名，先出现last name，如"Smith, Mary Jane"
     */
    public String lastFirstMiddle() {
        return last + ", " + first + " " + middle;
    }

    /**
     * 如果当前name和otherName一致返回true，要求不区分大小写
     * （提示：String对象可以调用equalsIgnoreCase方法，
     * 使得两个String比较不区分大小写，如：string1. equalsIgnoreCase(string2)）
     *
     * @param otherName
     * @return
     */
    public boolean equals(String otherName) {
        String name = first + " " + middle + " " + last;
        return name.equalsIgnoreCase(otherName);
    }

    /**
     * 返回人名得缩写（first, middle, 和 last names的首字母，共3个字母），
     * 必须全是大写字母（提示：不使用charAt方法，使用substring方法得到字符串的子串，
     * 然后调用toUpperCase方法转成大写，详见P77或API文档）
     *
     * @return 返回人名得缩写
     */
    public String initials() {
        return first.toUpperCase().substring(0, 1) + middle.toUpperCase().substring(0, 1) + last.toUpperCase().substring(0, 1);
    }

    /**
     * @return 返回人名中的字母数，不含空格
     */
    public int length() {
        String name = first + middle + last;
        return name.length();
    }

}
