package fourtheeWeek.lesson_21_03_2024.methods;

public class MethodsForCalculator {

    public static Double getDivision(double value1, double value2) {
        if(value2 == 0){
            return null;
        }
        return value1 / value2;
    }

    public static Double getMultiplication(double value1, double value2) {
        return value1 * value2;
    }

    public static Double getMinus(double value1, double value2) {
        return value1 - value2;
    }

    public static Double getPlus(double value1, double value2) {
        return value1 + value2;
    }
}
