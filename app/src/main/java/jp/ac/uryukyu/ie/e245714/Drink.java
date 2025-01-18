package jp.ac.uryukyu.ie.e245714;

/**
 * 飲み物について必要な情報をまとめたクラス
 */
public class Drink {
    private String name;
    private int price;
    private int stock;

    /**
     * nameのgetterメソッド
     * @return 飲み物の名前
     */
    public String getName(){
        return this.name;
    }

    /**
     * priceのgetterメソッド
     * @return　飲み物の値段
     */
    public int getPrice(){
        return this.price;
    }

    /**
     * stockのgetterメソッド
     * @return　飲み物の在庫数
     */
    public int getStock(){
        return this.stock;
    }

    /**
     * stockのsetterメソッド
     * @param newStock　変更したい在庫数
     */
    public void setStock(int newStock){
        this.stock = newStock;
    }
    
    /**
     * コンストラクタ
     * @param name 名前
     * @param price　値段
     * @param stock　在庫数
     */
    public Drink(String name,int price,int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
