package Jalon;

import java.util.Scanner;

public class Cas_Pratique_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int vitesse, compteur, controle;
        boolean collision;

        System.out.println("Le véhicule roulait à quelle vitesse :");
        vitesse = sc.nextInt();

        System.out.println("Etiez-vous derrière le véhicule en collision (true/false) :");
        collision = sc.nextBoolean();

        System.out.println("Vous avez combien de kilomètre au compteur :");
        compteur = sc.nextInt();

        System.out.println("A combien d'années date votre dernier contrôle technique (0 s'il est moins d'un an) :");
        controle = sc.nextInt();

        if (vitesse < 130 && collision == true && (compteur > 150000 && controle <= 2 || compteur < 150000 && controle <= 5)) {
            System.out.println("Vous êtes bien éligibles pour le remplacement de votre voiture");

        } else {
                System.out.println("Vous n'êtes pas éligibles pour le remplacement de votre voiture");

        }

        sc.close();
    }
}
