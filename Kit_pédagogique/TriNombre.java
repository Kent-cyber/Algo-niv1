package Kit_pédagogique;

import java.util.Scanner;
import java.util.Arrays;

public class TriNombre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir trois nombres et je les classe dans l'ordre croissant :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] nb = {a, b, c};
        Arrays.sort(nb);

        for (int i : nb) {
            System.out.println(i);
        }

        sc.close();
    }
    
}
