/* EXO12 : Avec PRINT & Scanner , vous allez me créer un algo 
 * qui applique une réduction (en pourcentage %) sur un prix (en décimal) donnée :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prix ?
 * 
 * 100.00
 * 
 * Votre réduction (en pourcentage %) ?
 * 
 * 20
 * 
 * 
 * Prix après réduction de 20% :
 * 
 * 80.00
 * 
 * 
 * 
*/

import java.util.Scanner;

public class exo12 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in); // Création du scanner
        System.out.println("Donnez un prix ?");

        double prix = sc.nextDouble(); // prix donné par l'utilisateur

        System.out.println("Votre réduction (en pourcentage %)");
        double reduc = sc.nextDouble(); // la réduction donné en pourcentage par l'utilisateur
        double sum = prix * (1 - reduc / 100);

        System.out.println("Prix final après réduction de " + Math.round(reduc) + " : " + Math.round(sum*100.0)/100.0);

        sc.close();
    }
    
}
