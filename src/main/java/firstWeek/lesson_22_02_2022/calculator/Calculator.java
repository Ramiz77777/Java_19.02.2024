package firstWeek.lesson_22_02_2022.calculator;

public class Calculator {
    public void firstMessageBeforStarting(){
        System.out.println("enter first value");
    }

    public void secondMessageBeforStarting(){
        System.out.println("enter second value");
    }
    public int plusOperation(){
        System.out.println("make_plus_operation");
        InputData inputData = new InputData();
        firstMessageBeforStarting();
        int firstValue = inputData.input();
        secondMessageBeforStarting();
        int secondValue = inputData.input();
        return firstValue + secondValue;
    }
    public int minusOperation(){
        InputData inputData = new InputData();
        System.out.println("make_minus_Operation");
        firstMessageBeforStarting();
        int firstValue = inputData.input();
        secondMessageBeforStarting();
        int secondValue = inputData.input();
        return firstValue - secondValue;
    }
    public int divisionOperation(){
        System.out.println("make_division");
        InputData inputData = new InputData();
        firstMessageBeforStarting();
        int firstValue = inputData.input();
        secondMessageBeforStarting();
        int secondValue = inputData.input();
        if(secondValue == 0){
            throw new NullPointerException("Deleniye na 0");
        }
        return firstValue / secondValue;
    }
    public int multiplicationOperation(){
        System.out.println("make_multiplication_Operation");
        InputData inputData = new InputData();
        firstMessageBeforStarting();
        int firstValue = inputData.input();
        secondMessageBeforStarting();
        int secondValue = inputData.input();

        return firstValue*secondValue;
    }
}
