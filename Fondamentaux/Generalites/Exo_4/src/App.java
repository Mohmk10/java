import java.util.Scanner;

/*
 * Écrire un programme qui demande à l’utilisateur de donner le rayon d’un cercle
 * et lui retourne sa surface et son périmètre.
 * 
 * Formule :
 * 
 * S = π × a2
 * P = 2 × π × a
 */
public class App {
    public static void main(String[] args) throws Exception {

        final float PI = (float) 3.14;

        Scanner scn = new Scanner(System.in);

        System.out.print("Entrez le rayon: ");
        float a = scn.nextFloat();

        float surface = PI * (a * a);
        float perimetre = 2 * PI * a;

        System.out.println();

        System.out.println("Sa surface: " + surface);
        System.out.println("Son périmètre: " + perimetre);
    }
}
