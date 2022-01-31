package ZooGame;

import java.util.ArrayList;

public class animal {

    private String nom;
    private int poids;

    public animal() {

        this.nom = getnomZoo();
        this.poids = random(1,300);

    }

    private int randomtableau() {
        int min = 0;
        int max = listanimaux.size();
        return min + (int) (Math.random() * ((max - min) + min));
    }

    public int random(int min, int max){
        return min + (int) (Math.random() * ((max - min) + min));
    }

    ArrayList<String> listanimaux = new ArrayList<String>() {
        {
            add("Allemand");
            add("Français");
            add("Englais");
        }
    };


    public String getnomZoo() {
        return listanimaux.get(randomtableau());
    }

    public String getNom() {
        return this.nom;
    }

    public int getPoids() {
        return this.poids;
    }



}
