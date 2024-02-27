package lesson_27_02_2024;

/**
 * В массиве, содержащем положительные и отрицательные целые числа,
 * вычислить сумму четных положительных элементов
 */
public class AmountEvenNumber {
    public static void main(String[] args) {
        int[] array = {2,3,-12,-43,-5,18,20};
        int sum = array[0];
        for (int i = 0; i < array.length; i=i+2) {
            if(array[i] > 0){
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
