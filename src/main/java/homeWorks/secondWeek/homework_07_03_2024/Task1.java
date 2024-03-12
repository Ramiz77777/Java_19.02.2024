package homeWorks.secondWeek.homework_07_03_2024;

import java.util.Arrays;

/**
 *  1 уровень сложности: 1. В три переменные a, b и c явно записаны программистом
 *  три целых попарно неравных между собой числа. Создать программу, которая переставит
 *  числа в переменных таким образом, чтобы при выводе на экран последовательность
 *  a, b и c оказалась строго возрастающей.
 */
public class Task1 {
    public static void main(String[] args) {
        int [] array = new int[3];
        array[0] = 4;
        array[1] = 43;
        array[2] = 42;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
