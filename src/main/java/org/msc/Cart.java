package org.msc;

import java.util.ArrayList;
import java.util.List;

public class Cart extends Product {
    private List<Product> cart = new ArrayList<>();

    public Cart(String name, double price) {
        super(name, price);
    }

    public void addProduct (String addName, double addPrice){

        for (Product product : cart){
            if (addName.equals(product.getName())){
                throw new IllegalArgumentException("Este producto ya existe en el carrito.");
            }
        }

        Product product = new Product(addName, addPrice);
        cart.add(product);
    }

    public List<Product> getCart(){
        return cart;
    }
}
