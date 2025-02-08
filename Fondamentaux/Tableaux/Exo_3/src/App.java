/*
 * Écrire un sous-programme qui permet d’inverser un tableau entier.
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        int [] tab1 = {-19, 16, 9, -1, 3};

        int [] tab = inverseTab(tab1);

        afficheTab(tab);
    }

    static int [] inverseTab (int [] tab) {

        int a = tab.length;

        int [] t = new int [a];

        for (int i = 0; i < t.length; i++) {
            t [i] = tab [a-1];
            a--;
        }

        return t;
    }

    static void afficheTab (int [] tab) {

        System.out.println();

        for (int i = 0; i < tab.length; i++) {
            System.out.print( + tab[i] + " ");
        }

        System.out.println("\n");
    }
}
