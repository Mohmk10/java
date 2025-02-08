import java.util.Scanner;

/*
 * Faire un programme qui saisit une  année puis indique si l’année est bissextile ou pas.
 * 
 * C1 : l'année est divisible par 4 sans être divisible par 100 (cas des années qui ne sont pas des multiples de 100) ;
 * C2 : l'année est divisible par 400 (cas des années multiples de 100).
 * 
 * >  !> = <=
 * <  !< = >=
 * == != = !=
 * >= = <
 * <= = >
 * !&& = ||
 * !|| = &&
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("\nAnnée bissextile\n");

        int annee = saisie("Entrez une anneée");
        boolean ok =  anneeBissextile(annee);

        if (ok) {
            System.out.println("\n" + annee +  " est une année bissextile\n");
        } else {
            System.out.println("\n" + annee + " n'est pas une année bissextile\n");
        }

    }

    static int saisie (String message) {
        System.out.print("\n " + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static boolean anneeBissextile(int annee) {

        if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
            return true;
       } else {
            return false;
        }
    }
}
