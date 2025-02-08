import java.util.Scanner;

/*
 * Écrire un programme qui demande à l’utilisateur de donner le rayon d’un cercle
 * et lui retourne sa surface et son périmètre.
 * 
 * Formule :
 * 
 * S = π × a²
 * P = 2 × π × a
 */
public class App {

    final static float PI =  3.14f;
    
        static Scanner scn = new Scanner(System.in);
        public static void main(String[] args) throws Exception {
    
            float rayon = saisie();
            float surface = surfaceCercle(rayon);
            float perimetre = perimetreCerle(rayon);
    
            System.out.println("\nSa surface: " + surface);
            System.out.println("\nSon périmètre: " + perimetre + "\n");
        }
    
        static float saisie() {
            System.out.print("\nEntrez le rayon: ");
            float entier = scn.nextInt();
    
            return entier;
        }

        static float perimetreCerle(float rayon) {
            float perimetre = 2 * PI * rayon;
            return perimetre;
        }

        static float surfaceCercle(float rayon) {

            float surface = PI * (rayon * rayon);
            return surface;
        }
}
