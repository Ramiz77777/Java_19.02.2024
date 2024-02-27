package lesson_27_02_2024;

/**
 * 1.	Создайте массив L = 10
 * 2.	Инициализируйте массив числами от 1 до 10 используя способ литерала
 * 3.	Выведите на консоль элемент из второй ячейки
 * 4.	Выведите на консоль элемент из предпоследней ячейки
 * 5.	Распечатайте на консоль все элементы из ячеек массива используя цикл fori
 * a.	Используйте метод .print()
 * 6.	Замените все элементы в данном массиве на значение “-1”
 * 7.	Распечатайте на консоль все элементы из ячеек массива используя цикл foreach
 * a.	Используйте метод  .print()
 * 8.	Проанализируйте код
 */
public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(array[2]);
        System.out.println(array[array.length-2]);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        for (int myArray : array) {
            System.out.print(array + " ");
        }


    }
}
