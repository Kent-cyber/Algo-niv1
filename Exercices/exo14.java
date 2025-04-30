/* EXO14 : Avec PRINT & SCANNER : Tester l'expression algèbrique booléenne A OU B ET NON C
 * 
 * A , B ou C sont des booléens et ne peuvent être qu'égale à TRUE ou FALSE.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une valeur A OU B ET NON C
 * 
 * FALSE
 * TRUE
 * FALSE
 * 
 * Résultat : TRUE
 * 
 * 
 * 
 * 
 * 
*/
import java.util.Scanner;
public class exo14 {
    public static void main(String[] args) {

        boolean a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Donner une valeur A OU B ET NON C");

        a = sc.nextBoolean();
        b = sc.nextBoolean();
        c = sc.nextBoolean();

        boolean result = (a || b && !c);

        System.out.println("Résultat : " + result);


        sc.close();
    }
}
