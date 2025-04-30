/* EXO16 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me faire un algo qui change le prix d'un vol selon les paramètres suivants :
 * 
 * Réduction de 20% si le passager est mineur
 * 
 * Réduction de 40% si le passager est senior de plus 60 ans
 * 
 * Réduction de 20% si il y a plus de 60 places disponibles
 * 
 * Augmentation de 20% si il y a moins de 20 places disponibles
 * 
 * Augmentation de 20% si le passager a choisit la classe business 
 * 
 * -----Vous définisserez vous même le prix initial du vol, le nombre de place disponible, l'âge du voyageur
 * 
 * Si le voyageur a choisi une classe business
 * 
 * 
 *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est l'âge de votre passager ?
 * 
 * 15
 * 
 * Le passager veut-il une classe business (oui/non) ?
 * 
 * oui
 * 
 * Le prix du vol :
 * 
 * 1200
 * 
 * Nombre de places disponibles :
 * 
 * 50
 * 
 * Le prix du vol est de 1200 euros
 * 
 * 
*/
import java.util.Scanner;
public class exo16 {
    public static void main(String[] args) {

        int reducAge, reducPlace, reducClasse;

        Scanner sc = new Scanner(System.in);

        System.out.println("Le prix du vol : ");
        int price = sc.nextInt();

        System.out.println("Quel est l'âge de votre passager ?");
        int age = sc.nextInt();
        
        if (age < 18) {
            reducAge = price * 20 / 100;

        } else if (age > 60) {
            reducAge = price * 40 / 100;

        } else {
            reducAge = 0;

        }

        System.out.println("Le passager veut-il une classe businesse ?");
        boolean classe = sc.nextBoolean();
        
        if (classe == true) {
            reducClasse = price * 20 / 100;

        } else {
            reducClasse = 0;

        }

        System.out.println("Le nombre de places disponible :");
        int place = sc.nextInt();

        if (place > 60) {
            reducPlace = price * 20 / 100;

        } else if (place < 20) {
            reducPlace = price * 20 / 100;

        } else {
            reducPlace = 0;

        }

        System.out.println("Le prix du vol est de " + (price - reducAge + reducClasse - reducPlace));

        sc.close();

        
    }
}
