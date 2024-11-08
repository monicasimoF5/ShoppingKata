package org.msc;

public class Book extends Product{

    public Book (String name, double price){
        super (name, price);
    }

    public void discount() {
        this.price *= 0.10;
    }
}
