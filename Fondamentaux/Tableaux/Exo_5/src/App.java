/*
 * Écrire un sous-programme qui, à partir de deux tableaux de même taille respective N1 = 150 et N2 = 30,
 * retourne le résultat SOM. Pour calculer SOM,
 * il faut multiplier chaque élément du premier tableau par chaque élément du deuxième tableau,
 * et additionner le tout.
 * 
 *  1 * 1 = 1
 *  1 * 2 = 2
 * 
 *  2 * 1 = 2
 *  2 * 2 = 4
 * 
 *  3 * 1 = 3
 *  3 * 2 = 6
 * 
 *  1 + 2 + 2 + 4 + 3 + 6
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        int [] tab1 = saisieTab(3);
        int [] tab2 = saisieTab(2);

        int som = somTab(tab1, tab2);

        System.out.println("\n " + som + "\n");
    }

    static int [] saisieTab (int taille) {

        int [] tab = new int [taille];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i + 1;
        }

        return tab;
    }

    static int somTab (int [] tab1, int [] tab2) {

        int somTab = 0;

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                somTab += tab1[i] * tab2[j];
            }
        }

        return somTab;
    }
}
