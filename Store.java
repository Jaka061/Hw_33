package hw32;

public class Store {
     Sellable [] sellables ;

    public Store (int size) {
        if (size > 0) sellables = new Sellable[size];
    }
}
