/*
 * Soit T un tableau qui contient n valeurs réelles triés dans l’ordre croissant. Ecrire une procédure 
 * qui prend comme paramètre le Tableau T, l’entier n (la taille de T) et un nombre réel x,
 * et elle effectue l’insertion de x dans le tableau T, de telle manière que le tableau T reste trié. 
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        double [] tab = new double[0];
        saisieProcTab(tab, 9, 7.5);
    }

    static void saisieProcTab (double [] tab, int taille, double reel) {

        tab = new double [taille];

        for (int i = 0; i < tab.length - 1; i++) {
            tab[i] = i + 1 * 2;
        }

        

        afficheTab(tab);
    }

    static void afficheTab (double [] tab) {

        System.out.println();

        for (int i = 0; i < tab.length; i++) {
            System.out.print( + tab[i] + " ");
        }

        System.out.println("\n");
    }
}
