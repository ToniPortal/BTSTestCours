package zoo;

public class monZoo {

    public static void main(String[] args) {

        chien c1 = new chien(1, "carnivore");
        chien c2 = new chien(0, "herbivore");
        c1.dodochien();
        c1.crier();
        c1.manger();

        System.out.println(c1.deplace(1));

        c1.mangerchien(c2);
        

    }

}
