import java.util.Scanner;

/*
 * Écrire un programme qui demande à l’utilisateur de donner la longueur et la largeur d’un rectangle
 * et lui retourne son périmètre, sa surface et la longueur d’un des diagonales.
 * 
 * Formules :
 * 
 * P = 2 × (l+L)
 * 
 * S = l × L
 * 
 * d = √l²+L²
 */

public class App {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        float longueur = saisie("Entrez la longueur");
        float largeur = saisie("Entrez la largeur");

        float perimetre = perimetreRectangle(longueur, largeur);
        float surface = surfaceRectangle(longueur, largeur);
        float diagonal = diagonalRectangle(longueur, largeur);

        System.out.println("\nLe périmètre: " + perimetre);
        System.out.println("\nLa surface: " + surface);
        System.out.println("\nLe diagonal: " + diagonal + "\n");

    }

    static float saisie(String message) {
        System.out.print("\n " + message + ": " );
        float entier = scn.nextInt();

        return entier;
    }

    static float perimetreRectangle (float longueur, float largeur) {

        float perimetre = 2 * (longueur + largeur);
        return perimetre;
    }

    static float surfaceRectangle (float longueur, float largeur) {
        
        float surface = longueur * largeur;
        return surface;
    }

    static float diagonalRectangle (float longueur, float largeur) {
        
        float diagonal = (float) Math.sqrt((longueur * longueur) + (largeur * largeur));
        return diagonal;
    }
}
