package homeWorks.fourthWeek;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.random;

/**
 *  1 уровень сложности: 1. Проверка номера банковского счета
 * Создайте метод isValidAccountNumber(String accountNumber),который возвращает true в случае успешной проверки.
 * БС может содержать только 14 цифр
 * Все 14 цифр не могут быть нулями
 * Номер счета не может быть null или пустым.
 * Проверьте с помощью метода main()
 * Напишите тесты используя библиотеку JUnit
 */
public class BankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(Arrays.toString(bankAccount.getAccountNumber()));
    }

    public int[] getAccountNumber(){
        int[] arrayAccount = new int[14];
        for (int i = 0; i < arrayAccount.length; i++) {
            arrayAccount[i] = 2 + (int) (Math.random() *(99 - 1)+1);
        }
        return arrayAccount;
    }


    }

