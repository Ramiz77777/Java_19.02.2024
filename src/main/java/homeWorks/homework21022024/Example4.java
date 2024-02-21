package homeWorks.homework21022024;

import java.util.Scanner;

/*
Написать математические формулы, в отдельных классах используя Мейн метод:
-площадь треугольника;
-объём куба;
-периметр трапеции;
-площадь сферы.

Домашка на "погуглить" (наверняка java знает как возводить в степень или извлекать корень)
 */
public class Example4 {
    public static void main(String[] args) {
        /**
         -вычисление площади треугольника;
         */
        Scanner scanner = new Scanner(System.in);
        double value1 = scanner.nextDouble();
        double value2 = scanner.nextDouble();
        Example4 example5 = new Example4();
        System.out.println(example5.treanglesquare(value1,value2));
        System.out.println();

    }
    public double treanglesquare(double side1 ,double side2){

        double hide = 0.5 * Math.sqrt(4 * Math.pow(side1,side2));
        double side = 0.5 * side2 * hide;
        return side;
    }


}
