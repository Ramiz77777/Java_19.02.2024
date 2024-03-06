package firstWeek.lesson_27_02_2024;

import java.util.Arrays;

/**
 *   Вычислить сумму модулей элементов массива  (для вычисления модуля используйте Math.abs() )
 */
public class ModulsSum {
    public static void main(String[] args) {
        calculateModulsSum();
    }

    private static void calculateModulsSum() {
        int[] array = {-2,3,-2,-10};
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                array[i] = array[i] * -1;
            }
            else if(array[i] > 0){
                array[i] = array[i] *1;
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+= array[i];
        }
        System.out.println(sum);
    }
}
