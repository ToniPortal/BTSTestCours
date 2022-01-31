package JavaDebut;

import java.util.*;

public class nombrealeatoire {
    public static void main(String[] args) {
        try (Scanner MonScanneur = new Scanner(System.in)) {
            System.out.println("Saisir le numéro minimum puis le numéro maximum !");
            int min = MonScanneur.nextInt();
            int max = MonScanneur.nextInt();

            int random = min + (int) (Math.random() * ((max - min) + min));

            System.out.println("Num random: " + random);
        }

    }
}
