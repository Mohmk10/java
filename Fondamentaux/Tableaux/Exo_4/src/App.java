/*
 * Écrire un sous-programme qui, à partir de deux tableaux de même taille N = 250,
 * crée un autre tableau résultant de la somme des deux premiers tableaux.
 */

public class App {
    public static void main(String[] args) throws Exception {


        int [] tab1 = saisieTab(250);
        int [] tab2 = saisieTab(250);

        int [] tab = sommeTab(tab1, tab2);

        afficheTab(tab);
    }

    static void afficheTab (int [] tab) {

        System.out.println();

        for (int i = 0; i < tab.length; i++) {
            System.out.print( + tab[i] + " ");
        }

        System.out.println("\n");
    }

    static int [] saisieTab (int taille) {

        int [] tab = new int [taille];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i + 1;
        }

        return tab;
    }

    static int [] sommeTab (int [] tab1, int [] tab2) {

        int a = tab1.length;
        
        int [] tab = new int [a];

        for (int i = 0; i < tab.length; i++) {

            tab [i] = tab1[i] + tab2[i];
        }

        return tab;
    }
}
