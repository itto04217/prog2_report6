package jp.ac.uryukyu.ie.e245714;

public class Drink {
    private String name;
    private int price;
    private int stock;

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public int getStock(){
        return this.stock;
    }

    public void setStock(int newStock){
        this.stock = newStock;
    }
    
    public Drink(String name,int price,int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
