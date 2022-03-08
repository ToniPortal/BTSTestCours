package jeu;

import java.util.ArrayList;

public class index {

    private static int random(int min, int max) {
        return (min + (int) (Math.random() * ((max - min) + min)));
    }

    public static void main(String[] args) {

        int[] toutestat = new int[100];
        ArrayList<personnage> al = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

            personnage P1 = new personnage();
            toutestat[i] = P1.toutestat();

            al.add(P1);
            System.out.println(P1.toString());
        }

        int nbjoueurenvie = 100;
        // -------------------------------------------------------------

        int nborgre = 0;
        int activationorgre = 0;

        int activationnains = 0;
        int nbnains = 0;

        int activationvoleur = 0;
        int nbvoleur = 0;

        int ancienjoueur = 0;

        int prochaintourformage = 0;
        while (nbjoueurenvie >= 1) {
            for (int u = 0; u < 100; u++) {

                al.get(u).deplacement();

                for (int p = 0; p < al.size(); p++) {

                    al.get(p).deplacement();

                    if (activationorgre == 1) {
                        nborgre++;
                        if (nborgre == 1) {
                            (al.get(ancienjoueur).getClassOrgre()).specia();
                        }
                        if (nborgre == 5) {
                            activationorgre = 0;
                        }
                    }

                    if (activationnains == 1) {
                        nbnains++;
                        if (nbnains == 1) {
                            (al.get(ancienjoueur).getClassNains()).specia();
                        }
                        if (nbnains == 7) {
                            activationnains = 0;
                        }
                    }

                    if (activationvoleur == 1) {
                        nbvoleur++;
                        if (nbvoleur == 1) {
                            (al.get(ancienjoueur).getClassVoleur()).specia();
                        }
                        if (nbvoleur == 4) {
                            activationvoleur = 0;
                        }
                    }
                    if (prochaintourformage == 1) {
                        (al.get(ancienjoueur).getClassMagicien()).specia();
                        prochaintourformage = 0;
                    }

                    if (al.get(u) != al.get(p)) {

                        if (al.get(p).getvivantoupas() == true && al.get(u).getvivantoupas() == true) {

                            if (al.get(u).getposY() == al.get(p).getposY()
                                    && al.get(u).getposX() == al.get(p).getposX()) {

                                if (al.get(u).cordocombat() > al.get(u).cordocombat()) {

                                    if (al.get(p).getClasse() == 4) {
                                        if (activationvoleur == 0) {
                                            activationvoleur = 1;
                                            ancienjoueur = p;
                                        }
                                    }

                                    if (al.get(p).getClasse() == 3) {
                                        if (activationnains == 0) {
                                            activationnains = 1;
                                            ancienjoueur = p;
                                        }
                                    }

                                    if (al.get(p).getClasse() == 2) {
                                        if (activationorgre == 0) {
                                            activationorgre = 1;
                                            ancienjoueur = p;
                                        }
                                    }
                                    if (al.get(p).getClasse() == 1) {

                                        prochaintourformage = 1;
                                        ancienjoueur = p;

                                    }

                                    System.out.println(
                                            al.get(u).getpseudo() + " a gagné contre " + al.get(p).getpseudo());

                                    al.get(p).setmort();

                                    nbjoueurenvie = nbjoueurenvie - 1;

                                    System.out.println("Plus que " + nbjoueurenvie + " joueurs en vie !");

                                    // Ici c'est U qui gg
                                    switch (random(1, 4)) {
                                        case 1:
                                            al.get(u).setaddforce(3);
                                            break;
                                        case 2:
                                            al.get(u).setaddendu(3);
                                            break;
                                        case 3:
                                            al.get(u).setaddagi(3);
                                            break;
                                        case 4:
                                            al.get(u).setaddinte(3);
                                            break;
                                    }

                                } else {

                                    if (al.get(u).getClasse() == 4) {
                                        if (activationvoleur == 0) {
                                            activationvoleur = 1;
                                            ancienjoueur = u;
                                        }
                                    }

                                    if (al.get(u).getClasse() == 3) {
                                        if (activationnains == 0) {
                                            activationnains = 1;
                                            ancienjoueur = u;
                                        }
                                    }
                                    if (al.get(u).getClasse() == 2) {
                                        if (activationorgre == 0) {
                                            activationorgre = 1;
                                            ancienjoueur = u;
                                        }
                                    }
                                    if (al.get(u).getClasse() == 1) {
                                        if(voirautourdelui(al, 10, 10, u) == true){
                                            prochaintourformage = 1;
                                            ancienjoueur = u;
                                        }
                                    }

                                    System.out.println(
                                            al.get(p).getpseudo() + " a gagné contre " + al.get(u).getpseudo());

                                    al.get(u).setmort();

                                    nbjoueurenvie = nbjoueurenvie - 1;

                                    System.out.println("Plus que " + nbjoueurenvie + " joueurs en vie !");

                                    // Ici c'est P qui gg
                                    switch (random(1, 4)) {
                                        case 1:
                                            al.get(p).setaddforce(3);
                                            break;
                                        case 2:
                                            al.get(p).setaddendu(3);
                                            break;
                                        case 3:
                                            al.get(p).setaddagi(3);
                                            break;
                                        case 4:
                                            al.get(p).setaddinte(3);
                                            break;
                                    }

                                }
                            }
                        }
                    }
                }

            }
            if (nbjoueurenvie == 1) {
                for (int g = 0; g < al.size(); g++) {

                    if (al.get(g).getvivantoupas() == true) {

                        System.out.println(al.get(g).toString());
                        nbjoueurenvie--;
                        g = al.size();
                    }

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

    } // Public static de lancement

    public static boolean voirautourdelui(ArrayList<personnage> al, int X, int Y,int retintdumagicient) {

int unepersonnetropfort = 0;

        for (int u = 0; u <= X; u++) {

            for (int g = 0; g <= Y; g++) {

                if(al.get(g).cordocombat() > al.get(retintdumagicient).cordocombat()){

                    unepersonnetropfort++;
                }else {
                    unepersonnetropfort--;
                }

                if(unepersonnetropfort >= 1){
                    System.out.println("TRUE" + unepersonnetropfort);
                    return true;
                }

            }

        }
        System.out.println("FALSE");
        return false;

    }

};