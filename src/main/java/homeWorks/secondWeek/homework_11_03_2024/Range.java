package homeWorks.secondWeek.homework_11_03_2024;

/**
 * Загадать случайно 100 целых чисел в диапазоне от -100 до 100.
 * 		Вычислить процент положительных чисел, процент отрицательных чисел и
 * 		процент нулей. Вычислить процент чётных чисел и процент нечётных.
 */
public class Range {
    public static void main(String[] args) {
        getPercentageOfAllNumbers();
        System.out.print(randomValue(100,-100));

        }


    public static int randomValue(int min , int max) {
        int result =(int) (Math.random()* (max-min) +1)+ min;
        return result;
    }
    public static void getPercentageOfAllNumbers(){
        int counterOfPositiveNumber =0;
        int counterOfNegativeNumber = 0;
        int counterOfZero = 0;
        int countOfEven = 0;
        int countOfNonEven = 0;
        for (int i = 0; i < 100; i++) {
            int random = randomValue(-100, 100);
            if (random > 0) {
                counterOfPositiveNumber++;
            }
            else if(random < 0){
                counterOfNegativeNumber++;
            }
             else {
                counterOfZero++;
            }
             if(random % 2 == 0){
                countOfEven++;
            } if (random % 2 != 0) {
                countOfNonEven++;
            }
        }
        System.out.println("quantity of posivite numbers in procent is = " + counterOfPositiveNumber +
                           "\nquantity of negative numbers in procent is = " + counterOfNegativeNumber +
                            "\nquantity of zero in procent is = " + counterOfZero +
                            "\ncount of even number is " + countOfEven +
                            "\ncount of non even number is " + countOfNonEven);
    }






}
