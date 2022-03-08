package jeu;

public class nains extends personnage {

    public void specia() {

        System.out.println(super.getpseudo() + "a augmenté sont agi et endurance de 100");

        super.setaddagi(100);
        super.setaddendu(100);

    }

}
