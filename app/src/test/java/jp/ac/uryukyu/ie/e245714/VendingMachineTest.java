package jp.ac.uryukyu.ie.e245714;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

/**
 * VendingMachineのテストをする。
 */
class VendingMachineTest {
   
    /**
     * buyのテスト
     * 飲み物を購入した後、しっかり在庫数が減らされているかを確認する。
     * ここでは、在庫5本あるコーラを、3本購入して、残りの在庫が2本になっているかを確かめている。
     */
    @Test
    void buyTest(){
        var drinks1 = new ArrayList<Drink>();

        Drink cola = new Drink("コーラ",180,5);
        drinks1.add(cola);
            
        VendingMachine vendingMachine = new VendingMachine(500);

        vendingMachine.printDrinks(drinks1);
        
        vendingMachine.buy(1,drinks1);
        vendingMachine.buy(1,drinks1);
        vendingMachine.buy(1,drinks1);
        
        int expectedStock1 = 2;

        assertEquals(expectedStock1,cola.getStock());
    }

    /**
     * replenishのテスト
     * 飲み物を補充した後、しっかり在庫数が増えているかを確認する。
     * ここでは、在庫5本あるコーラをさらに8本補充して、在庫数が13本になっているかを確かめている。
     */
    @Test
    void replenishTest(){
        var drinks2 = new ArrayList<Drink>();

        Drink cola = new Drink("コーラ",180,5);
        drinks2.add(cola);
            
        VendingMachine vendingMachine = new VendingMachine(500);

        vendingMachine.printDrinks(drinks2);

        vendingMachine.replenish(8,1,drinks2);

        int expectedStock2 = 13;

        assertEquals(expectedStock2,cola.getStock());
    }
}
