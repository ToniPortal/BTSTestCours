package Java;

import java.util.Scanner;

public class controle {

    public static void main(String[] args) {
        Scanner MonScanneur = new Scanner(System.in); // Scanneur pour interagir avec l'utulisateur

        int scorej1 = 0; // Score j1
        int scorej2 = 0; // Score j2

        int numerodutour = 0; // Afficher le nombre de tour.
        int tour = 0; // Boucle pour faire le nombre de tour demander(10 tour)(mais vu que on fait 2
                      // fois on divise par 2 le nombre)
        while (tour < 5) {
            numerodutour++;
            int[] j1 = new int[5]; // Tableau j1
            int[] j2 = new int[5]; // Tableau j2

            // min 1 et max 6 car un dés n'a que 6 face
            int min = 1;
            int max = 6;

            int bouclepj1 = 0; // 1ère boucle pour les 5 dés du j1
            while (bouclepj1 < 5) { // alimenter j1
                j1[bouclepj1] = min + (int) (Math.random() * ((max - min) + min));
                bouclepj1++;
            }
            String resultatj1 = j1[0] + " " + j1[1] + " " + j1[2] + " " + j1[3] + " " + j1[4];
            System.out.println("Tour " + numerodutour + ":\nJoueur 1 : voici votre jeu " + resultatj1
                    + "\nQuelle est votre annonce ?");
            int annoncej1 = MonScanneur.nextInt(); // Demander au joueurs 1 son score(il peut mentir donc zéro
                                                   // vérification)
            System.out.println("->" + annoncej1);

            int bouclepj2 = 0; // 2ième boucle pour les 5 dés du j2
            while (bouclepj2 < 5) { // alimenter j2
                j2[bouclepj2] = min + (int) (Math.random() * ((max - min) + min));
                bouclepj2++;
            }
            String resultatj2 = j2[0] + " " + j2[1] + " " + j2[2] + " " + j2[3] + " " + j2[4]; // les nombre sortie

            System.out.println("Joueur 2 : voici votre jeu " + resultatj2 + "\nQuelle est votre annonce ?");
            System.out.println("Que répondez-vous ? je fais : PAREIL, MIEUX, MOINS BIEN");
            String eviterPbNextLine = MonScanneur.nextLine(); // permet d'utiliser un nextLine près un nextInt
            String annoncej2 = MonScanneur.nextLine();// Demander a l'utulisateur si il a fait PAREIL, MIEUX, MOINS BIEN
            System.out.println("->" + annoncej2);

            int totalj1 = j1[0] + j1[1] + j1[2] + j1[3] + j1[4]; // La somme total des dés du j1
            int totalj2 = j2[0] + j2[1] + j2[2] + j2[3] + j2[4]; // La somme total des dés du j2

            System.out.println("Résultats\nJoueur 1 : " + resultatj1 + "= " + totalj1 + "\nJoueur 2 : " + resultatj2
                    + "= " + totalj2);

            // Qui a fait mieux ?
            int scoreajout = 0; // Combien va ton ajouter au score ?
            switch (annoncej2) {
            case "PAREIL":
                if (totalj1 == totalj2) {
                    scoreajout = 5;
                    scorej2 = scorej2 + 5;

                }
                break;
            case "MIEUX":
                if (totalj1 < totalj2) {
                    scoreajout = 1;
                    scorej2++;
                }
                break;
            }
            if (annoncej2.equals("MOINS BIEN")) {
                if (totalj1 > totalj2) {
                    scoreajout = 1;
                    scorej2++;
                }
            }
            // Que a t'il vraiment fait ?
            String queatilvrmfait = "jsp";

            if (totalj1 > totalj2) {
                queatilvrmfait = "MOINS BIEN";
            } else if (totalj1 == totalj2) {
                queatilvrmfait = "PAREIL";
            } else if (totalj1 < totalj2) {
                queatilvrmfait = "MIEUX";
            }

            System.out.println("Le Joueur 2 fait " + queatilvrmfait + " il pensait faire " + annoncej2 + " il gagne "
                    + scoreajout + " point(s)");
            System.out.println("Scores\nJoueur 1 : " + scorej1 + "\nJoueur 2 : " + scorej2); // annonce des score

            System.out.println("\n"); // pour bien voir que ça va être le tour suivant

            // TOUR SUIVANT donc on inverse les rôles
            bouclepj2 = 0;
            while (bouclepj2 < 5) { // alimenter j2
                j2[bouclepj2] = min + (int) (Math.random() * ((max - min) + min));
                bouclepj2++;
            }
            resultatj2 = j2[0] + " " + j2[1] + " " + j2[2] + " " + j2[3] + " " + j2[4]; // les nombre sortie mais Tour 2

            numerodutour++;
            System.out.println("Tour " + numerodutour + ":\nJoueur 2 : voici votre jeu " + resultatj2
                    + "\nQuelle est votre annonce ?");
            int annoncej2t2 = MonScanneur.nextInt();// Demander au joueurs 2 score(il peut mentir donc zéro
                                                    // vérification)
            System.out.println("->" + annoncej2t2);

            bouclepj1 = 0; // 2ième boucle pour les 5 dés du j2 tour2
            while (bouclepj1 < 5) { // alimenter j2 tour2
                j1[bouclepj1] = min + (int) (Math.random() * ((max - min) + min));
                bouclepj1++;
            }
            resultatj1 = j1[0] + " " + j1[1] + " " + j1[2] + " " + j1[3] + " " + j1[4]; // les nombre sortie tour 2

            System.out.println("Joueur 1 : voici votre jeu " + resultatj1);
            System.out.println("Que répondez-vous ? je fais : PAREIL, MIEUX, MOINS BIEN");
            eviterPbNextLine = MonScanneur.nextLine(); // Cette ligne permet d'utiliser un nextLine près un nextInt
            String annoncej1t2 = MonScanneur.nextLine();// Demander si il a fait PAREIL, MIEUX, MOINS BIEN
            System.out.println("->" + annoncej1t2);

            totalj1 = j1[0] + j1[1] + j1[2] + j1[3] + j1[4]; // La somme total des dés du j1 tour2
            totalj2 = j2[0] + j2[1] + j2[2] + j2[3] + j2[4]; // La somme total des dés du j2 tour2

            System.out.println("Résultats\nJoueur 2 : " + resultatj2 + " = " + totalj2 + "\nJoueur 1 : " + resultatj1
                    + " = " + totalj1); // résultat t2

            // Qui a fait mieux ?
            scoreajout = 0; // Combien va ton ajouter au score ?
            switch (annoncej1t2) {
            case "PAREIL":
                if (totalj1 == totalj2) {
                    scoreajout = 5;
                    scorej1 = scorej1 + 5;

                }
                break;
            case "MIEUX":
                if (totalj1 > totalj2) {
                    scoreajout = 1;
                    scorej1++;
                }
                break;
            }
            if (annoncej1t2.equals("MOINS BIEN")) {
                if (totalj1 < totalj2) {
                    scoreajout = 1;
                    scorej1++;
                }
            }

            // Que a t'il vraiment fait ?
            queatilvrmfait = "jsp";

            if (totalj1 < totalj2) {
                queatilvrmfait = "MOINS BIEN";
            } else if (totalj1 == totalj2) {
                queatilvrmfait = "PAREIL";
            } else if (totalj1 > totalj2) {
                queatilvrmfait = "MIEUX";
            }

            System.out.println("Le Joueur 1 fait " + queatilvrmfait + " il pensait faire " + annoncej1t2 + " il gagne "
                    + scoreajout + " point(s)");
            System.out.println("Scores\nJoueur 1 : " + scorej1 + "\nJoueur 2 : " + scorej2); // annonce des score

            System.out.println("\n"); // pour bien voir que ça va être le tour suivant

            tour++; // relancer pour faire le nombre de tour requis
        }

        // Fin de partie affichage des score
        System.out.println("FIN DE LA PARTIE\nJoueur 1 : " + scorej1 + "\nJoueur 2 : " + scorej2 + "\n");

        // Vérification de qui va gagner et le dire a l'utulisateur !
        int poursavoirquiwin = scorej2 - scorej1;
        if (poursavoirquiwin > 0) {
            // Joueurs 2 qui gagne
            System.out.println("Bravo Joueur 2 tu as gagné !!!");

        } else if (poursavoirquiwin < 0) {
            // Joueurs 1 qui gagne
            System.out.println("Bravo Joueur 1 tu as gagné !!!");

        } else {

            System.out.println("égalité !!!");

        }
        MonScanneur.close();

    }
}
