package firstWeek.lesson_27_02_2024;

/**
 В массиве найти максимальный элемент с четным индексом
 */
public class EvenMaxValue {
    public static void main(String[] args) {
        int[] array = {1,4,3,2,5};
        int maxValueInEvenIndex = array[0];
        for (int i = 0; i < array.length; i=i+2) {
            if(array[i] > maxValueInEvenIndex){
                maxValueInEvenIndex = array[i];
            }
        }
        System.out.println(maxValueInEvenIndex);
    }
}
