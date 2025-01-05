package jp.ac.uryukyu.ie.e245714;
import java.util.ArrayList;

public class VendingMachine {
    public static <T> void print(ArrayList<T> drinks) {
        System.out.println("この自販機ではこれらの飲み物が買えます。");
        for(int i=0; i < drinks.size(); i++) {
            System.out.print(i+1);
            System.out.println(drinks.get(i));
        }
    }
}
