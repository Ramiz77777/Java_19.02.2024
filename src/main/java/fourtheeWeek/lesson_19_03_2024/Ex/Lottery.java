package fourtheeWeek.lesson_19_03_2024.Ex;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Изменить написанный код
 * Распределите ответственность написанного кода в соответствующие классы и методы
 * Сохраните номера лотереи в массиве 
 * Введите контроль за количеством номеров в лотереи и от пользователя
 * Создайте класс Константы, определите COUNT_SET_SIZE = 5 
 * Добавьте проверку пользовательских номеров с номерами лотереи
 * Реализуйте метод в классе Utils
 * Метод должен принимать два массива (lotteryNumber, userNumber)
 * Возвращать количество совпадений
 * Получите от пользователя 5 номеров, сохраните их в массив
 * Протестируйте работу лотереи в классе StartLottery
 * Выведите результаты на консоль
 */

public class Lottery {
    public static void main(String[] args) {


        int setSize = 5;
        int userCount = 1;
        int user = 0;

        int[] userNumbers = new int[setSize];
        Random random = new Random();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 номеров от 1 до 50:");
        //userNum1 = scanner.nextInt();
        while (userCount <= setSize) {
            System.out.println("Введите номер " + userCount + ": ");
            user = scanner.nextInt();
            if (user > 0 && user <= 50 && !checkNumbers(userNumbers, user)) {
                userNumbers[userCount - 1] = user;
                ++userCount;
                //++userCount = userCount + 1 = userCount;
                //userCount++ = userCount = userCount + 1;
            } else {

                System.out.println("Номер должен быть от 1 до 50 или такой номер уже есть. Попробуйте еще раз! ");
//                userNum1 = new Scanner(System.in).nextInt();
            }
        }

        System.out.println(Arrays.toString(userNumbers));
    }
    public static boolean checkNumbers (int[]arr, int num ){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                return true;
            }
        }
        return false;
    }

}
