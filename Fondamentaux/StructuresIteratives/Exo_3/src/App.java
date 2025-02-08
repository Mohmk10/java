import java.util.Scanner;

/*
 * Faire un programme qui calcule et affiche la division de a par b par soustractions successives
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("Division par soustractions successives");

        int a = saisie("Entrez un entier a");
        int b = saisie("Entrez un entier b");

        int quotient = divisionParSoustraction(a, b);

        System.out.println("\n" + a + " ÷ " + b +" = " + quotient + "\n");
    }

    static int saisie(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static int divisionParSoustraction(int a, int b) {

        int quotient = 0;

        if (b == 0) {
            System.out.println("b doit être différent de zéro '0' ");
        } else {

            while (a >= b) {
                quotient++;
                a -= b;
            }
        }

        return quotient;
    }
}
