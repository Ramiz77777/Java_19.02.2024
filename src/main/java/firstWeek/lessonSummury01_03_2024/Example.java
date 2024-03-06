package firstWeek.lessonSummury01_03_2024;

import java.util.Arrays;

/**
 * 1
 * Написать код инициализирующий массив из трех элементов известными вам способами инициализации (способам записи).
 *
 * Как вы считаете, а можно инициализировать массив различными типами данных?
 *
 * А есть ли разница между созданием массива и заполнением его N элементами, например нулями или просто созданием массив размером N элементов? Напишите код подтверждающий вашу теорию
 *
 * *Напишите код в отдельном методе, который сравнит массивы
 */
public class Example {
    public static void main(String[] args) {
        int[] array = new int[3];


        int[] array2 = {2,3,4};
        for (int i = 0; i < array.length; i++) {
            Arrays.fill(array,5);
        }
//        int[] array3 = new int[54];
//        for (int i = 0; i < array3.length; i++) {
//            array[i] = 5;
//        }
//        Objects[] array5 = new Objects[3];
        Example.printInfo(array,array2);


//        List<int[]> array6 = Arrays.asList(array);
    }

    public static void printInfo(int[] array,int[] array2){
        int counter = 0;


        if(array.equals(array2)){
            System.out.println("same");
        }
        else {
            System.out.println("not same");
        }

    }


}
