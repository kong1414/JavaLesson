package chapter08.p1;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/18 10:17
 */
public abstract class Dog {
    protected String name;
    // ------------------------------------------------------------
    // Constructor -- store name
    // ------------------------------------------------------------

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    // ------------------------------------------------------------
    // Returns the dog's name
    // ------------------------------------------------------------
    public String getName() {
        return name;
    }

    // ------------------------------------------------------------
    // Returns a string with the dog's comments
    // ------------------------------------------------------------
    public String speak() {
        return "Woof";
    }

    public abstract int avgBreedWeight();
}
