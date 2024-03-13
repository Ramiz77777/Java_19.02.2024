package thirdWeek.lesson_13_03_2024;

import java.util.Arrays;
import java.util.Random;


/**
 * lineyniy poisk s konca v nacalo
 */

public class LinearSearchForEndToStart {
    public static final int ARR_LENGHT = 10;

    public static void main(String[] args) {
        Random rand = new Random();
        int findEl = 0;
        int[] arr = new int[ARR_LENGHT];
        for (int i = 0; i < ARR_LENGHT; i++) {
            arr[i] = rand.nextInt(21) - 10;
        }
        System.out.println("findEl = " + findEl);
        System.out.println(Arrays.toString(arr));


        int res = lSearch(arr, findEl);
        if (res > -1) {
            System.out.println(findEl + " has index " + res);
        } else {
            System.out.println(findEl + " not found in the array");
        }
    }

    public static int lSearch(int[] arr, int findEl) {
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == findEl) {
                return i;
            }
        }
        return -1;
    }
}
