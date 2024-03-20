package fourtheeWeek.lesson_19_03_2024.lotteryProject.util;

import fourtheeWeek.lesson_19_03_2024.lotteryProject.constant.Constants;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utils {

    public static boolean isUniqueNumber(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return false;
            }
        }
        return true;
    }

    public static int[] getUserNumbers() {
        int[] userNumbers = new int[Constants.SET_SIZE_OF_ARRAY];

        int userNumberIndex = 1;
        int userCurrentNumber = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 номеров от 1 до 50:");
        while (userNumberIndex <= Constants.SET_SIZE_OF_ARRAY) {

            System.out.println("Введите номер " + userNumberIndex + ": ");
            userCurrentNumber = scanner.nextInt();
            if (userCurrentNumber > 0 && userCurrentNumber <= 50 && Utils.isUniqueNumber(userNumbers, userCurrentNumber)) {
                userNumbers[userNumberIndex - 1] = userCurrentNumber;
                ++userNumberIndex;

            } else {

                System.out.println("Номер должен быть от 1 до 50 или такой номер уже есть. Попробуйте еще раз! ");
            }
        }
        return userNumbers;

    }

    public static int[] getLuckyNumbers() {
        int[] luckyNumbers = new int[Constants.SET_SIZE_OF_ARRAY];
        Random random = new Random();
        int luckyNumberIndex = 1;
        int luckyCurrentNumber = 0;

        while (luckyNumberIndex <= Constants.SET_SIZE_OF_ARRAY) {
            luckyCurrentNumber = random.nextInt(50) + 1;
            if (isUniqueNumber(luckyNumbers, luckyCurrentNumber)) {
                luckyNumbers[luckyNumberIndex - 1] = luckyCurrentNumber;
                ++luckyNumberIndex;
            }
        }
        return luckyNumbers;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static int[] getWinNumbers(int[] humanArray, int[] randomArray) {
        int index = 0;
        int[] winnerNumbers = new int[Constants.SET_SIZE_OF_ARRAY];
        for (int i = 0; i < humanArray.length; i++) {
            for (int j = 0; j < randomArray.length; j++) {
                if (humanArray[i] == randomArray[j]) {
                    winnerNumbers[index] = humanArray[i];
                    index++;
                    break;
                }
            }
        }
        return winnerNumbers;
    }

    public static void printWinnerNumbers(int[] array) {
        boolean isWinners = false;
        for (int item : array) {
            if (item != 0) {
                System.out.print(item + " ");
                isWinners = true;
            }
        }
        if (!isWinners) {
            System.out.println("no winner number");
        }
    }


}

