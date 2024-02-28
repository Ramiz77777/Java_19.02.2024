package lesson_28_08_2024;

/**
 * nayti sredneye arifmeticeskoye ot vsex elementov massiva
 */
public class ArithmeticMeanInArray {
    public static void main(String[] args) {
        ArithmeticMeanInArray arithmeticMeanInArray = new ArithmeticMeanInArray();
        int[] array = {10,20,30,30,10};
        System.out.println(arithmeticMeanInArray.arithmeticMean(array));

    }
    public double arithmeticMean(int[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

}
