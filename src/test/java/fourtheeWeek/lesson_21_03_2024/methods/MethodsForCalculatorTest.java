package fourtheeWeek.lesson_21_03_2024.methods;

import fourtheeWeek.lesson_21_03_2024.utils.Util;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsForCalculatorTest {

    @Test
    void getDivisionByZeroTest() {
            assertNull(MethodsForCalculator.getDivision(10,0));
    }
    @Test
    void getDivisionPositiveTest() {
        assertEquals(3,MethodsForCalculator.getDivision(9,3));
    }
    @Test
    void getDivisionNegativeTest() {
        assertNotEquals(3,MethodsForCalculator.getDivision(9,2));
    }

    @Test
    void getMultiplicationTest() {
        double value = 25;
        assertEquals(value, MethodsForCalculator.getMultiplication(5,5));
    }
    @Test
    void getMultiplicationByZeroTest() {
        assertEquals(0, MethodsForCalculator.getMultiplication(5,0));
    }

    @Test
    void getMinusPositiveValueTest() {
        double value = 10;
        assertEquals(value,MethodsForCalculator.getMinus(25,15));
    }
    @Test
    void getMinusNegativeValueTest() {
        double value = -10;
        assertEquals(value,MethodsForCalculator.getMinus(15,25));
    }
    @Test
    void getMinusZeroValueTest() {
        double value = 10;
        assertEquals(value,MethodsForCalculator.getMinus(10,0));
    }
    @Test
    void getMinusInvalidResultTest() {
        double value = 10;
        assertNotEquals(value,MethodsForCalculator.getMinus(90,0));
    }

    @Test
    void getPlusPositiveValueTest() {
        double value = 10;
        assertEquals(value,MethodsForCalculator.getPlus(5,5));
    }
    @Test
    void getPlusNegativeValueTest() {
        double value = -10;
        assertEquals(value,MethodsForCalculator.getPlus(-5,-5));
    }
    @Test
    void getPlusInvalidValueTest() {
        double value = 15;
        assertNotEquals(value,MethodsForCalculator.getPlus(-5,-5));
    }
    @Test
    void getPlusZeroValueTest() {
        double value = 15;
        assertEquals(value,MethodsForCalculator.getPlus(15,0));
    }
}