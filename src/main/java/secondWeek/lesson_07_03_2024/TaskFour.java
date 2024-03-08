package secondWeek.lesson_07_03_2024;

import java.util.Scanner;

/**
 * В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
 * Создать программу, которая переставит числа в переменных таким образом,
 * чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.
 */
public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedi 3 cisla");
        int firstValue = scanner.nextInt(); // 5
        int secondValue = scanner.nextInt(); // 7
        int thirdValue = scanner.nextInt(); // 1
        if(firstValue <= secondValue && firstValue <= thirdValue && secondValue >= firstValue && secondValue <= thirdValue) {
            System.out.println(firstValue + " " + secondValue + " " + thirdValue);
        }

//        int[] array = new int[3];
//        array[0] = scanner.nextInt();
//        array[1] = scanner.nextInt();
//        array[2] = scanner.nextInt();
//        for (int i = 0; i < array.length; i++) {
//            if(array[0] > array[1] && array[0] >array[2]){
//                array[0] = array[0];
//            }
//        }

    }
}
