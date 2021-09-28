package Java;

import java.util.*;

public class exovar2 {

    public static void main(String[] args) {

        Scanner monScanner = new Scanner(System.in);

        int age = monScanner.nextInt();

        System.out.println("Bonjour utulisateur vous avez : " + age + " ans");
        if (age >= 18) {

            System.out.println("Vous êtes majeur");

        } else if(age >= 1) {

            System.out.println("Vous êtes mineur");

        }

        System.out.println("\n");
        // Exo 2
        switch (age) {
            case 1:
                System.out.println("Menu mcdo burger n°" + age);
                break;
            case 2:
                System.out.println("Menu mcdo chesseburger n°" + age);
                break;
            case 3:
                System.out.println("Menu mcdo bigmac n°" + age);
                break;
            case 4:
                System.out.println("Menu mcdo big bigmac n°" + age);
                break;
            case 5:
                System.out.println("Menu mcdo nuggets n°" + age);
                break;
            case 6:
                System.out.println("Menu mcdo oignon ring n°" + age);
                break;
            case 7:
                System.out.println("Menu mcdo potato n°" + age);
                break;
            case 8:
                System.out.println("Menu mcdo frite n°" + age);
                break;
            case 9:
                System.out.println("Menu mcdo macchesse n°" + age);
                break;
            case 10:
                System.out.println("Menu mcdo n°" + age);
                break;
            default:
                System.out.println("Il n'y a pas de menu correspondant a votre numéro choisi");
                break;
        }

        monScanner.close();
    }

}
