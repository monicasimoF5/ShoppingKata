package org.msc;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FreeProductTest {

    @Test
    public void elPrecioDeLosProductosGratuitosEsSiempreCero() {
        FreeProduct freeProduct = new FreeProduct("perejil");
        assertEquals(0.0, freeProduct.getPrice());
        assertEquals("perejil", freeProduct.getName());
    }

    @Test
    public void whenFoodHaveDiscount_thenPriceWithDiscount(){
        Food food = new Food ("Carxofa",100);
        assertEquals(90, food.getDiscount());
    }



}