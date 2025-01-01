import java.util.Scanner;

/*
 * Faire un programme qui saisit une  année puis indique si l’année est bissextile ou pas.
 * 
 * C1 : l'année est divisible par 4 sans être divisible par 100 (cas des années qui ne sont pas des multiples de 100) ;
 * C2 : l'année est divisible par 400 (cas des années multiples de 100).
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sn = new Scanner(System.in);

        System.out.println("\nAnnée bissextile\n");

        System.out.print("Entrez une anneée: ");
        int annee = sn.nextInt();

        if (annee % 4 == 0) {
            if (annee % 100 != 0) {
                System.out.println("\n" + annee + " est une année bissextile\n");
            } else 
                if(annee % 400 == 0) {
                    System.out.println("\n" + annee + " est une année bissextile\n");
                } else
                    System.out.println("\n" + annee + " n'est pas une année bissextile\n");
        } else
            System.out.println("\n" + annee + " n'est pas une année bissextile\n");

        sn.close();
    }
}
