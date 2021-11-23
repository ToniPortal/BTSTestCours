
import java.util.*;

public class interrotableau {

public static void main(String[] args){

Scanner MonScanneur = new Scanner(System.in);

System.out.println("Veuillez saisir le 1er prenom");
String prenom1 = MonScanneur.nextLine();
System.out.println("Veuillez saisir le 2ième prenom");
String prenom2 = MonScanneur.nextLine();
System.out.println("Veuillez saisir le 3ième prenom");
String prenom3 = MonScanneur.nextLine();

String[] tableauprenom = {prenom1,prenom2,prenom3};	

System.out.println("Veuillez saisir un numéro pour afficher le prenom correspondant");

int numprenom = MonScanneur.nextInt() - 1;

System.out.println("Voici le prenom associée au numéro sélectionner : " + tableauprenom[numprenom]);

if(tableauprenom[0].equals("TOTO") || tableauprenom[1].equals("TOTO") || tableauprenom[2].equals("TOTO") ) {

System.out.println("TOTO, au tableau !!!");

}

}
}
/*Pendant l'interro :
import java.utils.*;

public class interrotableau {

public static void main(String[] args){

Scanner MonScanneur = new Scanner(System.in);

System.out.println("Veuillez saisir le 1er prenom");
String prenom1 = MonScanneur.NextLine();
System.out.println("Veuillez saisir le 2ième prenom");
String prenom2 = MonScanneur.NextLine();
System.out.println("Veuillez saisir le 3ième prenom");
String prenom3 = MonScanneur.NextLine();

String[] tableauprenom = {prenom1,prenom2,prenom3};	

System.out.println("Veuillez saisir un numéro pour afficher le prenom correspondant");

int numprenom = MonScanneur.NextInt();

System.out.println("Voici le prenom associée au numéro sélectionner : " + tableauprenom[numprenom]);

if(tableauprenom[1].equals("TOTO") || tableauprenom[2].equals("TOTO") || tableauprenom[3].equals("TOTO") ) {

System.out.println("TOTO, au tableau !!!");

}

}
}
*/