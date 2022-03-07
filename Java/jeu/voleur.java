package jeu;

public class voleur extends personnage {

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
                voleur classearabe = new voleur();
                classearabe.specia();
                break;
        }

    }
}
