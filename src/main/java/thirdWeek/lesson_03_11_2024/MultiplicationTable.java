package thirdWeek.lesson_03_11_2024;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print( i + "*" + j +"=" +   (i*j) + "\t");
            }
            System.out.println();
        }
    }
}
