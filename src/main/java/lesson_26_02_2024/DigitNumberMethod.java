package lesson_26_02_2024;

/**
 * Дано трёхзначное число, вывести все цифры этого числа в виде строки.
 * Пример: 345 – вывод: Число 345 -> 3, 4, 5.
 */
public class DigitNumberMethod {
    public String number(int num1,int num2,int num3){

            String number = String.valueOf(num1);
            String number2 = String.valueOf(num2);
            String number3 = String.valueOf(num3);
        return number+number2+number3;

    }
}
