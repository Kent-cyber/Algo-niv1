package Kit_pédagogique;

import java.util.Scanner;

public class Futur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un nombre d'heures et de minutes :");
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if (hour > 23 || minute > 59) {
            System.out.println("Les données saisies sont invalides");

        } else {
            System.out.println("Vous avez saisi : " + hour + "h" + minute);

            minute = minute + 3;

            if (minute > 59) {

                minute = minute % 60;
                hour = hour + 1;

                if (hour > 23) {

                    hour = hour % 24;

                    System.out.println("3 minutes plus tard, il sera " + hour + "h" + minute);
                } else {

                    System.out.println("3 minutes plus tard, il sera " + hour + "h" + minute);
                }

            } else {

                System.out.println("3 minutes plus tard, il sera " + hour + "h" + minute);
            }
            
        }

        sc.close();
    }
}
