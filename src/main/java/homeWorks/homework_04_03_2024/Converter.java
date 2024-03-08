package homeWorks.homework_04_03_2024;

import java.util.Scanner;

/**
 * Задание 2
 * Создайте класс Converter - конвертер системы счисления.
 * У пользователя спрашивается число системы счисления, (используйте Scanner)
 * Запрашивается само число (ожидается корректный ввод)
 * У пользователя спрашивается число системы счисления в какую перевести
 * Конвертация должна быть с помощью класса обертки Long.
 */
public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("system of calculus\n '1' binary  '2' octal");
        int selection = scanner.nextInt();
        selectConverter(scanner,selection);
    }

    private static void selectConverter(Scanner scanner, int selection) {

            if (selection == 1) {
                System.out.println("binary system converter");
                long firstValue = scanner.nextLong();
                String binaryValue = Long.toBinaryString(firstValue);
                System.out.println("number " + firstValue + " in bynary system is " + binaryValue);
            } else if (selection == 2) {
                System.out.println("Octal system converter ");
                long secondValue = scanner.nextLong();
                String octoalValue = Long.toOctalString(secondValue);
                System.out.println("number " + selection + " in octal system is " + octoalValue);
            } else {
                System.out.println("wrong input");
            }

    }
}



