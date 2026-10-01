package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void addsTwoNumbers() {
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.0001);
    }

    @Test
    void subtractsTwoNumbers() {
        assertEquals(1.0, calculator.subtract(4.0, 3.0), 0.0001);
    }

    @Test
    void multipliesTwoNumbers() {
        assertEquals(12.0, calculator.multiply(4.0, 3.0), 0.0001);
    }

    @Test
    void dividesTwoNumbers() {
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.0001);
    }

    @Test
    void divisionByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(6.0, 0.0));
    }
}