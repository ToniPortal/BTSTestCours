package controle;

public class ecran extends ordinateur {
    
    public ecran(String touche, int typedisque, String marque) {
        super(touche, typedisque, marque);
    }

private String resolution = "1920x1080";

public String getresolution(){
    return resolution;
} 


}
