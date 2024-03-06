package firstWeek.lesson_27_02_2024;

/**
 * Найти в массиве те элементы, значение которых меньше среднего арифметического,
 * взятого от всех элементов массива
 */
public class LoverValueInAmount {
    public static void main(String[] args) {
        int[] array = {232, 13, 323, 12, 13, 41, 2};
        int sum = array[0];
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        sum = sum / 7;
        System.out.println(sum);
        System.out.println("==========");

        for (int i = 0; i < array.length; i++) {
            if (array[i] < sum) {
                System.out.println(array[i]);
            }
        }
    }
}

