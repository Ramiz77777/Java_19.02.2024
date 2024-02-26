package lesson_26_02_2024;

/**
 * Дано трёхзначное число, вывести все цифры этого числа в виде строки.
 * Пример: 345 – вывод: Число 345 -> 3, 4, 5.
 */
public class DigitNumberMethod {
    public String getNumber(int num){


            int num1 = num/100;
            int num2 = (num-num1*100) /10;
            int num3 = num%10;
            String res = "cislo " + num + " -> " + num1 +" " + num2 + " " + num3;
    return res;

    }
}
