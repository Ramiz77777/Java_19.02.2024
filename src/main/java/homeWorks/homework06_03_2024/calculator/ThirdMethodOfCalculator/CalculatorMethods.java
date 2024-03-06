package homeWorks.homework06_03_2024.calculator.ThirdMethodOfCalculator;

import java.util.Scanner;

public class CalculatorMethods {
    public static void main(String[] args) {
        makeChoice();
    }



    public static void makeChoice() {
        System.out.println("make choice '+' '-' '*' '/' ");
        char operator = new Scanner(System.in).next().charAt(0);
        System.out.println("Enter first value");
        int value1 = new Scanner(System.in).nextInt();
        System.out.println("enter second value");
        int value2 = new Scanner(System.in).nextInt();


        switch (operator) {
            case '+':
                System.out.println(value1 + value2);
                break;
            case '-':
                System.out.println(value1-value2);
                break;
            case '/':
                System.out.println(value1/value2);
                break;
            case '*' :
                System.out.println(value1*value2);
                break;
            default:
                System.out.println("error");
        }
    }
}
