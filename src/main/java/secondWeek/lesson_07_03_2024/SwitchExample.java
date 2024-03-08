package secondWeek.lesson_07_03_2024;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {
        int num = 897;
        int first = num/100;
        int middle = num/10%10;
        int last = num%10;
        System.out.println(first +" " + middle+" " + last);//8 9 7

        if(first > middle && first> last){
            System.out.println(first);
        } else if (middle> first && middle> last) {
            System.out.println(middle);
        }else {
            System.out.println(last);
        }
    }

}
