package firstWeek.lesson_28_08_2024;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * cдвинуть элементы массива в указанном направлении(влево или вправо) и на указанное число шагов. Освободившееся место
 * заполнить нулями выводить массив после каждого шага
 */
public class ArrayShift {
    public static void main(String[] args) {
        int[] array = {2,34,45,657,645,31};
        int[] newArray = Arrays.copyOf(array,10);
//        Arrays.fill(newArray,0,4,0);
        System.out.println(Arrays.toString(newArray));




//        for (int i = newArray.length-1; i >= 0; i--) {
//            System.out.print(newArray[i] + " ");
//        }


    }
}
