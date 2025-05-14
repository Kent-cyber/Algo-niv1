/*
Avec Print & Scanner : Me faire un code qui transfert de l’argent d’un compte A à un 
compte B , 

Exemple :
Compte A a 3000 euros
Compte B a 500 euros
Compte A donne 500 à compte B
Alors Compte A a maintenant 2500 euros sur son compte
Compte B a maintenant 1000 euros sur son compte

Note importante : Veuillez donner vous-même le total des comptes A et B, sur Scanner

 */

package Jalon_Blanc;

import java.util.Scanner;

public class Argent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Donnez-moi un montant pour que le compte A puisse donner à compte B :");
        int amount = sc.nextInt();

        int compteA = 3000 - amount;
        int compteB = 500 + amount;

        if (compteA < 0) {

            System.out.println("Opération refusé");

        } else {

            System.out.println("Compte A donne " + amount + " à Compte B");
            System.out.println("Alors Compte A a maintenant " + compteA + " euros sur son compte");
            System.out.println("Compte B a maintenant " + compteB + " euros sur son compte");
        }

        sc.close();
    }
}
