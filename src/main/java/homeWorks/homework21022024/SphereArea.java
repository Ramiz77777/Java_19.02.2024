package homeWorks.homework21022024;

import java.util.Scanner;

/**
 * площадь сферы.
 */
public class SphereArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstRadiusOfArea = scanner.nextDouble();
        double secondRadiusOfArea = scanner.nextDouble();

        System.out.println(CalculateSpheres(firstRadiusOfArea,secondRadiusOfArea));
    }

    public static double CalculateSpheres(double radius1,double radius2){
        double spherearea = Math.PI * (radius1*radius2);
        return spherearea;
    }
}
