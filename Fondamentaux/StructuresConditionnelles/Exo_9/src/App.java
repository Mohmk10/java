import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * Écrire un algorithme qui lit trois valeurs entières ( A, B et C) puis les affichent dans l’ordre croissant et décroissant.
 */

 public class App {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);


        System.out.print("\nEntrez un entier A: ");
        int entierA = scn.nextInt();

        System.out.print("\nEntrez un entier B: ");
        int entierB = scn.nextInt();

        System.out.print("\nEntrez un entier C: ");
        int entierC = scn.nextInt();

        System.out.print("\nEntrez un entier D: ");
        int entierD = scn.nextInt();

        int [] entier = {entierA, entierB, entierC, entierD};

        Arrays.sort(entier);

        System.out.println("\nOrder croissant: ");

        for (int i = 0; i < entier.length; i++) {
            System.out.println("\n" + entier[i]);
        }

        System.out.println("\nOrder croissant: ");
        System.out.println("\n" + entier [3] + "\n" +
                           "\n" + entier [2] + "\n" +
                           "\n" + entier [1] + "\n" +
                           "\n" + entier [0] + "\n" +
                           "\n"
        );
        
        scn.close();
    } 

}

