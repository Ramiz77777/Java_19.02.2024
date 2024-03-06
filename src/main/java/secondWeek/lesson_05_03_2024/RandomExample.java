package secondWeek.lesson_05_03_2024;

import java.util.Random;

/**
 * Использование Math.random
 *
 * Объявить минимальное значение диапазона
 * Объявить максимальное значение диапазона
 * Используйте формулу Math.random()*(max-min+1)+min для создания значений, включающих значение min и max
 *
 * Этот метод можно использовать только в том случае, если вам нужно целое число или случайное значение с плавающей запятой
 */
public class RandomExample {
    public static void main(String[] args) {
        int minValue = 5;
        int maxValue = 10;
        int randomInt = getRandomNumber(maxValue,minValue);
        System.out.println(randomInt);

    }
    public static int getRandomNumber(int maxValue,int minValue){
        return (int)(Math.random()*(maxValue-minValue+1) +minValue);
    }
}
