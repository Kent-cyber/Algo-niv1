package Jalon;

import java.util.Scanner;

public class Cas_Pratique_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int bottle = 1;

        System.out.println("Combien de litre d'eau voulez-vous boire :");
        double drink = sc.nextDouble();
        double quantity = bottle - drink;

        if (drink > bottle) {
            System.out.println("La bouteille est vide");

        } else {
            System.out.println("Il reste encore " + quantity * 100.0 + " cl d'eau dans la bouteille");
        }

        sc.close();
    }
}
