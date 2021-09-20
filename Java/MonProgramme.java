package Java;
public class MonProgramme {

    public static void main(String[] args) {

        int var1 = 25;
        int var2 = 10;

        var1 = var1 - 10;

        int ajout = var1 + var2;

int maxrandom = 50 + 1;

int divmaxrand = maxrandom / 2;

        int random = (int)(Math.random() * maxrandom); 

System.out.println("random;" + random);

        System.out.println("var :" + var1 + "+" + var2);
        System.out.println("Ajout :" + ajout);

        String nom = "pas";
        String prenom = "toto";
        String telephone = "061020304050";
        String adresse = "rue des champs";

        System.out.println(nom + "\n" + prenom + "\n" + telephone + "\n" + adresse + "\n");


if(random >= divmaxrand){

    System.out.println("plus ou égal a " + divmaxrand);

}else {

    System.out.println("en dessoue de " + divmaxrand);

}



    }

}
