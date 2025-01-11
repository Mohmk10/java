import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * Écrire un algorithme qui lit trois valeurs entières ( A, B et C) puis les affichent dans l’ordre croissant et décroissant.
 */

 public class App {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        int entierA = saisie("Entrez un entier A");
        int entierB = saisie("Entrez un entier B");
        int entierC = saisie("Entrez un entier C");
        int entierD = saisie("Entrez un entier D");

        comparaison(entierA, entierB, entierC, entierD);
    }

    static int saisie (String message) {
        System.out.print("\n " + message + ": ");
        int entier = scn.nextInt();

        return entier;
    }

    static void comparaison(int a, int b, int c, int d) {

        int nombreMin = 0, nombreMax = 0, nombreMoy = 0, nombreMoy1 = 0;

        if (a > b && a > c && a > d) {
            nombreMax = a;

            if (b > c && b > d) {
                nombreMoy = b;
                if (c > d) {
                    nombreMoy1 = c;
                    nombreMin = d;
                } else {
                    nombreMoy1 = d;
                    nombreMin = c;
                }
            } else {
                if (c > b && c > d) {
                    nombreMoy = c;

                    if (b > d) {
                        nombreMoy1 = b;
                        nombreMin = d;
                    } else {
                        nombreMoy1 = d;
                        nombreMin = b;
                    }
                } else {
                    if (d > c && d >b) {
                        nombreMoy = d;

                        if (b > c) {
                            nombreMoy1 = b;
                            nombreMin = c;
                        } else {
                            nombreMoy1 = c;
                            nombreMin = b;
                        }
                    }
                }
            }

        } else
            if (b > a && b > c && b > d) {
                nombreMax = b;
            
                if (a > c && a > d) {
                    nombreMoy = a;
                    if (c > d) {
                        nombreMoy1 = c;
                        nombreMin = d;
                    } else {
                        nombreMoy1 = d;
                        nombreMin = c;
                    }
                } else {
                    if (c > a && c > d) {
                        nombreMoy = c;
                    
                        if (a > d) {
                            nombreMoy1 = a;
                            nombreMin = d;
                        } else {
                            nombreMoy1 = d;
                            nombreMin = a;
                        }
                    } else {
                        if (d > c && d >a) {
                            nombreMoy = d;
                        
                            if (a > c) {
                                nombreMoy1 = a;
                                nombreMin = c;
                            } else {
                                nombreMoy1 = c;
                                nombreMin = a;
                            }
                        }
                    }
                }
        } else
            if (c > a && c > b && c > d) {
                nombreMax = c;

                if (b > a && b > d) {
                    nombreMoy = b;
                    if (a > d) {
                        nombreMoy1 = a;
                        nombreMin = d;
                    } else {
                        nombreMoy1 = d;
                        nombreMin = a;
                    }
                } else {
                    if (a > b && a > d) {
                        nombreMoy = a;

                        if (b > d) {
                            nombreMoy1 = b;
                            nombreMin = d;
                        } else {
                            nombreMoy1 = d;
                            nombreMin = b;
                        }
                    } else {
                        if (d > a && d >b) {
                            nombreMoy = d;

                            if (b > a) {
                                nombreMoy1 = b;
                                nombreMin = a;
                            } else {
                                nombreMoy1 = a;
                                nombreMin = b;
                            }
                        }
                    }
                }
            } else
            if (d > a && d > b && d > c) {
                nombreMax = d;
    
                if (b > c && b > a) {
                    nombreMoy = b;
                    if (c > a) {
                        nombreMoy1 = c;
                        nombreMin = a;
                    } else {
                        nombreMoy1 = a;
                        nombreMin = c;
                    }
                } else {
                    if (c > b && c > a) {
                        nombreMoy = c;
    
                        if (b > a) {
                            nombreMoy1 = b;
                            nombreMin = a;
                        } else {
                            nombreMoy1 = a;
                            nombreMin = b;
                        }
                    } else {
                        if (a > c && a >b) {
                            nombreMoy = a;
    
                            if (b > c) {
                                nombreMoy1 = b;
                                nombreMin = c;
                            } else {
                                nombreMoy1 = c;
                                nombreMin = b;
                            }
                        }
                    }
                }
            }    

        System.out.println("\nOrdre croissant\n");
        System.out.println(nombreMin + "\n" + nombreMoy1 + "\n" + nombreMoy + "\n" + nombreMax );
        System.out.println("\nOrdre décroissant\n");
        System.out.println(nombreMax + "\n" + nombreMoy + "\n" + nombreMoy1 + "\n" + nombreMin + "\n");
    }

}