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
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        System.out.print("Donner une mesure en Decimetre (dm): ");
        float a = scn.nextFloat();

        float metre = (float) (a * 0.1);
        float centiMetre = (float) (a * 10);
        float milliMetre = (float) (a * 100);
        float hectoMetre = (float) (a * 0.01);

        System.out.println();

        System.out.println("Coversion en: ");
        System.out.println("Metre (m): " + metre);
        System.out.println("Centimetre (cm): " + centiMetre);
        System.out.println("Millimetre (mm): " + milliMetre);
        System.out.println("Hectometre (hm): " + hectoMetre);

        scn.close();
    }
}
