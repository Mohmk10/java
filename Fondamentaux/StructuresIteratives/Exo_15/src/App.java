import java.util.Scanner;

/*
 * Écrire un programme qui permet de saisir un entier positif N, le programme affiche les n premiers nombre premiers
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("\nAffiche les n premiers nombres premiers");

        int entier = saisie("Entrez un entier");

        nombreDeNombrePremier(entier);
    }

    static int saisie(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static int nombrePremier(int entier) {

        int premier = 0;

        for (int i = 1; i < entier; i++) {
            if (entier % i == 0 && i != 1) {
                premier++;
            }
        }

        if (premier == 0) {
            return premier;
        } else
            return premier;
    }

    static void nombreDeNombrePremier(int entier) {
        int a = 0;
        int b = 1;

        System.out.println("\nLes " + entier + " premier(s) nombre(s) premier: \n");

        do {

            int premier = nombrePremier(b);

            if (premier == 0 && b != 1) {
                a++;
                System.out.print(b + "\t");
            }
            b++;
        } while (entier != a);

        System.out.println("\n");
    }
}
