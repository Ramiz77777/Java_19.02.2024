package fourtheeWeek.lesson_21_03_2024.utils;

import fourtheeWeek.lesson_21_03_2024.constants.Constants;
import fourtheeWeek.lesson_21_03_2024.methods.MethodsForCalculator;

import java.util.Scanner;

public class Util {
    private static boolean isDiv = false;
    private static Scanner scanner = new Scanner(System.in);

    public static double getNumber() {
        System.out.println("vvedite cislo ");
        double value = scanner.nextDouble();
        return value;
    }

    public static char getOperation() {
        System.out.println("vvedite matematiceskiye operaciyi '+': '-': '/': '*': ");
        char value = scanner.next().charAt(0);
        return value;
    }

    public static Double getResult(double value1, double value2, char operation) {

        switch (operation) {
            case Constants.PLUS:
                return MethodsForCalculator.getPlus(value1, value2);
            case Constants.MINUS:
                return MethodsForCalculator.getMinus(value1, value2);
            case Constants.DIVISION:
                Double result = MethodsForCalculator.getDivision(value1, value2);
                isDiv = true;
                return result;
            case Constants.MULTIPLICATION:
                return MethodsForCalculator.getMultiplication(value1, value2);
            default:
                return null;
        }
    }

//    public static String getResultTwo(double value1, double value2, char operation) {
//        switch (operation) {
//            case Constants.PLUS:
//                return String.valueOf(MethodsForCalculator.getPlus(value1, value2));
//            case Constants.MINUS:
//                return String.valueOf(MethodsForCalculator.getMinus(value1, value2));
//            case Constants.DIVISION:
//                return String.valueOf(MethodsForCalculator.getDivision(value1, value2));
//            case Constants.MULTIPLICATION:
//                return String.valueOf(MethodsForCalculator.getMultiplication(value1, value2));
//            default:
//                return "ne verniy vvod ";
//        }
//    }
    public static void printResult(double value1,double value2,char operation){
        Double result = getResult(value1,value2,operation);
        if(result != null){
            System.out.printf("%.2f %s %.2f = %.2f",value1,operation,value2,result);
        }
        else {
            if(isDiv){
                System.out.println("na 0 delit nelza ");
            }
            else {
                System.out.println("ne verniy znak operaciyi ");
            }
        }
    }





}
