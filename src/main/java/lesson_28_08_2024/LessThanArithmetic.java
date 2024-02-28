package lesson_28_08_2024;

import java.util.Arrays;

/**
 * nayti v massive te elementi, znaceniye kotorix menshe srednego arifmeticeskogo
 * vzatogo ot vsex elementov massiva
 */
public class LessThanArithmetic {
    public static void main(String[] args) {
        double[] array ={2,3,4,5,6};
        double sum = findArithmeticMean(array);
        System.out.println(Arrays.toString(findLessThanArithmeticMean(array)));

    }
    public static double findArithmeticMean(double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum+ array[i];
        }
        return sum / array.length;
    }

    public static double[] findLessThanArithmeticMean(double[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < findArithmeticMean(array)){
                counter++;
            }
        }
        double[] newArray = new double[counter];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = findArithmeticMean(array);
        }
        return newArray;

    }

}
