/* EXO4 : A l'aide de Scanner et Print, tester si une valeur(type entier) est divisible par 2   
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 14
 * 
 * 
 * a est bien divisible par 2
 * 
 * 
*/

import java.util.Scanner;

    /***--------Donner un nom à votre class -------------------****/

public class exo4 { // La classe doit toujours avoir le même nom que le fichier

    public static void main(String[] args) { // Toujours le mettre

          /***--------  Début du code  -------------------****/

        Scanner sc = new Scanner(System.in);
        System.out.print("Donnez-moi un chiffre et je vous dirai s'il est divisible : ");

        int a = sc.nextInt(); // Déclaration de la variable de type entier qui est donné par l'utilisateur

        int result = a;

        if (result % 2 == 0) {


            System.out.println("a = " + result);
            System.out.println("a est bien divisible !");
        }

        else {

            System.out.println("a =  " + result);
            System.out.println("a est pas divisible !");


        }

          sc.close();


        /***--------  Fin du code  -------------------****/

    }

}