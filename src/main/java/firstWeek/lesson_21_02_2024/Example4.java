package firstWeek.lesson_21_02_2024;

/*
В диапазоне от 0 до 100  вывести на экран первые 25 чётных чисел, исключая “десятки”.
 */
public class Example4 {
    public static void main(String[] args) {
        int count =0;
        for (int i = 0; i <= 100; i+=2) {
            if(count == 26){
                break;
            }
            if(i % 10 !=0  ){
                count++;
                    System.out.print(i + " ");


            }

        }
    }
}
