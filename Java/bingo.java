package Java;

import java.util.Scanner;

public class bingo {
    public static void main(String[] args) {

        System.out
                .println("Choisie 1 : mettre un nombre random de nombre a sortir\nChoisie 2 ; pour sortir 75 chiffre");

        Scanner MonScanneur = new Scanner(System.in);
        int ouioupas = MonScanneur.nextInt(); // Selection d'un nombre random un du chiffre
        int nombreasortir = 75;

        if (ouioupas == 1) {

            nombreasortir = MonScanneur.nextInt(); // Nombre a sortir pour le bingo

        }

        int[] j1 = new int[nombreasortir]; // Tableau j1
        int[] j2 = new int[nombreasortir]; // Tableau j2
        int[] bingonumber = new int[nombreasortir]; // tableau qui sortiron

        int min = 1;
        int max = 100;
        int boucle = 0;
        while (boucle < nombreasortir) { // alimenter j1,j2,bingonumber
            j1[boucle] = min + (int) (Math.random() * ((max - min) + min));
            j2[boucle] = min + (int) (Math.random() * ((max - min) + min));
            bingonumber[boucle] = min + (int) (Math.random() * ((max - min) + min));
            System.out.println("j2:" + j2[boucle] + " j1:" + j1[boucle] + "\nNuméro de boucle: " + bingonumber[boucle]);
            boucle++;
        }



        

        int boucle2 = 0;
        int testchiffre = 0;

        int nombrebouclebingo = 0;
        while (boucle2 < 1) {

            if (bingonumber[testchiffre] == j1[testchiffre]) {

                boucle2++;
                System.out.println("Win J1\nVous avez du relancer:" + nombrebouclebingo + " fois pour gagnez");

            } else if (bingonumber[testchiffre] == j2[testchiffre]) {

                boucle2++;
                System.out.println("Win J2\nVous avez du relancer:" + nombrebouclebingo + " fois pour gagnez");

            } else {
                testchiffre++;

                if (testchiffre == nombreasortir) {
                    for (int boucle3 = 0; boucle3 < nombreasortir; boucle3++) {
                        nombrebouclebingo++;
                        testchiffre = 0;
                        bingonumber[boucle3] = min + (int) (Math.random() * ((max - min) + min));
                        System.out.println("New bingo Number: " + bingonumber[boucle3]);
                    }

                }

            }

        }

        MonScanneur.close();

    }

}
