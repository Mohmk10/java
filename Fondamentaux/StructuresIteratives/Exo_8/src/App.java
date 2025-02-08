import java.util.Scanner;

/*
 * Écrire un algorithme mettant en œuvre le jeu suivant entre deux joueurs :
 * Le premier utilisateur saisit un entier que le second doit deviner.
 * Pour cela, il a le droit à autant de tentatives qu'il le souhaite.
 * A chaque échec, le programme lui indique si l'entier est plus grand ou plus petit que sa proposition.
 * Un score est affiché lorsque l'entier est trouvé.
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.print("\nDévinette\n");

        int nombre = saisie("Entrez un entier (1er user)");

        System.out.println("\nDévinnez l'entier entré par le 1er user");

        int a = devinette(nombre);

        System.out.println("\nFélicitaions !");

        if (a < 5) {
            System.out.println("\nExcellent avec moins de 5 éssais\n");
        } else {
            System.out.println("\nPassable\n");
        }
    }

    static int saisie(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static int devinette(int nombre) {

        int nombreA;
        int a = 0;

        do {
            
            System.out.print("\nEntrez un entier (2nd user): ");
            nombreA = sn.nextInt();

            if (nombreA < nombre) {
                System.out.println("\nPlus grand");
            } else {
                if (nombreA > nombre) {
                    System.out.println("\nPlus pétit");
                }
            }

            a++;

        } while (nombre != nombreA);

        return a;
    }
}
