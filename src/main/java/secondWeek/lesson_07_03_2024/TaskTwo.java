package secondWeek.lesson_07_03_2024;

import java.util.Random;

/**
 * Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
 * записанных в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
 */
public class TaskTwo {
    public static void main(String[] args) {
        Random random = new Random();
        double randomValue = random.nextDouble(20); // 8.5
        double randomValue2 = random.nextDouble(20); // 11.45
        System.out.println(randomValue);
        System.out.println(randomValue2);
//        double firstValue = 7.5;
//        double secondValue = 9.9;
            if( randomValue > randomValue2 ){
                System.out.println(randomValue - 10);
            }
            else {
                System.out.println(10 - randomValue);
            }

    }
//    Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите значение для переменной m: ");
//    double m = scanner.nextDouble();
//
//        System.out.print("Введите значение для переменной n: ");
//    double n = scanner.nextDouble();
////        double m = 8.5;
////        double n = 11.45;
//
////        double mDifference = Math.abs(10 - m);
////        double nDifference = Math.abs(10 - n);
//
//    double mDifference = (m > 10) ? m - 10 : 10 - m;
//    double nDifference = (n > 10) ? n - 10 : 10 - n;
//
//        if (mDifference < nDifference) {
//        System.out.println("Ближайшее к 10: " + m);
//    } else if (mDifference > nDifference) {
//        System.out.println("Ближайше к 10: " + n);
//    } else {
//        System.out.println("Оба числа на равном расстоянии от 10: " + m + " и " + n);
//    }
//}

    /**
     * double num1 = 8.5;
     *         double num2 = 11.45;
     *         int ten = 10;
     *         double b = Math.abs(ten - num1);
     *         double c = Math.abs(ten - num2);
     *         if (b == c) {
     *             System.out.println("Numbers " + num1 + " and " + num2 + " equidistant about " + ten);
     *         }
     *         if (b > c) {
     *             System.out.println("Number " + num2 + " closer to " + ten);
     *         }
     *         if (b < c) {
     *             System.out.println("Number " + num1 + " closer to " + ten);
     *         }
     */
}
