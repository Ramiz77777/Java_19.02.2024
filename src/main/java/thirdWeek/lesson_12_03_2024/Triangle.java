package thirdWeek.lesson_12_03_2024;

public class Triangle {
    public static void main(String[] args) {
        int h = 5;
        int a = 0;
        int b = h;
        int c = h;
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j <= h*2; j++) {
                if(j > 9){
                    break;
                }
                if(i == a && j == b || i == a && j == c || i == h && j <= h +2){
                    System.out.print(" * ");

                }
                else {
                    System.out.print("  ");
                }
            }
            a++;
            b--;
            c++;
            System.out.println();
        }
    }
}
