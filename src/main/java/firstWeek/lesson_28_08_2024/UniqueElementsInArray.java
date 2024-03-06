package firstWeek.lesson_28_08_2024;

import java.util.Arrays;

/**
 * vv massive nayti elementi. kotoriye v nem vstrecayutsa tolko odin raz i vivesti ix na ekran
 * toest nayti i vivesti unikalniye elementi
 */
public class UniqueElementsInArray {
    public static void main(String[] args) {
        int[] array = {5, 3, 5, 11, 2, 5};
        int[] array2 = {11, 3, 5, 11, 2, 5};
        extracted(array2);
    }

    private static int[] extracted(int[] array) {

//        for (int i = 0; i < array.length; i++) {
//            if(array[i] != array[array.length-1]){
//                System.out.println(array[i]);
//            }
        int[] newArray = new int[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    break;
                } else {
                    newArray[counter] = array[i];
                    counter++;
                }
            }
        }
        newArray = Arrays.copyOf(newArray,counter);
        return newArray;
    }

}
