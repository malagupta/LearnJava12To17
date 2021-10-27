package com.ejg.records;

import com.ejg.records.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    @DisplayName("Should Allow Correctly Retrieving Point As A Key In Collection Classes")
    void ShouldAllowCorrectlyRetrievingPointAsAKeyInCollectionClasses() {
        final var point = new Point(12, 10);
        HashMap<Point, String> map = new HashMap<>();
        map.put(point, "HelloWorld");
        assertEquals("HelloWorld", map.get(new Point(12, 10)));
    }
}
