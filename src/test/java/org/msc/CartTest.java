package org.msc;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void whenAddProduct_thenAddCart() {
        //Given
        Cart cart = new Cart("perejil", 10.0);
        // When
        cart.addProduct("cebolla", 10.0);
        assertThrows(IllegalArgumentException.class, () -> cart.addProduct("cebolla", 10.0));
        assertEquals(1, cart.getCart().size());
        // Then
        cart.addProduct("calabaza", 20.0);
        assertEquals(2, cart.getCart().size());
    }

    @Test
    void getCart() {
    }

}