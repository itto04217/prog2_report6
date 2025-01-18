package jp.ac.uryukyu.ie.e245714;
import java.util.ArrayList;

/**
 * 飲料自動販売機の機能をまとめたクラス。
 */
public class VendingMachine {

    private int coin;
    
    /**
     * 自動販売機の生成。
     * @param coin 自動販売機に投入した金額
     */
    public VendingMachine(int coin){
        this.coin = coin;
        System.out.println("お金を"+coin+"円,投入しました！");
    }
    
    /**
     * 自動販売機で買うことができる飲み物の一覧を表示する。
     * 飲み物の名前、値段が表示される。売り切れている場合は横に「⚠️売り切れ」と表示される。
     * @param drinks　買うことができる飲み物のリスト
     */
    public static void printDrinks(ArrayList<Drink> drinks) {
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
   
    /**
     * 飲み物を選択し、購入する。購入できない場合は、その理由(売り切れ、または金額不足)が表示される。
     * 飲み物の在庫の数を減らし、お釣りを計算して表示する。
     * @param drinkNumber 飲み物一覧から、何番目の商品を選ぶか表す数字
     * @param drinks　買うことができる飲み物のリスト
     */
    public void buy(int drinkNumber,ArrayList<Drink> drinks){
        System.out.println(drinkNumber+"番目の商品"+drinks.get(drinkNumber-1).getName()+"を選択しました。");
        if (coin >= drinks.get(drinkNumber-1).getPrice() && drinks.get(drinkNumber-1).getStock() > 0){
           System.out.print("購入できました！");
           int oturi = coin - drinks.get(drinkNumber-1).getPrice();
           System.out.println("お釣りは"+oturi+"円になります。取り忘れないようにしましょう。");
           int newStock = drinks.get(drinkNumber-1).getStock() - 1;
           drinks.get(drinkNumber-1).setStock(newStock);
        }else if(drinks.get(drinkNumber-1).getStock() > 0){
            int tarinai = drinks.get(drinkNumber-1).getPrice() - coin ;
            System.out.println("お金が"+tarinai+"円足りません。");
        }else if(coin >= drinks.get(drinkNumber-1).getPrice()){
            System.out.println("売り切れです。");
        }else{
            System.out.println("お金も足りていないし、売り切れています。");
        }
    }
    
    /**
     * 飲み物の補充。在庫の数を増やす。
     * @param increase　増やしたい本数
     * @param drinkNumber　増やしたい飲み物が何番目の商品かを表す数字
     * @param drinks　買うことできる飲み物のリスト
     */
    public void replenish(int increase,int drinkNumber,ArrayList<Drink> drinks){
        int newStock = drinks.get(drinkNumber-1).getStock() + increase;
        drinks.get(drinkNumber-1).setStock(newStock);
        System.out.println(drinkNumber+"番目の商品,"+drinks.get(drinkNumber-1).getName()+"を"+increase+"本、補充しました。");
        System.out.println("現在の在庫は"+drinks.get(drinkNumber-1).getStock()+"本です。");
    }
}