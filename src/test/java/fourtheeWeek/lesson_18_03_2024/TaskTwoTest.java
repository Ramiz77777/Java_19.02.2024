package fourtheeWeek.lesson_18_03_2024;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTwoTest {
    int[] array;
    TaskTwo taskTwo ;
    @BeforeEach
    void method(){
        array = new int[]{2,4,6,435,54,23};
        taskTwo = new TaskTwo();
    }

    @Test
    void findMaxElementSuccessTest() {

        assertEquals(435,taskTwo.findMax(array));
    }
    @Test
    void findMaxElementFailTest() {
        assertNotEquals(2,taskTwo.findMax(array));
    }
    @Test
    void isArrayEmplty(){
        assertNotEquals(0,array); //proverka pustoy li massiv
    }
    @Test
    void returnTrueIndexInArray(){
        assertEquals(array[3],taskTwo.getElementByIndex(array,3)); //proverka 3 index raven 3
    }
    @Test
    void returnFalseIndexInArray(){
        assertNotEquals(array[2],taskTwo.getElementByIndex(array,3)); // proverka 2 index ne raven 3 indexu
    }

}