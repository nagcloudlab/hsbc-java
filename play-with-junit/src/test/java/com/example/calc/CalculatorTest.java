package com.example.calc;

// Test Case

// A -> Arrange
// A -> Act
// A -> Assert

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    public static void init() {
        System.out.println("Before All init() method called");
    }

    @AfterAll
    public static void cleanUp() {
        System.out.println("After All cleanUp() method called");
    }

    @BeforeEach
    public void setUp() {
        // Arrange
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        // clean up
        calculator = null;
    }

    @Test
    public void testAdd() {
        // Act
        int result = calculator.add(1, 2);
        // Assert
        assertEquals(3, result);
    }

    @Test
    public void testSub() {
        // Act
        int result = calculator.sub(3, 2);
        // Assert
        assertEquals(1, result);
    }

    @Test
    public void testMul() {
        // Act
        int result = calculator.mul(3, 2);
        // Assert
        assertEquals(6, result);
    }

    @Test
    public void testDiv() {
        // Act
        int result = calculator.div(6, 2);
        // Assert
        assertEquals(3, result);
    }


}
