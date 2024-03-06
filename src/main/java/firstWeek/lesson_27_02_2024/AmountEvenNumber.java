package firstWeek.lesson_27_02_2024;

/**
 * В массиве, содержащем положительные и отрицательные целые числа,
 * вычислить сумму четных положительных элементов
 */
public class AmountEvenNumber {
    public static void main(String[] args) {
        int[] array = {2,3,-1,23,-23,32};
        System.out.println(extracted(array));
        System.out.println(array.toString());
    }

    private static int extracted(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i= i + 2) {
            if(array[i] > 0){
                sum += array[i];
            }
        }
        return sum;
    }
}
