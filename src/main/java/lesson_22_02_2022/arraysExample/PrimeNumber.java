package lesson_22_02_2022.arraysExample;

/**
 * Задача
 * Напишите программу которая выводит на конслоь простые числа в промежутке от 2 до 100 включительно.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.returnPrimeNumber();
    }

    public void returnPrimeNumber() {

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }

            }
            if(isPrime) {
                System.out.println(i);
            }
        }
    }
}


