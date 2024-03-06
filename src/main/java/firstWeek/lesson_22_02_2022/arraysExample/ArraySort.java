package firstWeek.lesson_22_02_2022.arraysExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 Задача
 Отсортировать массив а[0..n] по возрастанию и по убыванию. Без использования Arrays.sort()
 */
public class ArraySort {
    public static void main(String[] args) {
        int[] array = {324,23412,21,334,5,343,324};
//        Arrays.stream(array).sorted().forEach(e-> System.out.println(e)); // тут нету метода Arrays.sort
        sortedArray(array);
            }




    public static void sortedArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            int tempVariable = array[i];
            if(tempVariable < array[i]){
            }
            System.out.println(array[i]);
        }
    }
}
