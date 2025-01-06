package jp.ac.uryukyu.ie.e245714;
import java.util.ArrayList;

public class VendingMachine {

    private int price;

    public VendingMachine(int price){
        this.price = price;
        System.out.println("お金を"+price+"円,投入しました！");
    }

    public static <T> void print(ArrayList<Drink> drinks) {
        System.out.println("この自販機ではこれらの飲み物が買えます。");
        for(int i=0; i < drinks.size(); i++) {
            System.out.print(i+1+",");
            System.out.print(drinks.get(i).getName());
            if (drinks.get(i).getStock() == 0){
                System.out.print(drinks.get(i).getPrice()+"円");
                System.out.println(" ⚠️売り切れ ");
            }else{
                System.out.println(drinks.get(i).getPrice()+"円");
            }
        }
    }

    public void select(int i,ArrayList<Drink> drinks){
        System.out.println(i+"番目の商品"+drinks.get(i-1).getName()+"を選択しました。");
        if (price >= drinks.get(i-1).getPrice() && drinks.get(i-1).getStock() > 0){
           System.out.print("購入できました！");
           int oturi = price - drinks.get(i-1).getPrice();
           System.out.println("お釣りは"+oturi+"円になります。取り忘れないようにしましょう。");
           int newStock = drinks.get(i-1).getStock() - 1;
           drinks.get(i-1).setStock(newStock);
        }else if(drinks.get(i-1).getStock() > 0){
            int tarinai = drinks.get(i-1).getPrice() - price ;
            System.out.println("お金が"+tarinai+"円足りません。");
        }else if(price >= drinks.get(i-1).getPrice()){
            System.out.println("売り切れです。");
        }else{
            System.out.println("お金も足りていないし、売り切れています。");
        }
    }

    public void replenish(int honsuu,int i,ArrayList<Drink> drinks){
        int newStock = drinks.get(i-1).getStock() + honsuu;
        drinks.get(i-1).setStock(newStock);
        System.out.println(i+"番目の商品"+drinks.get(i-1).getName()+"を"+honsuu+"本、補充しました。");
    }
}
