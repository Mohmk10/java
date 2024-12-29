import java.util.Scanner;

/*
 * Écrire un algorithme qui lit deux valeurs entières ( A et B ) puis les affichent dans l’ordre croissant et décroissant
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);


        System.out.print("\nEntrez un entier A: ");
        int entierA = scn.nextInt();

        System.out.print("\nEntrez un entier B: ");
        int entierB = scn.nextInt();

        

        if (entierA < entierB) {
            System.out.println("\nOrdre croissant\n");
            System.out.println(entierA + "\n" + entierB );
            System.out.println("\nOrdre décroissant\n");
            System.out.println(entierB + "\n" + entierA + "\n");
        } else {
            if (entierA > entierB) {
                System.out.println("\nOrdre croissant\n");
                System.out.println(entierB + "\n" + entierA );
                System.out.println("\nOrdre décroissant\n");
                System.out.println(entierA + "\n" + entierB + "\n");
            } else 
                System.out.println("\nCes deux entiers sont égaux\n");
            
        } 

        scn.close();
    }
}
