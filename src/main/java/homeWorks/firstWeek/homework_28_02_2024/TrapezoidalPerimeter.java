package homeWorks.firstWeek.homework_28_02_2024;

import java.util.Scanner;

/**
 * периметр трапеции;
 */
public class TrapezoidalPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstSideOfTrapezoid = scanner.nextDouble();
        double secondSideOfTrapezoid = scanner.nextDouble();
        double thirdSideOfTrapezoid = scanner.nextDouble();
        double fourthSideOfTrapezoid = scanner.nextDouble();

        System.out.println(FindTrapezoid(firstSideOfTrapezoid,secondSideOfTrapezoid,thirdSideOfTrapezoid,fourthSideOfTrapezoid));


    }
    public static double FindTrapezoid(double side1,double side2,double side3,double side4){
        return side1 + side2 + side3 + side4 ;
    }
}

