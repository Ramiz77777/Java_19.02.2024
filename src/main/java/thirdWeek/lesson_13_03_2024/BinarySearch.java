package thirdWeek.lesson_13_03_2024;

import java.util.Arrays;
import java.util.Random;

/**
 * Двоичный (бинарный) поиск (также известен как метод деления пополам или дихотомия) —
 * классический алгоритм поиска элемента в отсортированном массиве (векторе), использующий
 * дробление массива на половины. Используется в информатике, вычислительной
 * математике и математическом программировании.
 */
public class BinarySearch {
    public static final int ARRAY_LENGHT = 10;
    public static void main(String[] args) {
        int[] array = new int[ARRAY_LENGHT];
        Random random = new Random();
        for (int i = 0; i < ARRAY_LENGHT; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));

    }
//    public static int searchBinary(int[] array,int valueToFind){
//        int indexFirst = 0;
//        int indexLast =  array.length-1;
//        int tempValue ;
//        if(indexFirst <= indexLast){
//            tempValue = (valueToFind + indexLast) /2;
//        }
//    }
}
