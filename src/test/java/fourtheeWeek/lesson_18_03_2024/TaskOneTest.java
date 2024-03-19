package fourtheeWeek.lesson_18_03_2024;

import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TaskOneTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("beforeAll");
    }
    @AfterAll
    static void aftelAll(){
        System.out.println("afterAll");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("beforeEach");
    }
    @AfterEach
    void afterEach(){
        System.out.println("afterEach");
    }


    @Test
    void getNumbersSuccessTest() {
        int[] array = {1,2,3,5};
        assertEquals(Arrays.toString(array),Arrays.toString(TaskOne.getNumbers()));
        System.out.println("test getNumbersSuccessTest");
    }
    @Test
    void getNumbersFailTest() {
        int[] array = {1,2,3,4};
        assertNotEquals(Arrays.toString(array),Arrays.toString(TaskOne.getNumbers()));
        System.out.println(" test getNumbersFailTest");
    }
    @Test
    void getLenghtOfArraySuccessTest(){
        assertEquals(4,TaskOne.getNumbers().length);
//        assertTrue(4 == TaskOne.getNumbers().length);
//        assertFalse(5 == Main.getNumbers().length); dla etogo noviy method tak kak logika u nego drugaya
    }
    @Test
    void getNumbersLenghtFailedTest(){
        assertNotEquals(5,TaskOne.getNumbers().length);
        assertNotEquals(3,TaskOne.getNumbers().length);

    }
}