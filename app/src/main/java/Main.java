import java.util.ArrayList;
import jp.ac.uryukyu.ie.e245714.*;

public class Main {
    public static void main(String[] args){
        var drinks = new ArrayList<Drink>();

        Drink cola = new Drink("コーラ",180);
        Drink water = new Drink("水",130);
        Drink fanta = new Drink("ファンタ",150);

        drinks.add(cola);
        drinks.add(water);
        drinks.add(fanta);

        VendingMachine vendingMachine = new VendingMachine(20);

        vendingMachine.print(drinks);
        vendingMachine.select(3,drinks);
    }
}
