import java.util.Scanner;

/*
 * Faire un programme qui calcule le PGCD de deux nombres saisis au clavier en utilisant l'astuce suivante:
 * soustrait le plus petit des deux entiers du plus grand jusqu'à ce qu'ils soient égaux.
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sn = new Scanner(System.in);

        System.out.println("\nCalcul de PGCD de deux entiers");
        
        System.out.print("\nEntrez un entier a: ");
        int a = sn.nextInt();

        if (a < 0) {
            System.out.println("\na doit être supérieur à zero '0' \n");
        } else {
            System.out.print("\nEntrez un entier b: ");
            int b = sn.nextInt();

            if (b < 0) {
                System.out.println("\nb doit être supérieur à zero '0' \n");
            } else {

                int x = a;
                int y = b;

                while (x != y) {

                    if (x > y) {
                        x = x - y;
                    }

                    if (y > x) {
                        y = y - x;
                    }
                }

                System.out.println("\nLe PGCD de " + a + " et " + b + " est: " + x + "\n");
            }
        }

        sn.close();
    }
}
