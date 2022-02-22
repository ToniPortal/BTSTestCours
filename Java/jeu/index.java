package jeu;

import java.util.ArrayList;

public class index {

    private static int random(int min, int max) {
        return (min + (int) (Math.random() * ((max - min) + min)));
    }

    public static void main(String[] args) {

        int[] toutestat = new int[99];
        ArrayList<personnage> al = new ArrayList<>();
        for (int i = 0; i <= 98; i++) {

            personnage P1 = new personnage();
            toutestat[i] = P1.toutestat();

            al.add(P1);
           // System.out.println(P1.toString());
        }

        for (int i = 0; i <= al.size() - 2; i++) {

            al.get(i).tour();

            if (al.get(i).getposX() == al.get(i + 1).getposX() && al.get(i).getposY() == al.get(i + 1).getposY()) {

                System.out.println("même cordo");

                if ((al.get(i).cordocombat() - al.get(i + 1).cordocombat()) < 0) {

                    System.out.println("GG a: " + al.get(i + 1).getpseudo());
                    switch (random(1, 4)) {
                        case 1:
                            (al.get(i + 1)).setaddforce(3);
                            break;
                        case 2:
                            (al.get(i + 1)).setaddendu(3);
                            break;
                        case 3:
                            (al.get(i + 1)).setaddagi(3);
                            break;
                        case 4:
                            (al.get(i + 1)).setaddinte(3);
                            break;
                    }
                    al.remove(i);
                } else {
                    System.out.println("GG a: " + al.get(i).getpseudo());
                    switch (random(1, 4)) {
                        case 1:
                            (al.get(i)).setaddforce(3);
                            break;
                        case 2:
                            (al.get(i)).setaddendu(3);
                            break;
                        case 3:
                            (al.get(i)).setaddagi(3);
                            break;
                        case 4:
                            (al.get(i)).setaddinte(3);
                            break;
                    }
                    al.remove(i + 1);
                }
            }

        }

        int maxNum = toutestat[0];

        for (int j : toutestat) {
            if (j > maxNum)
                maxNum = j;
        }
        int quiestce = 0;
        for (int i = 0; i <= toutestat.length - 1; i++) {

            if (toutestat[i] == maxNum) {
                quiestce = i;

            }

        }
        String quiestcefinal = al.get(quiestce).getpseudo();

        System.out.println("Maximum number = " + maxNum + "\nGG facile:" + quiestcefinal);

    }

};