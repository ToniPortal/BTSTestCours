public class Voiture {

    private String couleur;
    private String marque;
    private int longeur;
    private int largeur;
    private int nbPorte;
    private int puissance;
    private int vitesseMax;

    public String getCouleur() {
        return this.couleur;
    }

    public int getLargeur() {
        return this.largeur;
    }

    public int getLongeur() {
        return this.longeur;
    }

    public String getMarque() {
        return this.marque;
    }

    public int getNbPorte() {
        return this.nbPorte;
    }

    public int getPuissance() {
        return this.puissance;
    }

    public int getVitesseMax() {
        return this.vitesseMax;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    };

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    };

    public void voiture(String couleur, int largeur, int longeur, int puissance, int nbPorte) {
        if (couleur.equals("WHITE") || couleur.equals("YELLOW")) {
            this.couleur = couleur;
        } else {
            this.couleur = "BLACK";
        }
        if (this.puissance <= 50) {
            this.puissance = puissance;
        } else {
            this.puissance = 50;
        }

        this.largeur = 101;
        this.longeur = 200;
        this.nbPorte = 4;

    }




    

}