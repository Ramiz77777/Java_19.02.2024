package lesson_26_02_2024;

import java.util.Scanner;

/**
 * Дано трёхзначное число, вывести все цифры этого числа в виде строки.
 * Пример: 345 – вывод: Число 345 -> 3, 4, 5.
 */
public class DigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        DigitNumberMethod digitNumberMethod = new DigitNumberMethod();
        System.out.println(digitNumberMethod.getNumber(num));
    }
}
