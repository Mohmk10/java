import java.util.Scanner;

/*
 * Écrire un programme qui demande à l’utilisateur de donner une température en Celsius,
 * puis détermine et affiche la correspondance en Fahrenheit.
 * 
 * Correspondance :
 * 
 * °F=(°C × 9/5)+ 32
 */


public class App {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        System.out.print("Entrez une temperature en °C: ");
        float a = scn.nextFloat();

        float fahrenheit = (float) (a * 9/5) + 32;

        System.out.println(a +"°C" + " = " + fahrenheit + "°F" );
    }
}
