package firstWeek.lessonSummury01_03_2024;

/**
 * Написать код по определению значения и индекса минимального по модулю числа в массиве.
 * Массив элементов инициализировать положительными и отрицательными числами
 * 10, -5, 8, -12, 3, 6, 0.
 *
 * Какие будут составные части программы?
 * Какие конструкции нам понадобятся?
 * Будем ли использовать сторонние библиотеки?
 *
 * 3.
 * Написать код для подсчета положительных четных чисел массива
 *
 * Какие будут составные части программы?
 * Какие конструкции будем использовать?
 *
 * 4
 * 1. Написать код для инвертирования исходного массива {5,5,5,5,5}
 *
 * 2. Написать код для инвертирования исходного массива {2,4,6,8,10}
 *
 * Полученный результат сохранить в новом массиве
 * Распечатать полученный результат
 */
public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {10, -5, 8, -12, 3, 6, 0};
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i]; //10
            array[i] = array[array.length - i - 1]; // 10 = 7  - 0  - 1
            array[array.length - i - 1] =  tmp; // 0 = 10
        }
        System.out.println(array.length-1);

    }


        ArrayExample arrayExample = new ArrayExample();

//        System.out.println(Arrays.toString(arrayExample.printModul(array)));
//        arrayExample.printMinValueAndIndex(array);


    public int[] printModul(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                array[i] = array[i] * -1;
            }

        }
        return array;
    }
    public void printMinValueAndIndex(int[] array){
        printModul(array);
        int counter = 0;
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < minimum){
                minimum = array[i];
                counter = i;
            }

        }
        System.out.println("index is " + counter);

        System.out.println("min value is " + minimum);
    }

}
