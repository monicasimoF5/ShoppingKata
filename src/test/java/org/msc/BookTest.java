package org.msc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void whenBookDiscount_thenDiscount() {
        //Given
        Book book = new Book("Harry Potter", 20.0);
        //When
        book.discount();
        //Then
        assertEquals(2.0, book.getPrice(), 0.01);
    }
}