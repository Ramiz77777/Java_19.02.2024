package homeWorks.secondWeek.homework_13_03_2024;

import java.util.Arrays;

/**
 *  1 уровень сложности: Реализовать бинарный поиск с помощью итеративного подхода(через циклы)
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{2,3,6,1,4};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(searchWithBinarySystem(array,2));
    }
    public static int searchWithBinarySystem(int[] array,int searchNumber){
        int middleIndex = array[0] + (array.length-1 + array[0])/2;

        for (int i = 0; i < array.length; i++) {
            if(middleIndex > searchNumber){

            }
        }
        if(array[array.length-1] > array[0]){
            array[0] = array[array.length-1];
            if(array[middleIndex] == searchNumber){
                return middleIndex;
            }
            if(array[middleIndex] > searchNumber){
                return array[middleIndex]--;
            }
            else {
                return array[middleIndex]++;
            }

        }
        return -1;
    }
}
