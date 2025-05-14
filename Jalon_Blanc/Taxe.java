/*
Avec Print & Scanner : Me faire un code qui convertit un prix HT (Hors Taxe) en prix TTC 
(Toute taxe comprise) à l’aide de la TVA (en pourcentage) que vous pourrez changer à 
votre guise.

 */

package Jalon_Blanc;

import java.util.Scanner;

public class Taxe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double ht, ttc, tva;

        System.out.println("Donnez-moi un prix :");
        ht = sc.nextDouble();

        System.out.println("Donnez-moi un pourcentage de TVA :");
        tva = sc.nextDouble();

        ttc = ht * ((tva / 100) + 1);

        System.out.println("Le montant final est de " + Math.round(ttc * 100.0) / 100.0);

        sc.close();
    }
    
}
