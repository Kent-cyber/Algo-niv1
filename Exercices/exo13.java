/* EXO13 : Avec PRINT & SCANNER : Convertir du centimètre (Entier) au mètre (Double)
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une taille en centimètre ?
 * 
 * 170
 * 
 * 170 cm vaut 1.70 m
 * 
 * 
 * 
 * 
 * 
 * 
*/
import java.util.Scanner;

public class exo13 {
    public static void main(String[] args) {

        final double METER = 0.01;

        Scanner sc = new Scanner(System.in);

        System.out.println("Donner une taille en centimètre ?");
        int centimeter = sc.nextInt();

        double meter = centimeter * METER; // Converti cm en m

        System.out.println(centimeter + " cm vaut " + meter + " m");

        sc.close();
    }
}
