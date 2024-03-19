package fourtheeWeek.lesson_19_03_2024;

import java.util.Scanner;

/**
 * Реализовать простую лотерею, используя конструкцию if-else-if:
 * Создать класс для лотереи
 * В методе main() реализовать лотерею
 * Добавить переменные для выигрышных номеров (5 номеров)
 * Добавить переменные для номеров пользователя
 * Получить от пользователя 5 номеров, используем Сканер
 * Ограничить игровые номера от 1 до 50
 * Рандомально присвоить в переменные выигрышные номера
 * Распечатать на консоль номера лотереи и номера введенные пользователем
 */
public class ScannerClass {
    int count;
    private int userNum1;
    private int userNum2;
    private int userNum3;
    private int userNum4;
    private int userNum5;
    public  void inputData(){

        System.out.println("enter first number (1-50)");
        userNum1 = new Scanner(System.in).nextInt();
        System.out.println("enter second number (1-50)");
        userNum2 = new Scanner(System.in).nextInt();
        System.out.println("enter third number (1-50)");
        userNum3 = new Scanner(System.in).nextInt();
        System.out.println("enter fourth number (1-50)");
        userNum4 = new Scanner(System.in).nextInt();
        System.out.println("enter fiveft number (1-50)");
        userNum5 = new Scanner(System.in).nextInt();

             if(userNum1 > 0 && userNum1 <= 50 &&
                userNum2 > 0 && userNum2 <= 50 &&
                userNum3 > 0 && userNum3 <= 50 &&
                userNum4 > 0 && userNum4 <= 50 &&
                userNum5 > 0 && userNum5 <= 50){
                 System.out.println("your number is " + userNum1);
                 System.out.println("your number is " + userNum2);
                 System.out.println("your number is " + userNum3);
                 System.out.println("your number is " + userNum4);
                 System.out.println("your number is " + userNum5);
        }
             else {
                 System.out.println("!!!!!!!enter around (1-50)!!!!!!!!!");
             }
    }

    public int getUserNum1() {
        return userNum1;
    }

    public int getUserNum2() {
        return userNum2;
    }

    public int getUserNum3() {
        return userNum3;
    }

    public int getUserNum4() {
        return userNum4;
    }

    public int getUserNum5() {
        return userNum5;
    }
}
