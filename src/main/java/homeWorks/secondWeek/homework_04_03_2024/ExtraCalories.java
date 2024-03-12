package homeWorks.secondWeek.homework_04_03_2024;

/**
 * Дополнительное задание.
 * Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
 * Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.
 */
public class ExtraCalories {
    public static void main(String[] args) {
        findCalorieDifference();
    }

    private static void findCalorieDifference() {
        double pizza24sm = Math.sqrt(24);
        System.out.println(pizza24sm + " kvadratnix santimetrov v pizze 24sm");
        double pizza28sm = Math.sqrt(28);
        System.out.println(pizza28sm + " kvadratnix santimetrov v pizze 28sm");
        System.out.println(pizza28sm - pizza24sm + " raznica v stolko kvadratnix santimetrov");
        System.out.println((pizza28sm- pizza24sm) * 40 + " raznica stolko kaloriy");
    }
}
