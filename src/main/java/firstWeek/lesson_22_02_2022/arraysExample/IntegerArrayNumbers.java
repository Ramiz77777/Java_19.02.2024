package firstWeek.lesson_22_02_2022.arraysExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

/*
Задача
Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива, вернув новый массив нужной длинны.
 */
public class IntegerArrayNumbers {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 6, 7, 5};
        int deletedvalue = 5;

        System.out.println(Arrays.toString(extracted(array, deletedvalue)));
//        System.out.println(Arrays.toString(extracted(array,value)));
    }




    private static int[] extracted(int[] array, int value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                counter++; //2
            }
        }

            int[] arrayTwo = new int[array.length - counter]; //6-2=4
            int index = 0;
            for (int j = 0; j < array.length; j++) { //2 3 5 6 7 5
                if (array[j] != value) { //      2!=5    3 !=5     5!=5      6!=5     7!=5     5!=5
                    arrayTwo[index++] = array[j];  // 1,2,3,4 = +znaceniye
                }
            }
        return arrayTwo;
        }
    }

//        int value = 5;
//        int count = 0;
//        for (int element : array) {
//            if (element == value) {
//                count++;
//            }
//        }
//            int[] arrayTwo = new int[array.length-count];
//            int index = 0;
//            for(int element : array){
//                if(element != value){
//                    arrayTwo[index++] = element;
//                }
//            }
//
//        System.out.println(Arrays.toString(arrayTwo));


