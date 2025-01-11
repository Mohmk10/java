import java.util.Scanner;

/*
 * Écrire un programme qui demande à l’utilisateur de donner une température en Celsius,
 * puis détermine et affiche la correspondance en Fahrenheit.
 * 
 * Correspondance :
 * 
 * °F = (°C × 9/5)+ 32
 */


public class App {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        float a = saisie();
        conversion(a);
    }

    static float saisie() {
        System.out.print("\nEntrez une temperature en °C: ");
        float entier = scn.nextInt();

        return entier;
    }

    static void conversion(float entier) {

        float fahrenheit = (float) (entier * 9/5) + 32;

        System.out.println("\n" + entier +" °C" + " = " + fahrenheit + " °F\n" );
    }
}
