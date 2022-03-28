package controle;

public class disquedur extends ordinateur {



    public disquedur(String touche, int typedisque, String marque) {
        super(touche, typedisque, marque);

        super.setdisque(type(typedisque));
    }

    private String type(int typedisque) {
        String type = "";
        switch(typedisque){
            case 1:
            type = "SSD";
            break;
            case 2:
            type = "HDD";
            break;
        }
        return type;
    }


    
}
