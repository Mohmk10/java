import java.util.Scanner;

/*
 * Faire un programme qui saisit trois résistances : R1, R2 et R3.
 * Calculer et afficher la résistance en série : R1 + R2 +R3
 * Calculer et afficher la résistance en parallèle : (R1 * R2 * R3) / (R1*R2 + R2*R3 + R1*R3)
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

        float resistanceSerie = r1 + r2 + r3;
        float resistanceParallele = (r1 * r2 * r3) / (r1 * r2 + r2 * r3 + r1 * r3);

        System.out.println();

        System.out.println("La résistance en serie: " + resistanceSerie);
        System.out.println("La résistance en parallèle: " + resistanceParallele);

        scn.close();

    }
}
