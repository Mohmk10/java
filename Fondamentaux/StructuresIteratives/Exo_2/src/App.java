import java.util.Scanner;

/*
 * Ecrire un algorithme qui demande un nombre de départ, et qui calcule la somme des entiers jusqu'à ce nombre.
 * Par exemple, si l'on tape 4 , l’algorithme doit calculer: 1 + 2 + 3 + 4 = 10
 * Réécrire l'algorithme qui calcule cette fois la moyenne !
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        int entier = saisie("Entrez un entier");
        sommeEntiers(entier);
    }

    static int saisie(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static void sommeEntiers(int entier) {

        int a = 0;
        int nombre = 0;

        for (int i = 1; i <= entier; i++) {
            a += i;
            nombre++;
        }

        int moyenne = a / nombre;

        System.out.println("\nLa somme des entiers de 1 à " + entier + " est: " + a + "\n");
        System.out.println("La moyenne est: " + moyenne + "\n");
    }
}
