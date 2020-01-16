package hw32;

public class Main {
    public static void main(String[] args) {

        Store store = new Store (3);

        store.sellables[0] = new Water();
        store.sellables[1] = new Food();
        store.sellables[2] = new Clothes();

        Sellable water = new Water();
        Sellable food = new Food();
        Sellable clothes = new Clothes();

        for(Sellable sellable : store.sellables){
            if(sellable instanceof Water){
                ((Water) sellable).drink();
            }
            else if(sellable instanceof Food){
                ((Food) sellable).eat();
            }
            else if(sellable instanceof Clothes){
                ((Clothes) sellable).putOn();
            }
        }


    }
}
