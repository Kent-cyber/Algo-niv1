/*
Avec Print & Scanner : Me faire un code qui permet de savoir si une personne est mineur 
(-18 ans) ou majeur (+18 ans)

 */

package Jalon_Blanc;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quel âge avez-vous ?");
        int age = sc.nextInt();

        if (age < 18) {

            System.out.println("Vous êtes mineur");

        } else {

            System.out.println("Vous êtes majeur");
        }

        sc.close();
    }
}
