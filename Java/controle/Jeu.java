package controle;

public class Jeu extends Ordinateurgamer {

    public String genre = "";
    public String titre = "";
    public int Scoremax = 0;

    public Jeu(String touche, int typedisque, String marque, String genrejeu, String titrejeu, int Scoremaxjeu) {
        super(touche, typedisque, marque);
        // TODO Auto-generated constructor stub

        this.genre = genrejeu;
        this.titre = titrejeu;
        this.Scoremax = Scoremaxjeu;
    }

    public String toString() {

        String message = "Jeu:" + titre + "\nGenre:" + genre + "\nScoremax:" + Scoremax;

        return message;
    }

    public String getGenre() {
        return genre;
    }

    public String getnom(){
        return titre;
    }

}
