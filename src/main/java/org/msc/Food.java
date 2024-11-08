package org.msc;

public class Food extends Product {

    public Food (String name, double price){
        super (name, price);
    }

    private double discount(){
        double discount = this.price *= 0.10;
        return discount;
    }

    public double getDiscount() {
        return price - discount();
    }
}
