/* EXO10 : Créer un quizz de 5 questions, chaque question à deux réponses au choix VRAI OU FAUX, à chaque fois que vous répondez juste à une question vous gagnez un point
 * 
 * Après avoir répondez à vos 5 questions, vous avez le résultat final sur 5.
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Question 1 : 
 * 
 * 
*/
import java.util.Scanner; // Importe la classe Scanner

public class exo10 {

    public static void main(String[] args) {

        String[][] quiz = { // Quiz avec question et réponse
            {"Quelle est la capitale de la Suisse ?", "Berne"},
            {"Quelle est la plus grosse planète du système solaire ?", "Jupiter"},
            {"Quelle est la ville la plus peuplée du monde ?", "Tokyo"},
            {"Quel est le lac le plus grand de France ?", "Lac du Bourget"},
            {"Quel est le plus petit pays du monde ?", "Vatican"}
        };

        int result = 0; // initialise le score à 0
        Scanner sc = new Scanner(System.in); // Déclaration du scanner
        
        for (int i = 0; i < quiz.length; i++) { // Déroule chaque question et vérifie la réponse
            
            String question = quiz[i][0];
            String answer = quiz[i][1];

            System.out.println(question); //Affiche la question
            

            String userAnswer = sc.nextLine(); // Réponse de l'utilisateur
            
            if (userAnswer.equalsIgnoreCase(answer)) { // Vérifie les réponses et donne les points

                System.out.println("Bien joué !!");
                result++;

            } else {

                System.out.println("Dommage. La réponse est " + answer + ".");
            }
            
            System.out.println("Ton score est " + result + " sur " + quiz.length + "."); // Affiche le résultat final
        }
        
        sc.close(); // Fermeture du scanner
        
    }
}