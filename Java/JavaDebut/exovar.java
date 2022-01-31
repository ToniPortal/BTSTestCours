package JavaDebut;

public class exovar {

    public static void main(String[] args) {

//Exercice 1

int ageboite = -1;

if(ageboite >= 18 || ageboite >= 0){

System.out.println("Vous pouvez renter dans la boîte");

} else {

    System.out.println("Vous n'avez pas l'âge requis pour rentrer dans la boîte");

}


// Exercice 2

int menumcdo = 1;

System.out.println("Vous avez choisi le menu : " + menumcdo);

switch (menumcdo){
case 1 :
System.out.println("Menu big mac n°"+ menumcdo);
break;

case 2 :
System.out.println("Menu n°"+ menumcdo);
break;

case 3 :
System.out.println("Menu n°"+ menumcdo);
break;

case 4 :
System.out.println("Menu n°"+ menumcdo);
break;

case 5 :
System.out.println("Menu n°"+ menumcdo);
break;

case 6 :
System.out.println("Menu n°"+ menumcdo);
break;

case 7 :
System.out.println("Menu n°"+ menumcdo);
break;

case 8 :
System.out.println("Menu n°"+ menumcdo);
break;

case 9 :
System.out.println("Menu n°"+ menumcdo);
break;

case 10 :
System.out.println("Menu n°"+ menumcdo);
break;

default:
System.out.println("aucun menu n'est disponible avec le numéro choisi");
break;

}

//Exercice 3

String nomprenom = "Paul Belmondo";
int age = 88;
int cb = 1234;

if((nomprenom == "Paul Belmondo" && age == 88) || cb == 1234 ){

System.out.println("Vous êtes le bon utulisateur");

} else {

    System.out.println("Vous n'êtes pas le bon utulisateur");

}


    }
}
