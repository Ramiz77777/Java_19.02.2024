package lesson_27_02_2024;

/**
 Найти номер минимального по модулю элемента массива
 */
public class MinOfModulInArray {
    public static void main(String[] args) {
        int[] array = {-2,2,10,3,-1};
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                array[i] = array[i] * -1;
            } else if (array[i] >0) {
                array[i] = array[i] * 1;
            }
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min);
    }

}
