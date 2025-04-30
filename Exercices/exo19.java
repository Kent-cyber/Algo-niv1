/* EXO19 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me créer un convertisseur de secondes au format heures : minutes : secontes
 * 
 * 
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de secondes ?
 * 
 * 156000
 * 
 * 156 000 secondes correspond à 43 heures, 20 minutes et 0 seconde
 * 
 * 
 * 
*/
import java.util.Scanner;
public class exo19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Combien de secondes ?"); // Affiche le texte
        int seconds = sc.nextInt(); // Les secondes données par l'utilisateur

        // Calcul des secondes en heures, minutes et secondes
        int S = seconds % 60; // Calcul les secondes restantes
        int H = seconds / 60; // Converti les secondes en minutes
        int M = H % 60; // Calcul les heures restantes en minutes
        H = H / 60; // Converti les heures en minutes

        System.out.println(seconds + " secondes correspond à " + H + " heures, " + M + " minutes et " + S + " secondes");

        sc.close();
    }
}