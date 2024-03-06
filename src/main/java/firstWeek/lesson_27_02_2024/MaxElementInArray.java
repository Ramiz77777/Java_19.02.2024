package firstWeek.lesson_27_02_2024;

/**
 * В массиве найти максимальный элемент
 */
public class MaxElementInArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 324;
        array[1] = 432;
        array[2] = 243;
        array[3] = 1432;
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);

    }

}
