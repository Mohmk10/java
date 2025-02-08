/*
 * Écrire un sous-programme qui, à partir d’un tableau d’entier,
 * retourne VRAI si les éléments du tableau sont consécutifs sinon FAUX. 
 */

public class App {

    public static void main(String[] args) throws Exception {

        int [] tab = {1, 2, 3, 4, 8, 6, 7};

        int cons = consecutifs(tab);

        if (cons == 0) {
            System.out.println("\nCe tableau est conécutif\n");
        } else {
            System.out.println("\nCe tableau n'est pas conécutif\n");
        }
    }

    static int consecutifs(int tab []) {
        int b = 0;
        for (int index = 0; index < tab.length - 1; index++) {

            if (tab[index + 1] - tab[index] == 1) {
                b = 0;
            } else {
                b = 1;
                break;
            }
        }
        return b;
    }
}
