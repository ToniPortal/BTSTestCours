package jeu;

public class orgre extends personnage {

    public void specia() {

        System.out.println(super.getpseudo() + " a augmenter de 20 ça force");

            super.setaddforce(20);
    }

}
