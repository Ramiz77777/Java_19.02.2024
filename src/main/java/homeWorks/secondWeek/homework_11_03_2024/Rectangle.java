package homeWorks.secondWeek.homework_11_03_2024;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Показать на экране прямоугольник размером MxN, состоящий из
 * звёздочек. Затем сделать то же самое, но чтоб фигура внутри была пустая (остаётся только рамка).
 */
public class Rectangle {
    public static void main(String[] args) {
        int line = 3;
        int colum = 14;
        int[][] array = new int[line][colum];
        for (int i = 0; i <line ; i++) {
            for (int j = 0; j <colum ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("===========");

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < colum; j++) {
                if (i == 0 || i == line - 1 || j == 0 || j == colum - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
