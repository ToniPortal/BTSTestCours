package JavaDebut;

public class exoboucle {
    public static void main(String[] args) {

        int[] monTableauDEntiers = new int[1000];
        int boucle = 0;
        while (boucle < 1000) {
            monTableauDEntiers[boucle] = boucle + 1;
            boucle++;
        }
        int somme = 0;
        for (int monCompteur = 1; monCompteur <= monTableauDEntiers.length; monCompteur = monCompteur + 1) {

            somme = somme + monTableauDEntiers[monCompteur - 1];

        }
        System.out.println(somme);

    }

}
