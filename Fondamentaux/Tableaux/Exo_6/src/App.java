import java.util.Scanner;

/*
 * Écrire un programme permettant de saisir, dans un tableau,
 * des nombres compris entre -100 et +100 ensuite calcule et affiche le minimum,
 * le maximum et la moyenne à partir du tableau.
 * 
 * a - le nombre d’élément du tableau est 10
 * b - l’utilisateur donne le nombre de valeur qu’il veut saisir
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        int [] tab;

        /* a */
        // tab = saisieInTab(5);

        /* b */
        int a = saisie("Donnez le nombre de valeur que vous voulez saisir");
        tab = saisieInTab(a);

        afficheTab(tab);

        int min = minTab(tab, 100);
        int max = maxTab(tab, -100);
        int moyenne = moyTab(tab);

        System.out.println("\nLe minimum: " + min);
        System.out.println("\nLe maximum: " + max);
        System.out.println("\nLa moyenne: " + moyenne);
    }

    static int saisie(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static int [] saisieTailleTab (int taille) {

        int [] tab = new int [taille];

        return tab;
    }

    static int [] saisieInTab (int taille) {

        int [] tab = saisieTailleTab(taille);

        for (int i = 0; i < tab.length;) {
            int a = saisie("Entrez un entier");

            if(a > 100 || a < -100) {
                System.out.println("\nSaisissez un entier compris entre -100 et 100");
                continue;
            } else {
                tab [i] = a;
                i++;
            }
        }

        return tab;
    }

    static void afficheTab (int [] tab) {

        System.out.println();

        for (int i = 0; i < tab.length; i++) {
            System.out.print( + tab[i] + " ");
        }

        System.out.println("\n");
    }

    static int somEntierTab (int [] tab) {

        int som = 0;

        for (int i = 0; i < tab.length; i++) {
            som += tab[i];
        }

        return som;
    }

    static int minTab(int [] tab, int max) {

        int min = max;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }

        return min;
    }

    static int maxTab(int [] tab, int min) {

        int max = min;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }

        return max;
    }

    static int moyTab(int [] tab) {

        int a = tab.length;
        int som = somEntierTab(tab);

        int moy = som / a;

        return moy;
    }
}
