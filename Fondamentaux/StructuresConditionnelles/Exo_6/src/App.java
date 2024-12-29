import java.util.Scanner;

/*
 * Décomposition d’un montant en euros Écrire un algorithme permettant de décomposer
 * un montant entré au clavier en billets de 20, 10, 5 euros et pièces de 2, 1 euros,
 * de façon à minimiser le nombre de billets et de pièces.
 * 
 * Formule mathématiques
 * 
 * Prenons un montant de 87 euros :
 * 1. Billets de 20
 * n20 = 87/20 = 4
 * R1​ = 87 − (4 × 20) = 7 
 * 
 * 2. Billets de 10
 * n10 = 7/10 = 0
 * R2 = 7 - (0 x 10) = 7
 * 
 * 3. Billets de 5
 * n5 = 7/5 = 1
 * R3 = 7 - (1 x 5) = 2
 * 
 * 4.Pieces de 2
 * n2 = 2/2 = 1
 * R4 = 2 - (1 x 2) = 0
 * 
 * 5. Pieces de 1
 * n1 = 0
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        System.out.print("\nEntrez un montant: ");
        int montant = scn.nextInt();

        int billet20 = montant / 20;
        int R1 = montant - (billet20 * 20);

        if (R1 == 0) {
            System.out.println("Le montant fait " + billet20 + " billet(s) de 20");
        } else {
            int billet10 = R1 / 10;
            int R2 = R1 - (billet10 * 10);

            if (R2 == 0) {
                System.out.println(
                "\nLe montant " + montant + " fait: \n\n" +
                billet20 + " billet(s) de 20 \n\n" + 
                billet10 + " billet(s) de 10 \n\n"
                );
            } else {
                int billet5 = R2 / 5;
                int R3 = R2 - (billet5 * 5);

                if (R3 == 0) {
                    System.out.println(
                        "\nLe montant " + montant + " fait: \n\n" +
                        billet20 + " billet(s) de 20 \n\n" + 
                        billet10 + " billet(s) de 10 \n\n" +
                        billet5 + " billet(s) de 5 \n\n"
                        );
                } else {
                    int pieces2 = R3 / 2;
                    int R4 = R3 - (pieces2 * 2);

                    if (R4 == 0) {
                        System.out.println(
                        "\nLe montant " + montant + " fait: \n\n" + 
                        billet20 + " billet(s) de 20 \n\n" + 
                        billet10 + " billet(s) de 10 \n\n" +
                        billet5 + " billet(s) de 5 \n\n" + 
                        pieces2 + " pièce(s) de 2 \n\n"
                        );
                    } else
                        System.out.println(
                        "\nLe montant " + montant + " fait: \n\n" + 
                        billet20 + " billet(s) de 20 \n\n" + 
                        billet10 + " billet(s) de 10 \n\n" +
                        billet5 + " billet(s) de 5 \n\n" + 
                        pieces2 + " pièce(s) de 2 \n\n" + 
                        "1 piece de 1\n"
                        );

                }
            }
        }

        scn.close();
    }
}
