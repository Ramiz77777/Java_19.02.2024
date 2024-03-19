package fourtheeWeek.lesson_18_03_2024;

import java.util.Arrays;

public class TaskOne {
    public static void main(String[] args) {
        int[] arr = getNumbers();
        System.out.println(Arrays.toString(arr));
    }

    public static int[] getNumbers() {
        int[] arr = {1, 2, 3, 5};
        return arr;
    }
}
