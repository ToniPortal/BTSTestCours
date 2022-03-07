package jeu;

public class magiciens extends personnage {

    public void specia() {

        System.out.println(super.getpseudo() + " est un magicien et quitte le combat");


        switch (random(1, 4)) {
            case 1:
                super.setposaddX(random(1, 99));
                break;
            case 2:
                super.setposmoinX(random(1, 99));
                break;
            case 3:
                super.setposaddY(random(1, 99));
                break;
            case 4:
                super.setposmoinY(random(1, 99));
                break;
        }

    }

}
