package fourtheeWeek.lesson_19_03_2024.lotteryProject.lottery;

import fourtheeWeek.lesson_19_03_2024.lotteryProject.util.Utils;

import java.util.Arrays;

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
    public void runLottery() {
        int[] userNumbers = Utils.getUserNumbers();
        int[] luckyNumbers = Utils.getLuckyNumbers();
        Utils.printArray(userNumbers);
        Utils.printArray(luckyNumbers);
        System.out.println("winner numbers are");
        Utils.printWinnerNumbers(Utils.getWinNumbers(userNumbers,luckyNumbers));

    }

}
