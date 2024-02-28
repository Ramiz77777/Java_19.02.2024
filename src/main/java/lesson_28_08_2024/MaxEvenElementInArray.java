package lesson_28_08_2024;

/**
 * V masssive nsyti maximalniy element s cetnim indexom
 */
public class MaxEvenElementInArray {
    public static void main(String[] args) {
        int[] array = {1,2,8,4,5,6,1};
    MaxEvenElementInArray maxEvenElementInArray = new MaxEvenElementInArray();
        System.out.println(maxEvenElementInArray.findEvenElement(array));


    }

    public int findEvenElement(int[] array){
        int maxEvenElement = array[0];
        for (int i = 0; i < array.length; i+=2) {
            if(array[i] > maxEvenElement){
                maxEvenElement = array[i];
            }
        }
        return maxEvenElement;
    }
}
