package hw32;

public class Water implements Sellable{

    @Override
    public void sell() {
        System.out.println("Продовать воду .");
    }

    public void drink(){
        System.out.println("Надо выпить .");
    }
}
