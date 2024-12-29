import java.util.Scanner;

/*
 * Écrire un algorithme qui lit trois valeurs entières ( A, B et C) puis les affichent dans l’ordre croissant et décroissant.
 */

 public class App {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);


        System.out.print("\nEntrez un entier A: ");
        int entierA = scn.nextInt();

        System.out.print("\nEntrez un entier B: ");
        int entierB = scn.nextInt();

        System.out.print("\nEntrez un entier C: ");
        int entierC = scn.nextInt();

        if (entierA > entierB && entierA > entierC && entierB > entierC) {
                System.out.println("\nOrdre décroissant\n");
                System.out.println(entierA + "\n" + entierB + "\n" + entierC + "\n");
                System.out.println("\nOrdre croissant\n");
                System.out.println(entierC + "\n" + entierB + "\n" + entierA);
                
            } else {
                if (entierA > entierB && entierA > entierC && entierC > entierB) {
                    System.out.println("\nOrdre décroissant\n");
                    System.out.println(entierA + "\n" + entierC + "\n" + entierB + "\n");
                    System.out.println("\nOrdre croissant\n");
                    System.out.println(entierB + "\n" + entierC + "\n" + entierA );

                } else {
                    if (entierB > entierA && entierB > entierC && entierA > entierC) {
                        System.out.println("\nOrdre décroissant\n");
                        System.out.println(entierB + "\n" + entierA + "\n" + entierC + "\n");
                        System.out.println("\nOrdre croissant\n");
                        System.out.println(entierC + "\n" + entierA + "\n" + entierB );
                        
                    } else {
                        if (entierB > entierA && entierB > entierC && entierC > entierA) {
                            System.out.println("\nOrdre décroissant\n");
                            System.out.println(entierB + "\n" + entierC + "\n" + entierA + "\n");
                            System.out.println("\nOrdre croissant\n");
                            System.out.println(entierA + "\n" + entierC + "\n" + entierB );
                            
                        } else {
                            if (entierC > entierA && entierC > entierB && entierA > entierB) {
                                System.out.println("\nOrdre décroissant\n");
                                System.out.println(entierC + "\n" + entierA + "\n" + entierB + "\n");
                                System.out.println("\nOrdre croissant\n");
                                System.out.println(entierB + "\n" + entierA + "\n" + entierC );
                                
                            } else {
                                if (entierC > entierA && entierC > entierB && entierB > entierA) {
                                    System.out.println("\nOrdre décroissant\n");
                                    System.out.println(entierC + "\n" + entierB + "\n" + entierA + "\n");
                                    System.out.println("\nOrdre croissant\n");
                                    System.out.println(entierA + "\n" + entierB + "\n" + entierC );
                                    
                                } else
                                System.out.println("Les trois entiers sont égaux !");
                            }
                        }
                    }
                }
            }
        scn.close();
    } 

}

