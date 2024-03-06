package secondWeek.lesson_05_03_2024;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomExampleThree {
    public static void main(String[] args) {
        getBackResult();

    }


    public static int randomNumber(){
        Random random = new Random();
        int resultOfRAndom = random.nextInt(3) + 1;
        System.out.println(" computer choice is " + resultOfRAndom);
        return resultOfRAndom;
    }
    public static int inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("make your choice");
        System.out.println("1 = stone: 2 = paper : 3 = scissors");
        int result = scanner.nextInt();
        System.out.println("user choice is ");
        if(result == 1){
            System.out.println("stone");

        }
        else if(result == 2){
            System.out.println("paper");
        }
        else if( result == 3){
            System.out.println("scissors");
        }
        else {
            System.out.println("wrong input");
        }
        return result;
    }

    public static void getBackResult(){
        int userValue = inputData();
        int randomValue = randomNumber();
        if(userValue == randomValue){
            System.out.println("nichya");
        }
        else if((userValue == 1 && randomValue == 2) || (userValue ==2 && randomValue == 3) || (userValue == 3 && randomValue == 1 )){
            System.out.println("random Win");
        }
        else if ((userValue == 2 && randomValue == 1) || (userValue == 3 && randomValue == 2) ||  (userValue == 1 && randomValue ==3)) {
            System.out.println("user Win");
        }

    }

}

