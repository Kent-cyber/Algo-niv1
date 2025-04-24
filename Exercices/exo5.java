/* EXO5 : A l'aide de Scanner et Print, créer une équation  A multiplier par B diviser C (tous types entiers) , récupérer le résultat et vérifier si elle inférieur ou supérieur à 10
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * equation = (EQUATION)
 * 
 * equation = 15
 * 
 * 
 * equation est superieur
 * 
*/

import java.util.Scanner;

    public class exo5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Déclaration du scanner

        System.out.println("Equation : ");

        int a = sc.nextInt(); // Déclaration d'une variable de type entier donné par l'utilisateur
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = a * b / c; // Affiche le resultat demandé

        if (result > 15) {
            System.out.println("le résultat vaut " + result);
            System.out.println("l'equation est supérieur !");
        }
        else {
            System.out.println("le résultat vaut " + result);
            System.out.println("l'equation n'est pas superieur !");
        }

        sc.close(); // Ferme le scanner
        
    }
}