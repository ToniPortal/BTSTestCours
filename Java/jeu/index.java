package jeu;

import java.util.ArrayList;

public class index {

    private static int random(int min, int max) {
        return (min + (int) (Math.random() * ((max - min) + min)));
    }

    public static void main(String[] args) {

        int[] posX = new int[99];
        int[] toutestat = new int[99];
        String[] pseudo = new String[99];
        int statcombat[] = new int[99];

        ArrayList<personnage> al = new ArrayList<>();

        for (int i = 0; i <= 98; i++) {

            personnage P1 = new personnage();
            posX[i] = P1.getposX();
            toutestat[i] = P1.toutestat();
            pseudo[i] = P1.getpseudo();
            statcombat[i] = P1.cordocombat();

            al.add(P1);
        }

        for (int i = 0; i <= 97; i++) {

            if (posX[i] == posX[i + 1]) {
                System.out.println("même cordo");
                if ((statcombat[i] - statcombat[i + 1]) < 0) {
                    System.out.println("GG a: " + pseudo[i + 1]);
                    (al.get(i + 1)).setaddforce(random(1, 3));
                    (al.get(i + 1)).setaddendu(random(1, 3));
                    (al.get(i + 1)).setaddagi(random(1, 3));
                    (al.get(i + 1)).setaddinte(random(1, 3));
                } else {
                    System.out.println("GG a: " + pseudo[i]);
                }
            }

        }

        int maxNum = toutestat[0];

        for (int j : toutestat) {
            if (j > maxNum)
                maxNum = j;
        }
        int quiestce = 0;
        for (int i = 0; i <= 98; i++) {

            if (toutestat[i] == maxNum) {
                quiestce = i;

            }

        }
        String quiestcefinal = pseudo[quiestce];

        System.out.println("Maximum number = " + maxNum + "\nQui est ce:" + quiestcefinal);
    }

};