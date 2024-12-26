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
 
​

 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        System.out.print("Entrez la longueur: ");
        float longueur = scn.nextFloat();
        System.out.print("Entrez la largeur: ");
        float largeur = scn.nextFloat();

        float perimetre = 2 * (longueur + largeur);
        float surface = longueur * largeur;
        float diagonal = (float) Math.sqrt((longueur * longueur) + (largeur * largeur));

        System.out.println();

        System.out.println("Le périmètre: " + perimetre);
        System.out.println("La surface: " + surface);
        System.out.println("Le diagonal: " + diagonal);

        scn.close();

    }
}
