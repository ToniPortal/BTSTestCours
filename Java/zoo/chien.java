package zoo;

public class chien {

    String unNom;

    String uneTaille;

    int unPoids;

    String uneCouleur;

    int positionX;
    int positionY;

    String systemeDigestif;

    int min = 0;
    int max = 50;

    public String getCrie() {
        if (this.unPoids == 0) {
            return "Votre chien n'aboyera pas...\nIl est mort...";
        } else {
            return "Waffff";
        }
    }

    public String getSystemeDigestif() {

        return this.systemeDigestif;

    }

    public static int random(int min, int max) {

        int random = min + (int) (Math.random() * ((max - min) + min));
        return random;
    }

    public void crier() {
        System.out.println(getCrie());
    }

    public int deplace(int positionX) {
        if (random(1, 2) == 1) {
            // avance
            this.positionX = positionX = random(1, 500);
        } else {
            // recule
            this.positionX = positionX = random(-500, -1);
        }

        return this.positionX;

    }

    public int getPoids() {
        return this.unPoids;
    }

    public void setPoids(int unPoids) {

        this.unPoids = unPoids;

    }

    public void manger() {
        if (this.unPoids != 0) {
            System.out.println("il pèse " + this.unPoids + "KG");
            System.out.println("Miam miam je mange");

            this.setPoids(this.unPoids + 1);
            System.out.println("il pèse après avoir mangé " + this.unPoids + "KG");
        }else {
            System.out.println("Votre chien est mort,il ne mangera plus jamais...");
        }


    }

    public void mangerchien(chien lautrechien) {

        if (getSystemeDigestif() == "carnivore") {

            if (this.getPoids() > lautrechien.getPoids()) {
                System.out.println("mange le chien");
                setPoids(this.unPoids + lautrechien.getPoids());
                lautrechien.unPoids = 0;
            } else {
                System.out.println("Il ne mange pas le chien");
            }

        } else if (getSystemeDigestif() == "herbivore") {
            System.out.println("Le chien ne peut pas manger vu que il est herbivore");
        } else if (getSystemeDigestif() == "mort") {
            System.out.println("Votre chien est mort...");
        } else {
            System.out.println("Votre chien n'a pas de système digestif.");
        }

    }

    public void dodochien() {

        this.setPoids(this.unPoids / 2);
        System.out.println(this.unPoids);

        if (this.unPoids <= 0.5) {
            this.setPoids(0);
        }
        if (this.unPoids == 0) {

            System.out.println("Votre chien est mort.");
            this.systemeDigestif = "mort";
        }

    }

    public chien(int unPoids, String systemeDigestif) {

        this.unPoids = unPoids;
        this.systemeDigestif = systemeDigestif;

    }

}
