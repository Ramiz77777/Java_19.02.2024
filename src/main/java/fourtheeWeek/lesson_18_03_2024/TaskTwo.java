package fourtheeWeek.lesson_18_03_2024;

/**
 * Написать метод findMax(), который возвращает максимальное число из массива
 * Протестировать с помощью метода main()
 * Написать тесты используя библиотеку JUnit
 * тест, который проверяет пустой массив или нет
 * тест, который проверяет правильность поиска максимального значения
 */
public class TaskTwo {
    public static void main(String[] args) {
        TaskTwo taskTwo = new TaskTwo();
        int[] array = new int[]{2,4,6,435,54,23};
        System.out.println(taskTwo.findMax(array));
        System.out.println(taskTwo.getElementByIndex(array,2));
    }


    public int findMax(int[] array){
        int tmp = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > tmp){
                tmp = array[i];
            }
        }
        return tmp;
    }
    public int getElementByIndex (int[] arr, int index){
        return arr[index];
    }
}
