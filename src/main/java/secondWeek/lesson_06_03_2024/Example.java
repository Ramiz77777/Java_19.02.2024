package secondWeek.lesson_06_03_2024;

import java.util.Random;
import java.util.Scanner;

/**
 * Передать на вход программы число в качестве аргумента.
 * Если оно нечетное, распечатать его.
 * Используем оператор if.
 * Используйте метод Integer.parseInt() для преобразования из String в int.
 */
public class Example {
    public static void main(String[] args) {
        giveResult();
    }
    public static int giveRandom(){
        Random random = new Random();
        int resultOfValue = random.nextInt(100);
        return resultOfValue;
    }

    public static void giveResult(){
        int res = giveRandom();
        System.out.println(res);
        if(res % 2 == 0){
            System.out.println("Even number" );
        }
        else {
            System.out.println("not Even number");
        }
    }
}
