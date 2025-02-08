/*
 * Écrire un sous-programme qui permet de faire la fusion de deux tableaux entiers.
 */

public class App {

    public static void main(String[] args) throws Exception {
        int [] tab1 = {21, -19, 3, 44, 35};
        int [] tab2 = {1, -7, 45, 100, -15, 23};

        int [] tab = fusion(tab1, tab2);

        afficheTab(tab);

    }

    static int [] fusion (int [] tab1, int [] tab2) {

        int a = tab1.length + tab2.length;

        int tab [] = new int [a];
        int b = 0;

        for (int i = 0; i < tab1.length; i++) {

            tab[b] = tab1 [i];
            b++;
        }

        for (int i = 0; i < tab2.length; i++) {
            tab[b] = tab2 [i];
            b++;
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
}
