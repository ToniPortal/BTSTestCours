package jeu;

public class arabe extends personnage {

    public void specia() {

        switch (random(1, 4)) {
            case 1:
                magiciens classemag = new magiciens();
                classemag.specia();
                break;
            case 2:
                orgre classeorgre = new orgre();
                classeorgre.specia();
                break;
            case 3:
                nains classenains = new nains();
                classenains.specia();
                break;
            case 4:
                arabe classearabe = new arabe();
                classearabe.specia();
                break;
        }

    }
}
