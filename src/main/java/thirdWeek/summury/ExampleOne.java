package thirdWeek.summury;

import java.util.Arrays;

/**
 * задание 1
 * Создайте массив из 10 случайных целых чисел из интервала [1;50]
 * Выведите массив на консоль в строку.
 * Замените каждый элемент с нечетным индексом на ноль.
 * Полученный массив отсортируйте по возрастанию элементов
 * Снова выведете массив на консоль в отдельной строке.
 *
 *
 *
 */
public class ExampleOne {
    public static void main(String[] args) {
        int[] array = {3,4,8,45,34,2,45,34,42,7};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 1){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
