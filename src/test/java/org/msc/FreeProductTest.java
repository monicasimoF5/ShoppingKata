package org.msc;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FreeProductTest {

    @Test
    public void elPrecioDeLosProductosGratuitosEsSiempreCero_losProductosGratuitosTienenNombre() {
        //Given
        FreeProduct freeProduct = new FreeProduct("perejil");
        //When
        assertEquals(0.0, freeProduct.getPrice());
        //Then
        assertEquals(0.0, freeProduct.getName());
    }




}