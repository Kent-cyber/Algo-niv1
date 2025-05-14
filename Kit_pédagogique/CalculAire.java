package Kit_pédagogique;

import java.util.Scanner;

public class CalculAire {

    public static double Area(int radius) {

        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public static double Volume(int radius) {

        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un rayon :");
        int r = sc.nextInt();

        System.out.println("L'aire de la sphère est : " + Area(r));
        System.out.println("Le volume de la sphère est : " + Volume(r));

        sc.close();
    }
    
}
