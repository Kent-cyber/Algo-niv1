/* EXO2 : A l'aide de Scanner et Print, me faire afficher le résultat d'une soustraction (types entiers) et vérifier si elle est inférieur à 0    
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a - b
 * 
 * resultat = -1
 * 
 * resutat est inférieur à 0
 * 
 * 
 * 
 */


import java.util.Scanner;

    /***--------Donner un nom à votre class -------------------****/

public class exo2 { // La classe doit toujours avoir le même nom que le fichier


    public static void main(String[] args) { // Toujours le mettre

          /***--------  Début du code  -------------------****/

          Scanner sc = new Scanner(System.in);
        System.out.print("Donnez deux nombres et la machine va soustraire : ");

        int a = sc.nextInt(); // Déclaration de la variable de type entier donné par l'utilisateur
        int b = sc.nextInt();

        int result = a - b; // Calcul les deux variables

        if (result > 0) { // 1ère condition si le résultat est supérieur à 0


            System.out.println("le résultat vaut " + result);
            System.out.println("il est donc supérieur à 0");
        }

        else if (result < 0) { // Sinon il est inférieur

            System.out.println("le résultat vaut " + result);
            System.out.println("il est donc inférieur à 0");


        }


          sc.close();


        /***--------  Fin du code  -------------------****/

    }

}