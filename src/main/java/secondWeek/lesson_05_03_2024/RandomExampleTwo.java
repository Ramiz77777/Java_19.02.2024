package secondWeek.lesson_05_03_2024;

import java.util.Random;

/**
 * Напишите класс Converter для конвертации из градусов по Цельсию в Кельвины​, ​Фаренгейты:
 * У класса должны быть методы для конвертации.
 * Реализуйте два метода в классе:
 * runKelvinConverter(double baseValue)
 * runFahrenheitConverter(double baseValue)
 */
public class RandomExampleTwo {
    public static void main(String[] args) {
        Random random = new Random();

        int celsium = random.nextInt(20);
        System.out.println(celsium);
        System.out.println(makeCelsimToForengeht(celsium));
        System.out.println(makeCelsimToKelvin(celsium));

    }
    public static double makeCelsimToForengeht(int celsuim){
        return (celsuim+273.15);
    }
    public static double makeCelsimToKelvin(int value){
        return value*1.8+32;
    }
}
