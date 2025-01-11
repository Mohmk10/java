import java.util.Scanner;

/*
*
* Exercice 1 : Écrire un programme qui saisit deux entiers a et b,
* calcule et affiche le quotient entier, le reste de la division,
* le ratio (quotient réel) et modulo.
*/


public class App {

   static Scanner scn = new Scanner(System.in);

   public static void main(String[] args) throws Exception {

      int a = saisie('a');
      int b = saisie('b');

      quotientEntierReelModulo(a, b);

   }

   static int saisie(char car) {
      System.out.print("Entrez un entier " + car + " : ");
      int entier = scn.nextInt();

      return entier;
   }

   static void quotientEntierReelModulo(int a, int b) {

      float quotientReel = (float) a / b;
      int quotientEntier = (int) quotientReel;
      int modulo = a % b;
    
      System.out.println("\nQuotient entier: " + quotientEntier);
      System.out.println("\nRatio (Qutient réel) : " + quotientReel);
      System.out.println("\nReste (Modulo) : " + modulo + "\n");
   }

}
