package hw32;

public class Clothes implements Sellable {
    @Override
    public void sell() {
        System.out.println("Продовать одежду .");
    }

    public void putOn(){
        System.out.println("Надо надеть ");
    }
}
