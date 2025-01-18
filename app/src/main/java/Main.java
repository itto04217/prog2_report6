import java.util.ArrayList;
import jp.ac.uryukyu.ie.e245714.*;

public class Main {
    public static void main(String[] args){
        var drinks = new ArrayList<Drink>();

        Drink cola = new Drink("コーラ",180,5);
        Drink water = new Drink("水",130,0);
        Drink fanta = new Drink("ファンタ",150,5);

        drinks.add(cola);
        drinks.add(water);
        drinks.add(fanta);
        
        System.out.println("*お金も足りており、在庫も残っている場合");
        VendingMachine vendingMachine1 = new VendingMachine(500);
        vendingMachine1.printDrinks(drinks);
        vendingMachine1.buy(3,drinks);

        System.out.println("*お金が足りていない場合");
        VendingMachine vendingMachine2 = new VendingMachine(50);
        vendingMachine2.buy(3,drinks);

        System.out.println("*在庫がなく売り切れている場合");
        VendingMachine vendingMachine3 = new VendingMachine(500);
        vendingMachine3.buy(2,drinks);

        System.out.println("*お金も足りておらず、売り切れている場合");
        VendingMachine vendingMachine4 = new VendingMachine(30);
        vendingMachine4.buy(2,drinks);

        System.out.println("*飲み物の補充");
        vendingMachine3.replenish(7,2,drinks);
    }
}
