package thirdWeek.lesson_12_03_2024;

import java.util.Arrays;
import java.util.Random;

/**
 * 1. Создайте 2х мерный массива из 5 случайных целых чисел
 * 2. Выведите массив на экран
 * 3. Посчитайте сумму элементов каждой строки
 */
public class TwoDimArray {
    public static void main(String[] args) {

        Random random = new Random();
        int result =0;
     int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                 result +=array[i][j];
            }
            System.out.println(result);
            result = 0;
        }

    }
}
