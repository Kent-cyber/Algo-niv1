/* EXO11 : Avec PRINT & Scanner , vous allez simuler un distributeur de banque :
 * 
 * Vous avez 3000€ sur votre compte, créer un algo qui retire un montant sur votre compte banquaire
 * votre solde ne peut pas être négatif
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, combien voulez-vous retirer ?
 * 
 * 3500
 * 
 * Opération refusée, fond insuffissant !
 * 
 * 
*/
import java.util.Scanner;

public class exo11 {

    public static void main(String[] args) {

        int money = 3000; // Argent sur le compte
        int montant, sum;

        Scanner sc = new Scanner(System.in); // Création du scanner
        System.out.println("Bonjour, combien voulez-vous retirer ?");
        montant = sc.nextInt(); // Montant donné par l'utilisateur

        sum = money - montant;

        if (sum < 0) {
            System.out.println("Opération refusée, fond insuffisant !");

        } else {
            System.out.println("Transaction réussie !");
        }

        sc.close();

        
    }
}
