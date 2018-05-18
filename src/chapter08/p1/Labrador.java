package chapter08.p1;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/18 10:18
 */
public class Labrador extends Dog {
    private String color;
    //black, yellow, or chocolate?
    private int breedWeight = 75;

    public Labrador(String name, String color) {
        super(name);
        this.color = color;
    }

    // ------------------------------------------------------------
    // Big bark -- overrides speak method in Dog
    // ------------------------------------------------------------
    @Override
    public String speak() {
        return "WOOF";
    }

    // ------------------------------------------------------------
    // Returns weight
    // ------------------------------------------------------------
    @Override
    public int avgBreedWeight() {
        return breedWeight;
    }
}
