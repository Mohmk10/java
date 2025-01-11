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

        divisionParSoustraction(a, b);
    }

    static int saisie(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static void divisionParSoustraction(int a, int b) {

        if (b == 0) {
            System.out.println("b doit être différent de zéro '0' ");
        } else {

            int qutient = 0;
            int reste = 0;
            int z = a;

            while (z >= b) {
                reste = z - b;
                qutient++;
                z -= b;
            }

            System.out.println("\n" + a + " ÷ " + b +" = " + qutient + " avec un reste de "+ reste + "\n");
        }
    }
}
