
import java.util.*;

public class kevadamsexo {

    public static void main(String[] args) {

        System.out.println("Veuillez mettre : prenom,nom,mail ou votre numéro secret");
        
        Scanner monScanner = new Scanner(System.in);

        String prenom = monScanner.nextLine();
        String nom = monScanner.nextLine();
        String mail = monScanner.nextLine();
        int secret = monScanner.nextInt();

        String prenomnom;
        if (secret == 6666) {

            prenomnom = "";

        } else {

            prenomnom = prenom + " " + nom;

        }

        if (prenom.equals("kev") == true && nom.equals("adam") == true && mail.equals("kev.adams@gmail.com") == true
                || secret == 6666) {
            // Les deux noms sont identiques
            System.out.println("Combien D'argent voulez vous ? " + prenomnom);
            int argent = monScanner.nextInt();
            System.out.println("Vous venez de sortir " + argent + "$\nBonne journée " + prenomnom);
        } else {
            // Les deux noms sont différents
            System.out.println("Veuillez mettre des identifiant valide ou votre code secret");
        }

        monScanner.close();
    }

}