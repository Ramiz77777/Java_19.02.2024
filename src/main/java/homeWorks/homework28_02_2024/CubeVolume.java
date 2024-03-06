package homeWorks.homework28_02_2024;

import java.util.Scanner;

public class CubeVolume {
    public static void main(String[] args) {
        /**
         * -объём куба;
         */
        Scanner scanner = new Scanner(System.in);
        double firstRibOfCube = scanner.nextDouble();
        double secondRibOfCube = scanner.nextDouble();
        double thirdRibOfCube = scanner.nextDouble();

        System.out.println(CalculateCubeVolume(firstRibOfCube,secondRibOfCube,thirdRibOfCube));




    }
    public static double CalculateCubeVolume(double rib1,double rib2,double rib3){
        double volume = rib1 * rib2 * rib3;
        return  volume;
    }
}
