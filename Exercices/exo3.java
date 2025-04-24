/* EXO3 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition (types entiers) et vérifier si elle est pair ou impaire     
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resultat = 5
 * 
 * resultat est impaire
 * 
 * 
 * 
*/

import java.util.Scanner;

    /***--------Donner un nom à votre class -------------------****/

public class exo3 { // La classe doit toujours avoir le même nom que le fichier

    public static void main(String[] args) { // Toujours le mettre

          /***--------  Début du code  -------------------****/

          Scanner sc = new Scanner(System.in); // Déclaration du scanner
        System.out.print("Donnez deux nombres et la machine va additionner : ");

        int a = sc.nextInt(); // Déclaration de la variable de type entier qui est donné par l'utilisateur
        int b = sc.nextInt();

        int result = a + b;

        if (result % 2 == 0) { // Condition pour savoir s'il est un chiffre pair


            System.out.println("le résultat vaut " + result);
            System.out.println("C'est paire !");
        }

        else { // Sinon il est impair

            System.out.println("le résultat vaut " + result);
            System.out.println("C'est impaire !");


        }

          sc.close();


        /***--------  Fin du code  -------------------****/

    }

}