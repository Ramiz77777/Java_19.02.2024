package thirdWeek.lesson_12_03_2024;

public class Romb {
    public static void main(String[] args) {
        int lenghtOfRomb = 6;
        int value = lenghtOfRomb;
        for (int i = 0; i < lenghtOfRomb; i++) {
            for (int j = 0; j < value; j++) {
                System.out.print(" ");
            }
            value--;
            for (int k = 0; k < (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
            value = 0;
        for (int i = 0; i < lenghtOfRomb; i++) {
            for (int j = 0; j < value; j++) {
                System.out.print(" ");
            }
            value++;
            for (int k = 0; k < 2*(lenghtOfRomb-i) -1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
