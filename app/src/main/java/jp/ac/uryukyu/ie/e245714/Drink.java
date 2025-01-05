package jp.ac.uryukyu.ie.e245714;

public class Drink {
    String name;
    int price;

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }
    
    public Drink(String name,int price){
        this.name = name;
        this.price = price;
    }
}
