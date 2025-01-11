import java.util.Scanner;

/*
 * Écrire un algorithme qui demande successivement 10 nombres à l'utilisateur
 * et qui affiche à la fin le plus grand de ces 10 nombres Et affiche aussi son rang dans la liste saisie
 */

public class App {

    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("\nLe plus grand nombre\n");

        plusGrand();
    }

    static int saisie(String message) {
        System.out.print("\n" + message + ": ");
        int entier = sn.nextInt();

        return entier;
    }

    static void plusGrand() {

        int nombre;
        int a = 0;
        int b = 1;
        int c = 0;
        int grand = 0;

        do {

            nombre = saisie("Entrez un nombre n°" + b );
            if (b == 1) {
                grand = nombre;
            }
            if (nombre > grand) {

                grand = nombre;
                c = b;
            }

            b++;
            a++;
            
        } while (a < 3);

        System.out.println("\nLe plus grand nombre est: " + grand + " au n° " + c + "\n");
    }

}
