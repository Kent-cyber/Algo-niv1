/* EXO17 : Avec PRINT & SCANNER : 
 * 
 * Créer un algo qui calcule les dépenses moyenne (en euros, en France) en carburant d'une voiture en fonction 
 * du type de carburant sur une distance en km. 
 * 
 * On consomme 6.5l / 100km pour l'essence
 * On consomme 5.5l / 100km pour le gazole
 * 
 * Les prix des carburants sont sur ce lien : https://carbu.com/france/prixmoyens
 * 
 * carburant par id
 * 
 * Gazole (B7) = 0
 * 
 * Sans Plomb 95 = 1
 * 
 * Sans Plomb 98 (E5) = 2
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est le type de votre carburant ?
 * 
 * 0
 * 
 * Vous avez choisi : Gazole 
 * Quel est la distance à parcourir (en km) ?
 * 
 * 150
 * 
 * Pour 150 km, vous allez dépenser en moyenne 13.99€
 * 
 * /!\ ATTENTION : Le résultat doit être en décimal 2 chiffres après la virgules
 * 
*/
import java.util.Scanner;
public class exo17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Affiche les choix
        System.out.println("1 : Gazole");
        System.out.println("2 : Sans Plomb 95");
        System.out.println("3 : Sans Plomb 98");

        System.out.println("Quel est votre type de carburant ? Tapez un des chiffres ci-dessus");
        int choice = sc.nextInt();

        System.out.println("Quel est la distance à parcourir (en km) ?");
        double distance = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Pour " + Math.round(distance) + " km, vous allez dépenser en moyenne : " + Math.round((distance * (5.5 / 100)) * 1.588 * 100.0) / 100.0 + " euros");
                break;
            case 2:
                System.out.println("Pour " + Math.round(distance) + " km, vous allez dépenser en moyenne : " + Math.round((distance * (6.5 / 100)) * 1.700 * 100.0) / 100.0 + " euros");
                break;
            case 3:
                System.out.println("Pour " + Math.round(distance) + " km, vous allez dépenser en moyenne : " + Math.round((distance * (6.5 / 100)) * 1.794 * 100.0) / 100.0 + " euros");
                break;
            default:
                System.out.println("Ne tapez pas n'importe quoi !");
        }

        sc.close();
    }
}

