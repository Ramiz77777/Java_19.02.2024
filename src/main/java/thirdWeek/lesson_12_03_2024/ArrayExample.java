package thirdWeek.lesson_12_03_2024;

import java.util.Arrays;
import java.util.Random;

/**
 * 1. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
 * 2. Выведите массивы на экран в двух отдельных строках
 * 3. Посчитайте среднее арифметическое элементов каждого массива
 */
public class ArrayExample {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(6);
        }
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            value += array[i];
        }
        value = value /5;
        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(6);
        }
        int value2 = 0;
        for (int i = 0; i < array2.length; i++) {
            value2 += array2[i];
        }
        value2 = value2 /5;
        System.out.println(value);
        System.out.println(value2);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
