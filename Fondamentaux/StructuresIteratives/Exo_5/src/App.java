import java.util.Scanner;

/*
 * Faire un programme qui calcule et affiche le PPCM de deux entiers saisis au clavier.
 * 
 * PPCM(a,b) = a × b / PGCD(a,b)
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sn = new Scanner(System.in);

        System.out.println("\nCalcul du PPCM de deux entiers");

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
                int reste;

                while (y != 0) {
                    reste = x % y;
                    x = y;
                    y = reste;
                }
                System.out.println("\nLe PGCD de " + a + " et " + b + " est: " + x);

                int ppcm = a * b / x;

                System.out.println("\nDonc le PPCM de " + a + " et " + b + " est: " + ppcm + "\n");
            }
        }

        sn.close();
    }
}
