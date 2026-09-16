package com.Billing.org;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    void testZeroUnits() {
        assertEquals(0.0, App.calculateBill(0), 0.01);
    }

    @Test
    void testFirstSlab() {
        assertEquals(0.00, App.calculateBill(75), 0.01);
    }

    @Test
    void testSecondSlab() {
        assertEquals(500.00, App.calculateBill(200), 0.01);
    }

    @Test
    void testThirdSlab() {
        assertEquals(2000.00, App.calculateBill(400), 0.01);
    }

    @Test
    void testFourthSlab() {
        assertEquals(9000.00, App.calculateBill(750), 0.01);
    }

    @Test
    void testAbove500Units() {
        assertEquals(27000.00, App.calculateBill(1800), 0.01);
    }

    @Test
    void testNegativeUnits() {
        assertThrows(
                IllegalArgumentException.class,
                () -> App.calculateBill(-10)
        );
    }
}
