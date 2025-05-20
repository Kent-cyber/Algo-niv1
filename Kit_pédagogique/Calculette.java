package Kit_pédagogique;

import java.util.Scanner;

public class Calculette {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez le premier nombre :");
        int num1 = sc.nextInt();

        System.out.println("Entrez le deuxième nombre :");
        int num2 = sc.nextInt();

        System.out.println("Entrez l'opérateur pour calculer. ex: +, -, *, / :");
        String o = "*";

        switch (o) {
            case "+":
                System.out.println(num1 + num2);
                break;

            case "-":
                System.out.println(num1 - num2);
                break;
            
            case "*":
                System.out.println(num1 * num2);
                break;

            case "/":
                System.out.println(num1 / num2);
                break;

            default:
                System.out.println("Opérateur invalide");

        }

        sc.close();
    }
}
