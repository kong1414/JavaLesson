package chapter08.p1;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/18 10:19
 */
public class Yorkshire extends Dog {
    private int breeWeight = 55;

    public Yorkshire(String name) {
        super(name);
    }

    // ------------------------------------------------------------
    // Small bark -- overrides speak method in Dog
    // ------------------------------------------------------------
    @Override
    public String speak() {
        return "woof";
    }

    @Override
    public int avgBreedWeight() {
        return breeWeight;
    }
}
