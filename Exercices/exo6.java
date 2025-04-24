/* EXO6 : A l'aide de Scanner et Print, donnez moi votre prénom et votre âge, pour l'affichage sous la forme d'une phrase dynamique
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * prenom = "Eudes"
 * 
 * age = 32
 * 
 * Je m'appelle Eudes , j'ai 32 ans
 * 
 * 
 * 
*/
import java.util.Scanner;

    public class exo6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Déclaration du scanner

        System.out.println("Entrez votre nom et votre âge :");

        String name = sc.nextLine(); // Déclaration d'une variable de type text
        int age = sc.nextInt(); // Déclaration d'une variable de type entier

        System.out.println("Je m'appelle " + name + ", j'ai " + age + " ans");

        sc.close(); // Ferme le scanner
        
    }
}