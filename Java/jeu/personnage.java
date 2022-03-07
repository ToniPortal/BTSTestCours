package jeu;

public class personnage {

    String[] nom = { "Adam", "Agent 007", "Albatros", "Alex", "Alpha", "Anonymous", "Apache", "Argan", "Arve", "Aslan",
            "Atlas", "Avatar", "Azkaban", "Babar", "Baloo", "Barlog", "Baron", "Beta", "BlueMoon", "Bob", "Bonus",
            "Boss", "Boulet", "Brisinger", "Calypso", "Chaos", "ChatNoire", "Chrome", "Comik", "Corolian", "Cortex",
            "Dany", "Dave", "Demo", "Derby", "Dereck", "Désir", "Devin", "Diabolo", "Dorgan", "Doug", "Dragon",
            "Duncan", "Fangbone", "Fantome", "Farten", "Felix", "Fidji", "Film", "Flam", "Foot", "Ford", "Fox",
            "Franck", "Gamer", "Gamesh", "Gauvin", "Gilou", "Goblin", "Golden", "Gondor", "Grimm", "Guépard", "Guess",
            "Gut", "Harry", "Hello", "Heron", "Hiro", "Hiver", "Horus", "Icare", "Idefix", "Igor", "Indigo", "Ironik",
            "IronMan", "Jedi", "JediLucas", "Jerk", "Jeronimo", "Jetix", "Jockey", "Joe", "Johan", "John", "Joker",
            "Kamelott", "Kent", "Kid", "Kikou", "Kiwi", "Korigan", "Lagoon", "Lapin", "Léo", "Livio", "Logan", "Loran",
            "Lotus", "Louis", "Loup", "Luc", "Luxe", "Lyon", "Magic", "Marin", "Maroon", "Mars", "Menfin", "MicMac",
            "Mikado", "Minet", "Money", "Moon", "Morgan", "Mozart", "Nathan", "Nécropolis", "Némo", "Néo", "Nexus",
            "Nibiru", "Nikos", "Nogames", "Non", "Odin", "Oméga", "Opium", "Optimus", "Orion", "Orpheo", "Osiris",
            "Oxygen", "Pacha", "Panda", "Papyrus", "Persépolis", "Picasso", "Potter", "Pouf", "Prince", "Prof",
            "Quadran", "Quatre", "Ralf", "Riri", "Roar", "Robot", "Rock", "Rolex", "Roméo", "Saxo", "Sentinel", "Seven",
            "Silver", "Skip", "Snoopy", "Soleil", "Spock", "Sushi", "Syrius", "Tails", "Taxi", "Teckel", "Teken",
            "Tictac", "Titeuf", "Tom", "Topia", "Twix", "Ulys", "Uranus", "Uther", "Vans", "Vent", "Vicking", "Vinci",
            "Vodka", "Wanek", "Waterloo", "Wishy", "Wolf", "Xenon", "Yan", "Yang", "Yannick", "Ying", "Yoga", "Yuki",
            "Zebra", "Zébulon", "Zen", "Zéphyr", "Zeus", "Zone", "Zorro" };

            


    private String pseudo;

    private magiciens classMagicien;

    public magiciens getClassMagicien() {

        return classMagicien;

    }

    private orgre classOrgre;

    public orgre getClassOrgre() {
        return classOrgre;
    }

    private nains classNains;

    public nains getClassNains() {
        return classNains;
    }

    private voleur classarabe;

    public voleur getClassVoleur() {
        return classarabe;
    }

    public int quelclass;

    public int getClasse() {
        return quelclass;
    }

    public boolean getvivantoupas() {
        return this.estvivant;
    }

    private boolean estvivant = true;

    public void setmort() {
        this.estvivant = false;
    }



