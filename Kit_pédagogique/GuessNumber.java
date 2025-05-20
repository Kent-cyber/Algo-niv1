package Kit_pédagogique;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int random = 1 + (int)(20 * Math.random());

        int k = 5;

        System.out.println("Un nombre est choisi entre 1 et 20");
        System.out.println("Vous avez " + k + " essai pour deviner");

        for (int i = 0; i < k; i++) {
            System.out.println("Entrez votre nombre :");
            int number = sc.nextInt();

            if (number == random) {
                System.out.println("Yes, you did it !");
                sc.close();
                return;

            } else if (number < random) {
                System.out.println("Plus grand !");

            } else {
                System.out.println("Plus petit !");

            }

        }

        System.out.println("Tous les essai sont utilisés. Le nombre était : " + random);
                  
        sc.close();
    }
}
