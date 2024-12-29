import java.util.Scanner;

/*
 * Un nombre est parfait s’il est égal à la somme de ses diviseurs stricts (différents de lui-même).
 * Ainsi par exemple, l’entier 6 est parfait car 6 = 1 + 2 + 3.
 * Écrire un algorithme permettant de déterminer si un entier naturel est un nombre parfait.
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sn = new Scanner(System.in);

        System.out.print("\nEntrez un entier: ");
        int entier = sn.nextInt();

        int a = 0;

        for(int i = 1; i < entier; i++) {
            if (entier % i == 0) {
                a+= i;
            }
        }
        
        if (a == entier)
            System.out.println("\n" + entier + " est un entier parfait\n");
        else
            System.out.println("\nCet entier n'est pas parfait\n");
        
        sn.close();
    }
}
