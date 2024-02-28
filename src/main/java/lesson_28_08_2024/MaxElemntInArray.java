package lesson_28_08_2024;

import java.util.Arrays;

/**
 * v massive nayti maximalniy element
 */
public class MaxElemntInArray {
    public static void main(String[] args) {
        int[] array = {3,4,5,6,7,8,9};
        int result = findMaxElementInArray(array);
        System.out.println(result);
    }

    private static int findMaxElementInArray(int[] array) {
        int maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxElement){
                maxElement = array[i];
            }
        }
        return maxElement;
    }
}
