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

        rectangle(longueur, largeur);

    }

    static float saisie(String message) {
        System.out.print("\n " + message + ": " );
        float entier = scn.nextInt();

        return entier;
    }

    static void rectangle (float longueur, float largeur){
        float perimetre = 2 * (longueur + largeur);
        float surface = longueur * largeur;
        float diagonal = (float) Math.sqrt((longueur * longueur) + (largeur * largeur));

        System.out.println("\nLe périmètre: " + perimetre);
        System.out.println("\nLa surface: " + surface);
        System.out.println("\nLe diagonal: " + diagonal + "\n");
    }
}
