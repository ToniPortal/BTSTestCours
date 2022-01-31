package JavaDebut;

public class testsuplicate {

    public static void main(String[] args) {

        int[] tableau = { 10, 10, 50, 84, 15, 89, 84, 450 };

        int boucle = 1;

        int numberapres = 0;
        int min = 1;
        int max = 100;
        while (tableau[numberapres] == tableau[boucle]) {
            tableau[boucle] = min + (int) (Math.random() * ((max - min) + min));
            numberapres++;
            boucle++;
        }

        for (int boucle1 = 0; boucle1 < 8; boucle1++) {
            System.out.println(tableau[boucle1]);
        }
    }
}
