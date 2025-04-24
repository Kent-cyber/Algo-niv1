/* EXO8 : A l'aide de Scanner et Print, créer un formulaire d'inscription, où on vous demande de renseignez, votre prénom, votre nom, adresse email,
 *  mot de passe et confirmer votre mot de passe (ils doivent être identiques). Si les mots de passes ne sont pas identiques, ceci affiche "inscription annulée"
 * Sinon vous affichez le message suivant ci-dessous :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prénom ?
 * 
 * Eudes
 * 
 * Votre nom ?
 * 
 * Konda
 * 
 * Votre adresse ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * confirmer votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * Merci Eudes KONDA , votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : ekonda@arfp.asso.fr
 * 
*/
import java.util.Scanner;

    public class exo8 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Votre prénom ?");
            String name = sc.nextLine();

            System.out.println("Votre nom ?");
            String surname = sc.nextLine();

            System.out.println("Votre adresse mail ?");
            String mail = sc.nextLine();

            System.out.println("Votre mot de passe ?");
            String password = sc.nextLine();

            System.out.println("Confirmer votre mot de passe ?");
            String confirm = sc.nextLine();

            if (confirm.equalsIgnoreCase(password)) {
                System.out.println("Merci " + name + " " + surname + ", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : " + mail);

            } else {
                System.out.println("Access denied !");
            }

            sc.close();

        }
}