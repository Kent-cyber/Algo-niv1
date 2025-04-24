/* EXO9 : La suite de l'EXO 8, une fois l'inscription terminé, essayez de vous connecter en donnant l'email et le mot de passe correspondant.
 * 
 * Si l'email ou le mot de passe n'est pas vous afficher "connexion refusée"
 * 
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
 * Pour vous connecter, renseignez votre email ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * Renseignez votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * 
 * 
*/
import java.util.Scanner;

    public class exo9 {

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

            if (confirm.equalsIgnoreCase(password)) { // si le mot de passe est bien le même
                System.out.println("Merci " + name + " " + surname + ", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : " + mail);

            } else { // sinon c'est refusé
                System.out.println("Access denied !");
                sc.close();
            }

            System.out.println("Pour vous connecter, renseignez votre email ?");
            String mailConfirm = sc.nextLine();

            System.out.println("Renseignez votre mot de passe ?");
            String passwordConfirm = sc.nextLine();

            if (mailConfirm.equalsIgnoreCase(mail) && passwordConfirm.equalsIgnoreCase(password)) {

                System.out.println("Connexion réussie !");

            } else {

                System.out.println("Connexion refusée !");
            }

            sc.close();

        }
}