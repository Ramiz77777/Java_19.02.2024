package thirdWeek.lesson_13_03_2024;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {0, -10, 100, 2, 15};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int first, int last) {
        if (last <= first) {
            return;
        }
        int pivot = partition(arr, first, last);
        quickSort(arr, first, pivot - 1);
        quickSort(arr, pivot + 1, last);
    }

    public static int partition(int[] arr, int first, int last) {
        int pivot = last;

        int counter = first;
        for (int i = first; i < last; i++) {
            if(arr[i] < arr[pivot]) {
                int tmp = arr[counter];
                arr[counter] = arr[i];
                arr[i] = tmp;
                counter++;
            }
        }
        int tmp = arr[pivot];
        arr[pivot] = arr[counter];
        arr[counter] = tmp;

        return counter;
    }
}
