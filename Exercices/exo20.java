/* EXO20 : Avec PRINT & SCANNER : 
 * 
 * Vous allez créer un algo de sondage pour des élections, 
 * la candidate Joseline Inutile et le candidat Vincent Escreau pour la mairie de Mulhouse.
 * Vous avez 150 000 votants, donnez le nombre de votant pour Escreau et pour Inutile, et le nombre de vote blanc
 * Si le total des votes n'est pas atteint, les votes manquants seront comptés blanc
 * Si le total de vote est supérieur aux nombres de votants alors il y a une erreur
 * Puis calculez en pourcentage en fonction du nombres de votants ( ceux qui n'ont pas voter blanc)
 * Le score en pourcentage, le gagnant doit avoir plus de 60% sinon il devra y avoir un second tour :
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de gens ont voté pour Joseline Inutile ?
 * 
 * 100 000
 * 
* Combien de gens ont voté pour Vincent Escreau ?
 * 
 * 20 000
 * 
* Vous avez 30 000 d'abstentions, ils seront compté nul
 * 
 * 
 * Joseline Inutile : 66.7%
 * 
 * Vincent Escreau : 33.3%
 * 
 * 
 * Joseline Inutile est la nouvelle maire de Mulhouse
 * 
 * 
*/
import java.util.Scanner;
public class exo20 {
    public static void main(String[] args) {

        final int votant = 150000;

        Scanner sc = new Scanner(System.in);

        System.out.println("Combien de gens ont voté pour Joseline Inutile ?"); // Affiche la question demandé
        double voteJose = sc.nextInt(); // donne le nombre donné par l'utilisateur

        System.out.println("Combien de gens ont voté pour Vincent Escreau ?"); // Affiche la question demandé
        double voteVince = sc.nextInt(); // donne le nombre donné par l'utilisateur

        double blanc = votant - (voteJose + voteVince); // Calcul le reste en vote blanc

        if (blanc < 0) { // Si le nombre dépasse le nombre des votants
            System.out.println("Erreur, c'est impossible d'avoir autant"); // Alors cela affiche ce message d'érreur et s'arrête là

        } else {
            System.out.println("Vous avez " + Math.round(blanc) + " d'abstentions, ils seront compté nul"); // Affiche le vote blanc en arrondissant
            
            double resultJose = (voteJose * 100) / (votant - blanc); // Calcul le pourcentage des votes de Joseline
            double resultVince = (voteVince * 100) / (votant - blanc); // Calcul le pourcentage des votes de Vincent

            System.out.println("Joseline Inutile : " + Math.round(resultJose * 10.0) / 10.0 + "%"); // Affiche le résultat en arrondissant à un nombre après la virgule
            System.out.println("Vincent Escreau : " + Math.round(resultVince * 10.0) / 10.0 + "%");
            
            if (resultJose >= 60) { // Si le pourcentage de votes de Joseline est supérieur ou égale à 60
                System.out.println("Joseline Inutile est la nouvelle maire de Mulhouse");

            } else if (resultVince >= 60) { // Si le pourcentage de votes de Vincent est supérieur ou égale à 60
                System.out.println("Vincent Escreau est le nouveau Maire de Mulhouse");

            } else {
                System.out.println("Il y aura un second tour");

            }

        }
        
        sc.close();
    }
}
