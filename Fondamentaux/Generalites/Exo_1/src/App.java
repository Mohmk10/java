import java.util.Scanner;

/*
*
* Exercice 1 : Écrire un programme qui saisit deux entiers a et b,
* calcule et affiche le quotient entier, le reste de la division,
* le ratio (quotient réel) et modulo.
*/


public class App {
   public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);

    System.out.print("Entrez un entier a: ");
    int a = scn.nextInt();
    System.out.print("Entrez un entier b: ");
    int b = scn.nextInt();

    float quotientReel = (float) a / b;
    int quotientEntier = (int) quotientReel;
    int modulo = a % b;

    System.out.println();
    
    System.out.println("Quotient entier: " + quotientEntier);
    System.out.println("Ratio (Qutient réel) : " + quotientReel);
    System.out.println("Reste (Modulo) : " + modulo);

    scn.close();
   }
}


