package lesson_28_08_2024;

/**
 * v massive soderjashim polojitelniye i otrecatelniye celiye cilsla
 * nayti summu cetnix polojitelnix elementov
 */
public class SumOfPositivNumberInArray {
    public static void main(String[] args) {
        int[] array = {1,2,-3,4,5,6};
        SumOfPositivNumberInArray sumOfPositivNumberInArray = new SumOfPositivNumberInArray();
        System.out.println(sumOfPositivNumberInArray.findPositiveSumm(array));
    }
    public int findPositiveSumm(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0 && array[i] > 0){
                sum = sum + array[i];
            }
        }
        return sum;
    }
}
