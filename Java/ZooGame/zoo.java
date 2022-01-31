package ZooGame;

import java.util.ArrayList;

public class zoo {

    // min + (int) (Math.random() * ((max - min) + min));

    private int de1;
    private int de2;
    private String nom;
    private int unNbanimaux;

    private ArrayList<animal> arrayanimal;

    public zoo(String nom, int unNbanimaux) {
        randomdes();
        this.nom = nom;
        this.unNbanimaux = unNbanimaux;

        for (int i = 0; i < unNbanimaux; i++) {

            animal A1 = new animal();
            this.arrayanimal = new ArrayList<animal>();
            this.arrayanimal.add(A1);

            System.out.println(A1.getNom());

        }

    }

    private void randomdes() {
        int min = 0;
        int max = 99;
        this.de1 = min + (int) (Math.random() * ((max - min) + min));
        this.de2 = min + (int) (Math.random() * ((max - min) + min));
    }

    public String toString() {
        String message = "Zoo - nom: " + this.nom + "\n Zoo - nbAnimaux " + this.unNbanimaux;

        for (animal unAnimalencours : this.arrayanimal) {
            message = message + unAnimalencours.toString() + "\n";
        }

        return message;

    }

}
