package chapter08.p1;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/5/18 10:19
 */
public class DogTest {
    public static void main(String[] args) {
        Labrador labrador = new Labrador("labrador", "red");
        System.out.println(labrador.getName() + " says " + labrador.speak());
        System.out.println(labrador.getName() + " breedweight " + labrador.avgBreedWeight());

        Yorkshire yorkshire = new Yorkshire("yourkshire");
        System.out.println(yorkshire.getName() + " says " + yorkshire.speak());
        System.out.println(yorkshire.getName() + " breedweight " + yorkshire.avgBreedWeight());
    }
}

