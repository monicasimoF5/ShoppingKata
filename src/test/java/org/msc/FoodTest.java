package org.msc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {

    @Test
    public void whenFoodHaveDiscount_thenPriceWithDiscount (){
        //Given
        Food food = new Food("patata", 200);
        //When
        assertEquals("patata", food.getName());
        //Then
        assertEquals(180.0,food.getDiscount());
    }




}