import java.util.ArrayList;
import jp.ac.uryukyu.ie.e245714.*;

public class Main {
    public static void main(String[] args){
        var drinks = new ArrayList<String>();

        Drink cola = new Drink("コーラ",180);
        Drink water = new Drink("水",130);
        Drink fanta = new Drink("ファンタ",150);

        drinks.add(cola.getName());
        drinks.add(water.getName());
        drinks.add(fanta.getName());
        
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.print(drinks);
    }
}
