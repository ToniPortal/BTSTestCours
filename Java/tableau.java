import java.util.*;

public class tableau {
    public static void main(String[] args) {
        int[] tableautemperature = { 40, 20, 10, 25, 10, 24, 19 };

        int boucle = 0;

        String date = "";

        while (boucle < 7) { // condition
            boucle++;
            switch (boucle) {

                case 1:
                    date = "Mecredi 29 septembre 2021";
                    break;
                case 2:
                    date = "Jeudi 30 septembre 2021";
                    break;
                case 3:
                    date = "Vendredi 1 octobre 2021";
                    break;
                case 4:
                    date = "Samedi 2 octobre 2021";
                    break;
                case 5:
                    date = "Dimanche 3 octobre 2021";
                    break;
                case 6:
                    date = "Lundi 4 octobre 2021";
                    break;
                case 7:
                    date = "Mardi 5 octobre 2021";
                    break;

            }
            System.out.println(boucle + ")" + date);
        }

        Scanner monScanner = new Scanner(System.in);
        int choixtemperature = monScanner.nextInt();
choixtemperature = choixtemperature-1;
System.out.println(choixtemperature);
        switch (choixtemperature) {

            case 0:
                date = "Mecredi 29 septembre 2021";
                break;
            case 1:
                date = "Jeudi 30 septembre 2021";
                break;
            case 2:
                date = "Vendredi 1 octobre 2021";
                break;
            case 3:
                date = "Samedi 2 octobre 2021";
                break;
            case 4:
                date = "Dimanche 3 octobre 2021";
                break;
            case 5:
                date = "Lundi 4 octobre 2021";
                break;
            case 6:
                date = "Mardi 5 octobre 2021";
                break;
            default:
                date = "error";
        }

        if (date.equals("error")) {

            System.out.println("Veuillez demander une valeur disponible");

        } else {

            System.out.println(date + "\nIl a fait : " + tableautemperature[choixtemperature] + "°");

        }
        monScanner.close();
    }
}
