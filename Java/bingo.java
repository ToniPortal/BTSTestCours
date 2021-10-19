package Java;

import java.util.Scanner;

public class bingo {

    public static void main(String[] args) {

        System.out
                .println("Choisie 1 : mettre un nombre random de nombre a sortir\nChoisie 2 ; pour sortir 10 chiffre");

        Scanner MonScanneur = new Scanner(System.in);
        int ouioupas = MonScanneur.nextInt();
        int nombreasortir = 10;
        if (ouioupas == 2) {
            nombreasortir = 10;
        } else if (ouioupas == 1) {

            nombreasortir = MonScanneur.nextInt();

        }

        int[] j1 = new int[nombreasortir];
        int[] j2 = new int[nombreasortir];
        int[] bingonumber = new int[nombreasortir];

        int boucle = 0;
        int min = 1;
        int max = 100;

        while (boucle < nombreasortir) { // alimenter j1,j2,bingonumber
            j1[boucle] = min + (int) (Math.random() * ((max - min) + min));
            j2[boucle] = min + (int) (Math.random() * ((max - min) + min));
            bingonumber[boucle] = min + (int) (Math.random() * ((max - min) + min));
            System.out.println("j2:" + j2[boucle] + " j1:" + j1[boucle] + "\nNuméro de boucle: " + bingonumber[boucle]);
            boucle++;
        }

        int boucle2 = 0;
        int testchiffre = 0;

        while (boucle2 < 1) {

            if (bingonumber[testchiffre] == j1[testchiffre] || bingonumber[testchiffre] == j2[testchiffre]) {

                boucle2++;
                System.out.println("Win");

            } else {
                testchiffre++;

                if (testchiffre == nombreasortir) {

                    for (int boucle3 = 0; boucle3 < nombreasortir; boucle3++) {
                        testchiffre = 0;
                        bingonumber[boucle3] = min + (int) (Math.random() * ((max - min) + min));
                        System.out.println("New bingo Number: " + bingonumber[boucle3]);
                    }

                }

            }

        }

    }

}
