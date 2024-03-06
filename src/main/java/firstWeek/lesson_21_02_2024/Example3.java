package firstWeek.lesson_21_02_2024;

import java.util.Scanner;

public class Example3 {
    /*
    Даны три переменные, вещественные числа number1, number2,
     и символьный operation, который может содержать следующие символы (+ - * /).
      Написать программу "Калькулятор" которая будет выводить на консоль результат соответствующих вычислений.
     */
    public static void main(String[] args) {
//        Operation operation = ((a,b)-> a+b);
//        Operation operation2 = ((a,b)-> a-b);
//        Operation operation3 = ((a,b)-> a/b);
//        Operation operation4 = ((a,b)-> a*b);
//        System.out.println(operation.doOperation(2,2));
//        System.out.println(operation2.doOperation(2,2));
//        System.out.println(operation3.doOperation(2,2));
//        System.out.println(operation4.doOperation(2,2));
        int number1 = 10;
        int number2 = 3;
        char operation = '/';
        switch (operation) {
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Error");
                } else {
                    System.out.println(number1 / number2);
                }
                break;

            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            default:
                System.out.println("Error");
        }
    }


}
interface Operation{
    public int doOperation(int a ,int b);
}
