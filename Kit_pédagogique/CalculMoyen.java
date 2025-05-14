package Kit_pédagogique;

import java.util.Scanner;

public class CalculMoyen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un premier nombre :");
        double a = sc.nextDouble();

        System.out.println("Veuillez saisir un second nombre :");
        double b = sc.nextDouble();

        double sum = (a + b) / 2;

        System.out.println("La moyenne de " + Math.round(a) + " et " + Math.round(b) + " est : " + Math.round(sum * 100.0) / 100.0);
        
        sc.close();
    }

}
