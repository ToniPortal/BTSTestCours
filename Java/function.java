public class function {
    public static void main(String[] args) {

        int[] tabs = { 10, 4, 89, 51, 78, 15, 68, 40, 9, 10 };

        int lasomme = somme(tabs);
        System.out.println(lasomme);
    }

    public static int somme(int[] tab) {

        int chiffretotal = 0;
        int boucle = 0;
        while (boucle < tab.length) {

            chiffretotal = maFonctionAddition(tab[boucle], chiffretotal);
            boucle++;

        }

        return chiffretotal;

    }



    // Procedure Addition
    public static void maProcedureAddition(int unEntier, int unDeuxiemeEntier) {
        System.out.println(unEntier + unDeuxiemeEntier);
    }

    // Procedure Surcharge Addition
    public static void maProcedureAddition(int unEntier, int unDeuxiemeEntier, int unTroisiemeEntier) {
        System.out.println(unEntier + unDeuxiemeEntier + unTroisiemeEntier);
    }

    public static int maFonctionAddition(int unEntier, int unDeuxiemeEntier) {

        return (unEntier + unDeuxiemeEntier);

    }

    // surcharge de méthodes
    public static int maFonctionAddition(int unEntier, int unDeuxiemeEntier, int unTroisiemeEntier) {
        return (unEntier + unDeuxiemeEntier + unTroisiemeEntier);
    }

    public static void maProcedureSoustraction(int unEntier, int unDeuxiemeEntier) {
        System.out.println(unEntier - unDeuxiemeEntier);
    }

    // Procedure Surcharge Addition
    public static void maProcedureSoustraction(int unEntier, int unDeuxiemeEntier, int unTroisiemeEntier) {
        System.out.println(unEntier - unDeuxiemeEntier - unTroisiemeEntier);
    }

    public static int maFonctionSoustraction(int unEntier, int unDeuxiemeEntier) {
        return (unEntier - unDeuxiemeEntier);
    }

    // surcharge de function Soustraction
    public static int maFonctionSoustraction(int unEntier, int unDeuxiemeEntier, int unTroisiemeEntier) {
        return (unEntier - unDeuxiemeEntier - unTroisiemeEntier);
    }

}
