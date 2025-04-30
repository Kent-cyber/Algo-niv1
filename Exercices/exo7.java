/* EXO7 : A l'aide de Scanner et Print, créer un questionnaire, "Do you speak english ?", répondre yes ou no, puis retourner le messages suivants 
 * 
 * si FALSE "So learn english !"
 * 
 * Si TRUE "Nice to meet you"
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Do you speak english (Y/N)?
 * 
 * Y (Tapez Y)
 * 
 * "Nice to meet you"
 * 
 * 
 * 
*/
import java.util.Scanner;

    public class exo7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Déclaration du scanner

        String[] question = {"Do you speak english ?", "Yes", "No"};

        String yes = question[1];
        String no = question[2];

        System.out.println(question[0]);
        String userAnswer = sc.nextLine();

        if (userAnswer.equalsIgnoreCase(yes)) {
            System.out.println("Nice to meet you !");

        } else if (userAnswer.equalsIgnoreCase(no)) {
            System.out.println("You suck in english !");

        } else {

            System.out.println("This is not an answer !");
        }

        sc.close(); // Ferme le scanner
        
    }
}