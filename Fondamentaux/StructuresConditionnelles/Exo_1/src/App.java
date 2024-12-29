import java.util.Scanner;

/*
 * Demander à l'utilisateur d’indiquer son choix.
 * S’il entre la valeur  1, calculer et afficher la résistance  en série.
 * S’il entre la valeur 2, calculer et afficher la résistance en parallèle.
 * Résistance en série : R1 + R2 +R3
 * Résistance en parallèle : (R1 * R2 * R3) / (R1*R2 + R2*R3 + R1*R3)
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        System.out.print("Entrez la resistance R1: ");
        float r1 = scn.nextFloat();
        System.out.print("Entrez la resistance R2: ");
        float r2 = scn.nextFloat();
        System.out.print("Entrez la resistance R3: ");
        float r3 = scn.nextFloat();

        System.out.println();

        System.out.println("1 - Résistance en serie");
        System.out.println("2 - Résistance en parallèle");

        System.out.println();

        System.out.print("Faites un choix: ");
        int choix = scn.nextInt();

        System.out.println();

        if (choix == 1) {
            float resistanceSerie = r1 + r2 + r3;
            System.out.println("Résitance en serie: " + resistanceSerie);
        } else {
            if (choix == 2) {
                float resistanceParallele = (r1 * r2 * r3) / (r1 * r2 + r2 * r3 + r1 * r3);
                System.out.println("Résitance en parallèle: " + resistanceParallele);
            } else 
                System.out.println("Veuillez choisir 1 ou 2");
        }

        scn.close();

    }
}
