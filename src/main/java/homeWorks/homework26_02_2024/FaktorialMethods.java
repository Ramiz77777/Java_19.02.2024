package homeWorks.homework26_02_2024;

public class FaktorialMethods {
    InputData inputData = new InputData();

    public int methodWithLoopFor(){

        System.out.println("Enter Number");
        int number = inputData.InputMethod();
        int factorialResult = 1 ;

        for (int i = 1; i <= number; i++) {
            factorialResult = factorialResult * i ;
        }
        return factorialResult;
    }
    public int methodWithLoopWhile(){
        System.out.println("Enter Number");
        int inputNumber = inputData.InputMethod();


        int factorialResult = 1;
        int number = 1;
        while (number<=inputNumber){
            factorialResult = factorialResult * number;
            number++;

        }
        return factorialResult;
    }

    public int methodWithDoWhile(){
        int inputNumber = inputData.InputMethod();
        int factorial = 1 ;
        int number = 1;
        do {
            factorial = number*factorial;
            number++;
        }while (number<=inputNumber);
        return factorial;
    }
}
