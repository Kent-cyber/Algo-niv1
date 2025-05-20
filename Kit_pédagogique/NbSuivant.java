package Kit_pédagogique;

import java.util.Scanner;

public class NbSuivant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez un nombre :");
        int number = sc.nextInt();

        System.out.print("Les 10 nombres après " + number + " sont : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print((number + i) + ", ");
        }
        sc.close();
    }
}
