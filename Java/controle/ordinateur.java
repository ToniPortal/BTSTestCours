package controle;

public class ordinateur {

    protected static int random(int min, int max) {
        return (min + (int) (Math.random() * ((max - min) + min)));
    }


    public String touche;
    public String truetypedisque;
    public String marque;

 
    
    public ordinateur(String touche, int typedisque,String marque) {

        this.touche = touche;
        this.marque = marque;

       // disquedur disquedur = new disquedur(marque, typedisque, marque);

    }

    public String toString(){

        String message = "Touche:" + touche + "Typedisque" + truetypedisque;

        return message;
    }

    public void setdisque(String disque){

        disque = this.truetypedisque;

    }
    
}