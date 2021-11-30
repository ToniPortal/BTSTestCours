import java.util.ArrayList;

public class listexo8 {
    public static void main(String[] args) {

        ArrayList<String> language = new ArrayList<String>() {
            {
                add("Allemand");
                add("Français");
                add("Englais");
            }
        };

        afficherliste(language);
    }

    public static void afficherliste(ArrayList<String> language) {
        for (int i = 0; i < language.size(); i++) {

            String listelanguage = language.get(i);

            if (listelanguage.indexOf("A") == -1) {
                System.out.println("Ne contient pas de A");
            } else {
                System.out.println("Contient A");
            }
        }
    }
}
