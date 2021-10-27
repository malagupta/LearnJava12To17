package com.ejg.records;

import com.ejg.records.Rectangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    @DisplayName("Should not allow creation of Rectangle using negative length")
    void shouldThrowExceptionForNegativeRectangleLength() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-12, 10));
    }
    
    @Test
    @DisplayName("should Not Throw Exception For Positive Rectangle Length")
    void shouldNotThrowExceptionForPositiveRectangleLength() {
        assertDoesNotThrow(() -> new  Rectangle(11, 22).length());
    }
}
