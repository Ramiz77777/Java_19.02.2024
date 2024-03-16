package thirdWeek.summury;

import java.util.Arrays;

/**
 * задание 2
 *  * Создайте массив из 5 случайных целых чисел из интервала [10;99]
 *  * Выведите его на консоль в строку.
 *  * Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
public class TaskTwo {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        boolean flag = true;
        for (int i = 1; i < array.length ; i++) {
            if(array[i] <= array[i - 1]){
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "vozrastayushiy" : " ne vozrastayushiy");
    }
}
