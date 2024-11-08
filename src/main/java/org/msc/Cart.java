package org.msc;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> cart = new ArrayList<>();

    public Cart(){
        this.cart.add(new FreeProduct("perejil"));
        this.cart.add(new Food("patata", 2));
        this.cart.add(new Book("libro1", 10));
    }

    public void addProduct (String addName, double addPrice){
        for (Product product : cart){
            if (addName.equals(product.getName())){
                throw new IllegalArgumentException("Este producto ya existe en el carrito.");
            }
        }
    }
}
