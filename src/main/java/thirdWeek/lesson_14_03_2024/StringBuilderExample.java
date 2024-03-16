package thirdWeek.lesson_14_03_2024;

/**
 * Создайте StringBuilder объекты используя все предоставленные конструкторы
 * Используя метод append добавьте к объекту, который создан при помощи конструктора без параметров, строку “StartaUniversity”
 * Распечатайте все объекты на консоле
 * Примените метод reverse() к любому созданному объекту
 * Распечатайте объект на консоле
 */
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("ramiz");
        StringBuilder stringBuilder1 = new StringBuilder(3);

        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder1.capacity());
        stringBuilder.append(" StartaUniversity");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }

    public class Student{
        String name;

    }
}
