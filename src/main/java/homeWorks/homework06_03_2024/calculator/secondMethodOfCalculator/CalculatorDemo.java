package homeWorks.homework06_03_2024.calculator.secondMethodOfCalculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = ((value1,value2) -> value1 + value2);
        Calculator calculator1 = ((value1, value2) -> value1-value2);
        Calculator calculator2 = ((value1, value2) -> value1/value2);
        Calculator calculator3 = ((value1, value2) -> value1*value2);

        System.out.println(calculator.makeResult(100,23));
        System.out.println(calculator1.makeResult(10,2));
        System.out.println(calculator2.makeResult(10,2));
        System.out.println(calculator3.makeResult(10,1));
    }
}
