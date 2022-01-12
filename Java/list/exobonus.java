package list;
import java.util.ArrayList;
import java.util.Collections;

public class exobonus {
    public static void main(String[] args) {

        ArrayList<String> language = new ArrayList<String>() {
            {

                add("Français");
                add("Allemand");
                add("Englais");
                add("Espagnol");
            }
        };

        ArrayList<String> listmoitier = new ArrayList<String>();

//moitier de la liste
        listmoitier.addAll(language.subList(0, language.size() / 2));

//Suppresion de la 1ière liste
language.removeAll(language);

Collections.sort(listmoitier, Collections.reverseOrder());

System.out.println(listmoitier);
    }


}