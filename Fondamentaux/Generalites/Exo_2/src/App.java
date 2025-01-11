import java.util.Scanner;

/*
 * Écrire un programme qui demande à l’utilisateur de donner une mesure en dm 
 * puis détermine et affiche la correspondance en m, mm, cm, hm.
 * 
 * Correspondace :
 * 
 * 1 dm = 0,1 m
 * 1 dm = 10 cm
 * 1 dm = 100 mm
 * 1 dm = 0,01 hm
 */

public class App {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        float entier = saisie("dm");
        conversion(entier);

    }

    static float saisie(String car) {
        System.out.print("Donner une mesure en Decimetre (" + car + ") : ");
        float entier = scn.nextInt();

        return entier;
    }

    static void conversion(float entier) {

        float metre = (float) (entier * 0.1);
        float centiMetre = (float) (entier * 10);
        float milliMetre = (float) (entier * 100);
        float hectoMetre = (float) (entier * 0.01);

        System.out.println("\nCoversion en: ");
        System.out.println("\nMetre (m): " + metre);
        System.out.println("\nCentimetre (cm): " + centiMetre);
        System.out.println("\nMillimetre (mm): " + milliMetre);
        System.out.println("\nHectometre (hm): " + hectoMetre + "\n");
    }
}
