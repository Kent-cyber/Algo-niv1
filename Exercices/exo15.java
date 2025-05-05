/* EXO15 : Avec PRINT & SCANNER : Me créer un convertisseur de devise, Euros , Dollars et Livres Sterling
 * 
 * Vous devriez choisir votre devise en entrée et la devise en sortie
 * 
 * Attention on ne peut pas convertir les deux même devise !
 * 
 * EUR : Euros
 * USD : Dollars
 * GBP : Livres Sterling
 * 
 * le lien ci-dessous vous donne la valeur des monnaies : https://www.boursorama.com/bourse/devises
 * 
 * ATTENTION ! : Montant doivent être décimaux , 2 chiffres après la virgule.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Quel est votre monnaie ?
 * 
 * EUR
 * 
 * Quel est votre montant ?
 * 
 * 100.00
 * 
 * Vous voulez la convertir en quelle devise ?
 * 
 * USD
 * 
 * Résultat : 113,82 USD
 * 
 * 
*/

import java.util.Scanner;

public class exo15 {
    
    public static void Euro_to_other(double amt) {

        System.out.println(Math.round(amt)+" Euro = " + Math.round((amt*1.13*100.0)) / 100.0 + " Dollar");
        System.out.println();

        System.out.println(Math.round(amt)+" Euro = " + Math.round((amt*0.85*100.0)) / 100.0 + " Livre sterling");
    }

    public static void Dollar_to_other(double amt) {

        System.out.println(Math.round(amt)+" Dollar = " + Math.round((amt*0.88*100.0)) / 100.0 + " Euro");
        System.out.println();

        System.out.println(Math.round(amt)+" Dollar = " + Math.round((amt*0.75*100.0)) / 100.0 + " Livre sterling");
    }

    public static void Sterling_to_other(double amt) {

        System.out.println(Math.round(amt)+" Livre sterling = " + Math.round((amt*1.17*100.0)) / 100.0 + " Euro");
        System.out.println();

        System.out.println(Math.round(amt)+" Livre sterling = " + Math.round((amt*1.33*100.0)) / 100.0 + " Dollar");
    }
    public static void main(String[] args) {

        System.out.println("1 EUR : Euros");
        System.out.println("2 USD : Dollars");
        System.out.println("3 GBP : Livres Sterling");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Choisissez votre devise en tapant un des chiffres ci-dessus :");
        int choice = sc.nextInt();

        System.out.println("Entrez votre montant :");
        double amount = sc.nextDouble();

        switch (choice) {
            case 1:
                Euro_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Sterling_to_other(amount);
                break;
            default:
                System.out.println("Ne tapez pas n'importe quoi !");
        }

        sc.close();

    }

    
}
