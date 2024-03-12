package homeWorks.secondWeek.homework_06_03_2024.calculator.firstMethodOfCalculator;

/**
 * Реализовать программу, выводящую на экран результаты:
 * Сложения двух чисел
 * Вычитания двух чисел
 * Умножения двух чисел
 * Деления двух чисел
 * Каждая из арифметических операций должна быть реализована как отдельный метод.
 */
public class CalculatorMethods {

    public int plusOperation() {
        InputData inputData = new InputData();
        System.out.println("Make Plus operation");
        System.out.println("----------------");
        System.out.println("enter first value");
        int firstValue = inputData.inputInfo();
        System.out.println("enter second");
        int secondValue = inputData.inputInfo();
        return firstValue + secondValue;
    }
    public int minusOperation() {
        InputData inputData = new InputData();
        System.out.println("Make minus operation");
        System.out.println("----------------");
        System.out.println("enter first value");
        int firstValue = inputData.inputInfo();
        System.out.println("enter second");
        int secondValue = inputData.inputInfo();
        return firstValue - secondValue;
    }
    public int multiplicationOperation() {
        InputData inputData = new InputData();
        System.out.println("Make multiplication operation");
        System.out.println("----------------");
        System.out.println("enter first value");
        int firstValue = inputData.inputInfo();
        System.out.println("enter second");
        int secondValue = inputData.inputInfo();
        return firstValue * secondValue;
    }
    public int divisionOperation() {
        InputData inputData = new InputData();
        System.out.println("Make division operation");
        System.out.println("----------------");
        System.out.println("enter first value");
        int firstValue = inputData.inputInfo();
        System.out.println("enter second");
        int secondValue = inputData.inputInfo();
        return firstValue / secondValue;
    }
}
