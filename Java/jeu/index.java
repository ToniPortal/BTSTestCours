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
            System.out.println(P1.toString());
        }

        int tourautoriseorgre = 0;
        int tourorgre = 0;

        int tourautorisenains = 0;
        int tournains = 0;

        int tourautorisevoleur = 0;
        int tourvoleur = 0;

        int quiestu;

        for (int i = 0; i <= al.size() - 2; i++) { // Parcourir la liste

            if (al.get(i).getvivantoupas() == 0) {

                al.get(i).deplacement(); // deplacement des personnage

                if (tourautoriseorgre == 2) {
                    tourautoriseorgre--;
                    (al.get(i - 1).getClassOrgre()).specia();
                } else if (tourautoriseorgre == 1) {
                    if (tourorgre == 5) {

                    } else {
                        tourorgre++;
                    }
                }

                if (tourautorisenains == 2) {
                    tourautorisenains--;
                    (al.get(i - 1).getClassNains()).specia();
                } else if (tourautorisenains == 1) {
                    if (tournains == 7) {

                    } else {
                        tournains++;
                    }
                }

                if (tourautorisevoleur == 2) {
                    tourautorisevoleur--;
                    (al.get(i - 1).getClassArabe()).specia();
                } else if (tourautorisevoleur == 1) {
                    if (tourvoleur == 4) {

                    } else {
                        tourvoleur++;
                    }
                }

                // Même cordonée donc combat
                if (al.get(i).getposX() == al.get(i + 1).getposX() && al.get(i).getposY() == al.get(i + 1).getposY()) {

                    System.out.println(al.get(i).getpseudo() + " VS " + al.get(i + 1).getpseudo());

                    if ((al.get(i).cordocombat() - al.get(i + 1).cordocombat()) < 0) { // Verif combat
                        quiestu = 0;
                        if (al.get(i).getClasse() == 2) {
                            // Ogre
                            if (tourorgre == 5) {
                                tourautoriseorgre = 2;
                                tourorgre = 0;
                                System.out.println("L'orgre a ajouté 20 de force au prochain tour !");
                            }
                        } else if (al.get(i).getClasse() == 3) {
                            // Nains
                            if (tourorgre == 7) {
                                tourautorisenains = 2;
                                tournains = 0;
                                System.out.println("Le nains a ajouté 100 d'agi et d'endu au prochain tour !");
                            }
                        } else if (al.get(i).getClasse() == 4) {
                            // voleur
                            if (tourvoleur == 4) {
                                tourautorisevoleur = 2;
                                tourvoleur = 0;
                                System.out.println(
                                        "Le voleur va prendre une des compétence des autre 'race' mais ce sera pénalisé de 15%");
                            }

                        }
                        if (al.get(i).getClasse() == 1) {
                            // Magicien
                            (al.get(i).getClassMagicien()).specia();
                            System.out.println("Le Magicien a éviter le combat !!");
                        } else {
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
                            al.get(i).setmort();
                        }
                    } else {
                        quiestu = 1;
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
                        al.get(i).setmort();
                    }
                }

            } else {
                System.out.println("Mort");
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

};