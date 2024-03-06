package firstWeek.lesson_21_02_2024;

import java.util.Scanner;

/*
Создать программу которая принимает на вход 3 вещественных числа,
и будет выводить на экран ТО число,
чей остаток от деления на 1.5 -  меньше остальных. Для наглядности выводить и сам остаток.
 */
public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        double value2 = scanner.nextDouble();
        double value3 = scanner.nextDouble();
        double remindervalue = value % 1.5;
        double reminderTwo= value2 % 1.5;
        double remindervalueThree = value3 % 1.5;
        System.out.println("Enter value");
        System.out.println(Math.min(remindervalue,Math.min(reminderTwo,remindervalueThree)));

        String s = null;
        if(s!= null && s.length() > 0){
            System.out.println(s);
        }
    }
}
