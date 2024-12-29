import java.util.Scanner;

/*
 * Écrire un algorithme permettant de résoudre une équation du premier degré ax + b = 0
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        System.out.println("Résolution d'une équation du 1er degré: ax + b = 0");

        System.out.print("Entrez la valeur de a: ");
        int a = scn.nextInt();

        if (a == 0) {
            System.out.println("La valeur de a doit être différent de zéro '0' ");
        } else {
            System.out.print("Entrez la valeur de b: ");
            int b = scn.nextInt();

            System.out.println();

            float solution = -(b / a);

            System.out.println("La solution de " + a + "x + " + b + " est: " + solution);
        }
            
        scn.close();
    }
}
