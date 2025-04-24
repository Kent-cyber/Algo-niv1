
import java.util.Scanner;

    /***--------Donner un nom à votre class -------------------****/

public class ScannerMessage {


    public static void main(String[] args) {

          /***--------  Début du code  -------------------****/

          Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un message : ");

        String message = sc.nextLine();

          System.out.println(message);

          sc.close();


        /***--------  Fin du code  -------------------****/

    }

}
