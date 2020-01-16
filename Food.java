package hw32;

import org.w3c.dom.ls.LSOutput;

public class Food implements Sellable {
    @Override
    public void sell() {
        System.out.println("Продовать одежду .");
    }

    public void eat(){
        System.out.println("Надо сьесть .");
    }
}
