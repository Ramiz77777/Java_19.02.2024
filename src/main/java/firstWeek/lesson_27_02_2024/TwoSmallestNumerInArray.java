package firstWeek.lesson_27_02_2024;

import java.util.Arrays;

/**
 * В массиве целых чисел определить два наименьших элемента. Они могут быть как равны
 * между собой (оба являться минимальными), так и различаться
 */
public class TwoSmallestNumerInArray {
    public static void main(String[] args) {
        int[] array = {-10,2,43,5,34,-10};
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min && array[i]<=min2){
                min = min2;
                min2 = array[i];
                }
            else if(array[i] < min){
                min = array[i];

            }

            }
        System.out.println(min);
        System.out.println(min2);



        }
        }



