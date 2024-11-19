package org.msc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void todosLosProductosTienenNombreYPrecio() {
        //Given
        Product product = new Product("patata", 2);
        //When
        assertEquals("patata", product.getList());
        //Then
        assertEquals("patata", product.getName());
        assertEquals(2, product.getPrice());
    }


}