    public personnage() {

        nomtableaurandom();
        posX();
        posY();
        force();
        endu();
        agi();
        inte();

        switch (random(1, 4)) {
            case 1:
                this.quelclass = 1;
                magiciens M1 = new magiciens();
                this.classMagicien = M1;
                break;
            case 2:
                this.quelclass = 2;
                orgre O1 = new orgre();
                this.classOrgre = O1;
                break;
            case 3:
                this.quelclass = 3;
                nains N1 = new nains();
                this.classNains = N1;
                break;
            case 4:
  
            this.quelclass = 4;
                break;

        }

    }

    private String message;

    public String toString() {

        this.message = "\nPseudo: " + getpseudo() + "\nposX: " + getposX() + " posY: " + getposY()
                + "\nForce: " + getforce() + " Endu: " + getendu() + " Agi: " + getagi() + " Int: " + getinte() + "\n";

        return this.message;

    }

    String direction = "NULL";

    public void deplacement() {

        int choixdirect = random(1, 4);

        switch (choixdirect) {

            case 1:
                direction = "Nord";
                setposaddY(random(1, 10));
                break;
            case 2:
                direction = "Sud";
                setposmoinY(random(1, 10));
                break;
            case 3:
                direction = "Est";
                setposaddX(random(1, 10));
                break;
            case 4:
                direction = "Ouest";
                setposmoinX(random(1, 10));
                break;
            default:
                direction = "NULL";
                break;

        }

    }

    private int posX;
    private int posY;
    private int force;
    private int endu;
    private int agi;
    private int inte;

    private int toutestat;

    public int toutestat() {

        toutestat = this.force + this.endu + this.agi + this.inte;
        return toutestat;

    }

    public int cordocombat() {

        return this.force + this.inte + (this.agi / 2) + (this.endu / 4) + random(0, 30);

    }

    private void posX() {
        this.posX = random(0, 100);
    }

    public int getposX() {

        return this.posX;

    }

    public int getposY() {

        return this.posY;

    }

    private void posY() {
        this.posY = random(0, 100);
    }

    private void force() {
        this.force = random(0, 99);
    }

    public int getforce() {
        return this.force;
    }

    public void setaddforce(int i) {
        this.force = this.force + i;
    }

    public void setmultiforce(int i) {
        this.force = this.force * i;
    }

    private void endu() {
        this.endu = random(0, 99);
    }

    public int getendu() {
        return this.endu;
    }

    public void setaddendu(int i) {
        this.endu = this.endu + i;
    }

    public void setmultiendu(int i) {
        this.endu = this.endu * i;
    }

    private void agi() {
        this.agi = random(0, 99);
    }

    public int getagi() {
        return this.agi;
    }

    public void setaddagi(int i) {
        this.agi = this.agi + i;
    }

    public void setmultiagi(int i) {
        this.agi = this.agi * i;
    }

    private void inte() {
        this.inte = random(0, 99);
    }

    public int getinte() {
        return this.inte;
    }

    public void setaddinte(int i) {
        this.inte = this.inte + i;
    }

    public void setmultiinte(int i) {
        this.inte = this.inte * i;
    }

    public void setposaddX(int i) {

        if ((this.posX = posX + i) > 100) {
            this.posX = 0;

        } else {
            this.posX = posX + i;
        }
    }

    public void setposmoinX(int i) {
        if ((this.posX = posX - i) < 0) {
            this.posX = 100;

        } else {
            this.posX = posX - i;
        }
    }

    public void setposaddY(int i) {
        if ((this.posY = posY + i) > 100) {
            this.posY = 0;

        } else {
            this.posY = posY + i;
        }
    }

    public void setposmoinY(int i) {
        if ((this.posY = posY - i) < 0) {
            this.posY = 100;

        } else {
            this.posY = posY - i;
        }
    }

    private int randomtableau() {
        int min = 0;
        int max = nom.length;
        return min + (int) (Math.random() * ((max - min) + min));
    }

    private String nomtableaurandom() {
        this.pseudo = nom[randomtableau()];
        this.pseudo = pseudo + random(0, 9999);
        return this.pseudo;
    }

    public String getpseudo() {
        return this.pseudo;
    }

    public int random(int min, int max) {
        return (min + (int) (Math.random() * ((max - min) + min)));
    }

}
