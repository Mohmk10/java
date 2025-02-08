import java.util.Scanner;

/*
 * Faire un programme qui calcule le PGCD de deux nombres saisis au clavier en utilisant l'astuce suivante:
 * soustrait le plus petit des deux entiers du plus grand jusqu'à ce qu'ils soient égaux.
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("\nCalcul de PGCD de deux entiers");

        int a = saisie("Entrez un entier a");
        int b = saisie("Entrez un entier b");

        int pgcd = calculPgcd(a, b);

        System.out.println("\nLe PGCD de " + a + " et " + b + " est: " + pgcd + "\n");
    }

    static int saisie(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static int calculPgcd (int a, int b) {
        int pgcd = 0;

        if (a < 0) {
            System.out.println("\na doit être supérieur à zero '0' \n");
        } else {
            if (b < 0) {
                System.out.println("\nb doit être supérieur à zero '0' \n");
            } else {
                pgcd = a;
                int y = b;
                int reste;

                while (y != 0) {
                    reste = pgcd % y;
                    pgcd = y;
                    y = reste;
                }
            }
        }

        return pgcd;
    }
}
