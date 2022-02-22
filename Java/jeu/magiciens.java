package jeu;

public class magiciens extends personnage {

    public magiciens() {

    }

    private int droitspecial = 0;

    public void specia() {
        if (droitspecial == 0) {
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
        } else {
            if (droitspecial == 5) {
                droitspecial = 0;
                specia();
            } else {
                droitspecial++;
            }
        }
    }

    public void tourspecia() {

        this.droitspecial++;

    }

}
