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
public class IsoscelesTriangle {
    public static void main(String[] args) {
        /**
         -вычисление площади треугольника;
         */
        Scanner scanner = new Scanner(System.in);
        double firstSideOfTriangle = scanner.nextDouble();
        double secondSideOfTriangle = scanner.nextDouble();


        System.out.println(SearchTreangleSquare(firstSideOfTriangle,secondSideOfTriangle));
        System.out.println();

    }
    public static double SearchTreangleSquare(double side1 ,double side2){
        double hide = 0.5 * Math.sqrt(4 * Math.pow(side1,side2));
        double side = 0.5 * side2 * hide;
        return side;
    }


}
