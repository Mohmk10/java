import java.util.Scanner;

/*
 * Faire un programme qui calcule et affiche le PPCM de deux entiers saisis au clavier.
 * 
 * PPCM(a,b) = a × b / PGCD(a,b)
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("\nCalcul du PPCM de deux entiers");

        int a = saisie("Entrez un entier a");
        int b = saisie("Entrez un entier b");

        int ppcm = calculPpmc(a, b);

        System.out.println("\nLe PPCM de " + a + " et " + b + " est: " + ppcm + "\n");
    }

    static int saisie(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static int calculPpmc (int a, int b) {

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

        int ppcm = a * b / pgcd;

        return ppcm;
    }
}
