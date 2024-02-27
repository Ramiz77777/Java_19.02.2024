package lesson_27_02_2024;

/**
 * Найти среднее арифметическое от всех элементов массива
 */
public class AverageInArray {
    public static void main(String[] args) {
        double[] array = new double[5];
        array[0]= 4;
        array[1]= 23;
        array[2]= 32;
        array[3]= 44;
        array[4]= 41;
        double sum = array[0];
        for (int i = 0; i < array.length; i++) {
            sum +=array[i];
        }
        System.out.println(sum);
        double result = sum / 5;
        System.out.println(result);
    }
}
