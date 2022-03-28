package controle;

import java.util.ArrayList;

public class Ordinateurgamer extends ordinateurportable {

    ArrayList<Jeu> al = new ArrayList<>();

    public Ordinateurgamer(String touche, int typedisque, String marque) {
        super(touche, typedisque, marque);
        // TODO Auto-generated constructor stub

        for (int i = 0; i < 50; i++) {

            Jeu J1 = new Jeu(touche, typedisque, marque, "NomJeu", "RPG", super.random(1, 999));

            al.add(J1);
        }

    }

    public Jeu getLesRPGS() {

        for (int i = 0; i < 50; i++) {
            if(al.get(i).getGenre() == "RPG"){
                return al.get(i);
            }
        }
        
        return null;

    }

    public void afficheMoiLeNomDesRPGS() {

        for (int i = 0; i < 50; i++) {

            if(al.get(i).getGenre() == "RPG"){
                System.out.println((al.get(i)).getnom());
            }

        }

    }

}
