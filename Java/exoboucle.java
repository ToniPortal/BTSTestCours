package Java;

import java.util.*;

public class exoboucle {

    public static void main(String[] args) {

        Scanner monScanner = new Scanner(System.in);

        int age = monScanner.nextInt();

int arrive = 0;

int agemax = 100;

        while (age < agemax) { // condition
            age++;
            arrive++;
        }

        if(age > agemax){

            System.out.println("Vous êtes au dessue de l'âge max");

        } else if(age <= agemax) {

        System.out.println("Il vous manque " + arrive + " ans pour arriver a :" + agemax + "ans");

        }
        

    }

}
