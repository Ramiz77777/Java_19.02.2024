package thirdWeek.lesson_13_03_2024;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {100, -101, -9, 0, 5, 10};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        int tmp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    isSorted = false;
                }

            }
        }

    }
}
