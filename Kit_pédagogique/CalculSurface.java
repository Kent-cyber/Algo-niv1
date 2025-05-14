package Kit_pédagogique;

import java.util.Scanner;

public class CalculSurface {

    public static double Surface(int radius, int angle) {

        return (Math.PI * Math.pow(radius, 2) * angle) / 360;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un rayon :");
        int r = sc.nextInt();

        System.out.println("Veuillez saisir un angle (en degrés) :");
        int a = sc.nextInt();

        if (a > 360) {
            System.out.println("Angle impossible");

        } else {
            System.out.println("L'aire du secteur circulaire : " + Surface(r, a));

        }

        sc.close();
    }
    
}
