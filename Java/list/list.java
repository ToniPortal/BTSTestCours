package list;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {

        ArrayList<String> language = new ArrayList<String>() {
            {
                add("Français");
                add("Englais");
                add("Allemand");
            }
        };

        language.add(0, "Pascal");

        afficherliste(language);

        System.out.println(language.get(2));

        language.set(2, "COBOL");
    }

    // Procedure Addition
    public static void afficherliste(ArrayList<String> language) {
        for (int i = 0; i < language.size(); i++) {
            System.out.println(language.get(i));
        }
    }

    public int indexOf(String string) {
        return 0;
    }
}
