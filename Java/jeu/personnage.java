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
            "Vodka", "Wanek", "Waterloo", "Wishy", "Wolf", "Xenon", "Yan", "Yang", "Yannick", "Ying", "Yoga", "Youki",
            "Zebra", "Zébulon", "Zen", "Zéphyr", "Zeus", "Zone", "Zorro" };

    private String pseudo;

    public String classe;

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
                this.classe = "magiciens";
                magiciens M1 = new magiciens();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;

        }
    }

    private String message;

    public String toString() {

        this.message = this.message + "\nPseudo: " + getpseudo() + "\nposX: " + getposX() + "\nposY: " + getposY()
                + "\nForce: " + getforce() + "\nEndu: " + getendu() + "\nAgi: " + getagi() + "\nInt: " + getinte() + "\n";

        return this.message;

    }

  
    String direction = "NULL";
    
    public void tour() {

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

        toString();

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

    private int getforce() {
        return this.force;
    }

    public void setaddforce(int i) {
        this.force = this.force + i;
    }

    private void endu() {
        this.endu = random(0, 99);
    }

    private int getendu() {
        return this.endu;
    }

    public void setaddendu(int i) {
        this.endu = this.endu + i;
    }

    private void agi() {
        this.agi = random(0, 99);
    }

    private int getagi() {
        return this.agi;
    }

    public void setaddagi(int i) {
        this.agi = this.agi + i;
    }

    private void inte() {
        this.inte = random(0, 99);
    }

    private int getinte() {
        return this.inte;
    }

    public void setaddinte(int i) {
        this.inte = this.inte + i;
    }

    public void setposaddX(int i) {

        if ((this.posX = posX + i) > 100) {
            this.posX = 0;
            System.out.println("remit a 0");
        } else {
            this.posX = posX + i;
        }
    }

    public void setposmoinX(int i) {
        if ((this.posX = posX - i) < 0) {
            this.posX = 100;
            System.out.println("remit a 100");
        } else {
            this.posX = posX - i;
        }
    }

    public void setposaddY(int i) {
        if ((this.posY = posY + i) > 100) {
            this.posY = 0;
            System.out.println("remit a 0");
        } else {
            this.posY = posY + i;
        }
    }

    public void setposmoinY(int i) {
        if ((this.posY = posY - i) < 0) {
            this.posY = 100;
            System.out.println("remit a 100");
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
