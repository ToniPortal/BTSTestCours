package controle;

public class clavier extends ordinateur{



public clavier(String touche, int typedisque, String marque) {
        super(touche, typedisque, marque);
        //TODO Auto-generated constructor stub
    }

public String gettouche(int valclavier){
    String touche = null;
    switch(valclavier){
        case 1:
        touche = "normale";
        break;
        case 2:
        touche = "Majuscule";
        break;
        case 3:
        touche = "ALTGR";
        break;
    }
    return touche;
}
    
}
