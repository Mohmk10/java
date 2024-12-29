import java.util.Scanner;

/*
 * Ecrire un algorithme qui demande un nombre de départ, et qui calcule la somme des entiers jusqu'à ce nombre.
 * Par exemple, si l'on tape 4 , l’algorithme doit calculer: 1 + 2 + 3 + 4 = 10
 * Réécrire l'algorithme qui calcule cette fois la moyenne !
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sn =new Scanner(System.in);

        System.out.print("\nEntrez un entier: ");
        int entier = sn.nextInt();

        int a = 0;
        int nombre = 0;

        for (int i = 1; i <= entier; i++) {
            a += i;
            nombre++;
        }

        int moyenne = a / nombre;

        System.out.println("\nLa somme des entiers de 1 à " + entier + " est: " + a + "\n");
        System.out.println("La moyenne est: " + moyenne + "\n");

        sn.close();
    }
}
