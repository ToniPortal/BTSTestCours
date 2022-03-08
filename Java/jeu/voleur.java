package jeu;

public class voleur extends personnage {

    public void specia() {

        super.setmultiagi((int) 0.15);
        super.setmultiendu((int) 0.15);
        super.setmultiforce((int) 0.15);
        super.setmultiinte((int) 0.15);

        String base = super.getpseudo() +" va être pénaliser de 15% dans toute les caractèristique.Et va prendre la classe ";

        switch (random(1, 4)) {
            case 1:
                base = base + "Magicien";
                magiciens classemag = new magiciens();
                classemag.specia();
                break;
            case 2:
                base = base + "Orgre";
                orgre classeorgre = new orgre();
                classeorgre.specia();
                break;
            case 3:
                base = base + "Nains";
                nains classenains = new nains();
                classenains.specia();
                break;
            case 4:
                base = base + "";
                voleur classVoleur = new voleur();
                classVoleur.specia();
                break;
        }

        System.out.println(base);

    }
}
