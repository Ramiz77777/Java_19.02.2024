package homeWorks.homework06_03_2024;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  1 уровень сложности: №1
 * Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
 * Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
 * Например:
 * ввод - mama, papa
 * вывод - mapa
 */
public class FirstTask {
    public static void main(String[] args) {
        FirstTask firstTask = new FirstTask();
        firstTask.intupData();
    }
    public void intupData(){
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        char[] array = firstWord.toCharArray();
        char[] secondarray = secondWord.toCharArray();



        if(array.length % 2 ==0 && secondarray.length % 2 == 0){
            if(array.length < 3|| secondarray.length < 3){
                System.out.println("try again");
            }
              System.out.print(array[0] + "" + array[1]);
            System.out.print(secondarray[2] + "" + secondarray[3]);
            }
        else {
            System.out.println("error");
        }
//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < secondarray[0]; j++) {
//                    System.out.println(array[array.length - (array.length)] + array[array.length- (array.length)]);
//                    System.out.println(secondarray[array.length-1] + secondarray[array.length-2]);
//                }
//            }
        }


    public void checkScaner(){

    }
}
