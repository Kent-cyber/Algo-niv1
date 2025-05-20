package Jalon;

import java.util.Scanner;

public class Cas_Pratique_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est votre salaire BRUT (en euros) :");
        double brut = sc.nextDouble();

        double net = brut - ((brut * 23) / 100);
        System.out.println("Votre salaire NET sera de " + net + " euros");

        sc.close();
    }
}
