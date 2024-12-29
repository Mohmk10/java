import java.util.Scanner;

/*
 * Faire un programme qui calcule et affiche la division de a par b par soustractions successives
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sn = new Scanner(System.in);

        System.out.println("Division par soustractions successives");

        System.out.print("\nEntrez un entier a: ");
        int a = sn.nextInt();

        System.out.print("\nEntrez un entier b: ");
        int b = sn.nextInt();

        if (b == 0) {
            System.out.println("b doit être différent de zéro '0' ");
        } else {

            int qutient = 0;
            int reste = 0;
            int z = a;

            while (z >= b) {
                reste = z - b;
                qutient++;
                z -= b;
            }

            System.out.println("\n" + a + " ÷ " + b +" = " + qutient + " avec un reste de "+ reste + "\n");
        }

        sn.close();
    }
}
