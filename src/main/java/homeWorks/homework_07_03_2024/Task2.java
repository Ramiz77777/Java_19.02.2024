package homeWorks.homework_07_03_2024;

/**
 * В три переменные a, b и c записаны три вещественных числа.
 * Создать программу, которая будет находить и выводить на экран вещественные
 * корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.
 */
public class Task2 {
    public static void main(String[] args) {
        double value = 4;
        double secondValue = -16;
        double thirdValue = 10;
        double endResult = secondValue * secondValue - 4*value * thirdValue;

//        int res = (int) (Math.pow(secondValue,2) - (4*value*thirdValue));
//        int res2 = (int) ((-secondValue + Math.sqrt(res)) / 2 * value);
//        double res3 = -secondValue/2*value;
        if(endResult>0){
            double x1;
            double x2;
            x1 =  (-secondValue - Math.sqrt(endResult)) / (2* value);
            x2 = (-secondValue + Math.sqrt(endResult)) / (2* value);
            System.out.println("koren uravneniya x1" + x1 + " x2 " + x2 );
        } else if (endResult == 0) {
            double x ;
            x = -secondValue / (2*value);
            System.out.println(" odin koren" + x);
        }else {
            System.out.println("net korna ");
        }
    }
}
