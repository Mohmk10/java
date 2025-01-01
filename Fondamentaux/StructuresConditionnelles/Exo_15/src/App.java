import java.util.Scanner;

/*
 * Faire un programme qui saisit une date (jour, mois et année) puis  détermine  et affiche la date qu’il fera dans 5 jours
 */

 public class App {
    public static void main(String[] args) throws Exception {

        Scanner sn = new Scanner(System.in);

        System.out.println("\nDate dans 5 jours\n");

        System.out.print("Entrez une date (Jour): ");
        int jour = sn.nextInt();

        if (jour < 1 || jour > 31) {
            System.out.println("\nLe jour est compris en 1 et 31\n");
        } else {
            System.out.print("\nEntrez une date (Mois): ");
            int mois = sn.nextInt();

            if (mois < 1 || mois > 12) {
                System.out.println("\nLe mois est compris entre 1 et 12\n"); 
            } else {
                if (jour == 31 && mois == 4 || jour == 31 && mois == 6 || jour == 31 && mois == 9 || jour == 31 && mois == 11) {

                    System.out.println("\nPeu importe l'année, ce mois se limite toujours à 3O jours \n");
                    
                } else {
                    if (jour > 29 && mois == 2) {

                        System.out.println("\nPeu importe l'année, ce mois ne dépasse jamais 29 jours \n");

                    } else {

                        System.out.print("\nEntrez une date (Année): ");
                        int annee = sn.nextInt();

                        if (annee < 1900) {

                            System.out.println("\nL'année doit être supérieur ou égal à 1900\n");
                            
                        } else {
                            switch (mois) {
                                case 1:
                                    if (jour == 27) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date dans 5 jours: 1 / 2 / " + annee + "\n");
                                    } else {
                                        if (jour == 28) {
                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                            System.out.println("La date dans 5 jours: 2 / 2 / " + annee + "\n");
                                        } else {
                                            if (jour == 29) {
                                                System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                System.out.println("La date dans 5 jours: 3 / 2 / " + annee + "\n");
                                            } else {
                                                if (jour == 30) {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    System.out.println("La date dans 5 jours: 4 / 2 / " + annee + "\n");
                                                } else {
                                                    if (jour == 31) {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        System.out.println("La date dans 5 jours: 5 / 2 / " + annee + "\n");
                                                    } else {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        jour += 5;
                                                        System.out.println("La date dans 5 jours: " + jour + " / " + mois + " / " + annee + "\n");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    if (jour == 24) {
                                        if (annee % 4 == 0) {
                                            if (annee % 100 != 0) {
                                                System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                System.out.println("La date dans 5 jours: 29 / 2 / " + annee + "\n");
                                            } else 
                                                if(annee % 400 == 0) {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    System.out.println("La date dans 5 jours: 29 / 2 / " + annee + "\n");
                                                } else {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    System.out.println("La date dans 5 jours: 1 / 3 / " + annee + "\n");
                                                }
                                        } else {
                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                            System.out.println("La date dans 5 jours: 1 / 3 / " + annee + "\n");
                                        }
                                    } else {
                                        if (jour == 25) {
                                            if (annee % 4 == 0) {
                                                if (annee % 100 != 0) {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    System.out.println("La date dans 5 jours: 1 / 3 / " + annee + "\n");
                                                } else 
                                                    if(annee % 400 == 0) {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        System.out.println("La date dans 5 jours: 1 / 3 / " + annee + "\n");
                                                    } else {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        System.out.println("La date dans 5 jours: 2 / 3 / " + annee + "\n");
                                                    }
                                            } else {
                                                System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                System.out.println("La date dans 5 jours: 2 / 3 / " + annee + "\n");
                                            }
                                        } else {
                                            if (jour == 26) {
                                                if (annee % 4 == 0) {
                                                    if (annee % 100 != 0) {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        System.out.println("La date dans 5 jours: 2 / 2 / " + annee + "\n");
                                                    } else 
                                                        if(annee % 400 == 0) {
                                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                            System.out.println("La date dans 5 jours: 2 / 2 / " + annee + "\n");
                                                        } else {
                                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                            System.out.println("La date dans 5 jours: 3 / 3 / " + annee + "\n");
                                                        }
                                                } else {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    System.out.println("La date dans 5 jours: 3 / 3 / " + annee + "\n");
                                                }
                                            } else {
                                                if (jour == 27) {
                                                    if (annee % 4 == 0) {
                                                        if (annee % 100 != 0) {
                                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                            System.out.println("La date dans 5 jours: 3 / 2 / " + annee + "\n");
                                                        } else 
                                                            if(annee % 400 == 0) {
                                                                System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                                System.out.println("La date dans 5 jours: 3 / 2 / " + annee + "\n");
                                                            } else {
                                                                System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                                System.out.println("La date dans 5 jours: 4 / 3 / " + annee + "\n");
                                                            }
                                                    } else {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        System.out.println("La date dans 5 jours: 4 / 3 / " + annee + "\n");
                                                    }
                                                } else {
                                                    if (jour == 28) {
                                                        if (annee % 4 == 0) {
                                                            if (annee % 100 != 0) {
                                                                System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                                System.out.println("La date dans 5 jours: 4 / 2 / " + annee + "\n");
                                                            } else 
                                                                if(annee % 400 == 0) {
                                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                                    System.out.println("La date dans 5 jours: 4 / 2 / " + annee + "\n");
                                                                } else {
                                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                                    System.out.println("La date dans 5 jours: 5 / 3 / " + annee + "\n");
                                                                }
                                                        } else {
                                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                            System.out.println("La date dans 5 jours: 5 / 3 / " + annee + "\n");
                                                        }
                                                    } else {
                                                        if (jour == 29) {
                                                            if (annee % 4 == 0) {
                                                                if (annee % 100 != 0) {
                                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                                    System.out.println("La date suivante: 5 / 3 / " + annee + "\n");
                                                                } else 
                                                                    if(annee % 400 == 0) {
                                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                                        System.out.println("La date suivante: 5 / 3 / " + annee + "\n");
                                                                    } else
                                                                        System.out.println("\nCette date : " + jour + " / " + mois + " / " + annee + " n'est pas valide\n");
                                                            } else
                                                                System.out.println("\nCette date : " + jour + " / " + mois + " / " +  annee + " n'est pas valide\n");
                                                        } else {
                                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                            jour += 5;
                                                            System.out.println("La date suivante: " + jour + " / " + mois + " / " + annee + "\n");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                    break;
                                case 3:
                                    if (jour == 27) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date dans 5 jours: 1 / 4 / " + annee + "\n");
                                    } else {
                                        if (jour == 28) {
                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                            System.out.println("La date dans 5 jours: 2 / 4 / " + annee + "\n");
                                        } else {
                                            if (jour == 29) {
                                                System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                System.out.println("La date dans 5 jours: 3 / 4 / " + annee + "\n");
                                            } else {
                                                if (jour == 30) {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    System.out.println("La date dans 5 jours: 4 / 4 / " + annee + "\n");
                                                } else {
                                                    if (jour == 31) {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        System.out.println("La date dans 5 jours: 5 / 4 / " + annee + "\n");
                                                    } else {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        jour += 5;
                                                        System.out.println("La date dans 5 jours: " + jour + " / " + mois + " / " + annee + "\n");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 4:
                                    if (jour == 26) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date dans 5 jours: 1 / 5 / " + annee + "\n");
                                    } else {
                                        if (jour == 27) {
                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                            System.out.println("La date dans 5 jours: 2 / 5 / " + annee + "\n");
                                        } else {
                                            if (jour == 28) {
                                                System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                System.out.println("La date dans 5 jours: 3 / 5 / " + annee + "\n");
                                            } else {
                                                if (jour == 29) {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    System.out.println("La date dans 5 jours: 4 / 5 / " + annee + "\n");
                                                } else {
                                                    if (jour == 30) {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        System.out.println("La date dans 5 jours: 5 / 5 / " + annee + "\n");
                                                    } else {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        jour += 5;
                                                        System.out.println("La date dans 5 jours: " + jour + " / " + mois + " / " + annee + "\n");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 5:
                                    if (jour == 27) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date dans 5 jours: 1 / 6 / " + annee + "\n");
                                    } else {
                                        if (jour == 28) {
                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                            System.out.println("La date dans 5 jours: 2 / 6 / " + annee + "\n");
                                        } else {
                                            if (jour == 29) {
                                                System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                System.out.println("La date dans 5 jours: 3 / 6 / " + annee + "\n");
                                            } else {
                                                if (jour == 30) {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    System.out.println("La date dans 5 jours: 4 / 6 / " + annee + "\n");
                                                } else {
                                                    if (jour == 31) {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        System.out.println("La date dans 5 jours: 5 / 6 / " + annee + "\n");
                                                    } else {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        jour += 5;
                                                        System.out.println("La date dans 5 jours: " + jour + " / " + mois + " / " + annee + "\n");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 6:
                                    if (jour == 26) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date dans 5 jours: 1 / 7 / " + annee + "\n");
                                    } else {
                                        if (jour == 27) {
                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                            System.out.println("La date dans 5 jours: 2 / 7 / " + annee + "\n");
                                        } else {
                                            if (jour == 28) {
                                                System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                System.out.println("La date dans 5 jours: 3 / 7 / " + annee + "\n");
                                            } else {
                                                if (jour == 29) {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    System.out.println("La date dans 5 jours: 4 / 7 / " + annee + "\n");
                                                } else {
                                                    if (jour == 30) {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        System.out.println("La date dans 5 jours: 5 / 7 / " + annee + "\n");
                                                    } else {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        jour += 5;
                                                        System.out.println("La date dans 5 jours: " + jour + " / " + mois + " / " + annee + "\n");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 7:
                                    if (jour == 27) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date dans 5 jours: 1 / 8 / " + annee + "\n");
                                    } else {
                                        if (jour == 28) {
                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                            System.out.println("La date dans 5 jours: 2 / 8 / " + annee + "\n");
                                        } else {
                                            if (jour == 29) {
                                                System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                System.out.println("La date dans 5 jours: 3 / 8 / " + annee + "\n");
                                            } else {
                                                if (jour == 30) {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    System.out.println("La date dans 5 jours: 4 / 8 / " + annee + "\n");
                                                } else {
                                                    if (jour == 31) {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        System.out.println("La date dans 5 jours: 5 / 8 / " + annee + "\n");
                                                    } else {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        jour += 5;
                                                        System.out.println("La date dans 5 jours: " + jour + " / " + mois + " / " + annee + "\n");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 8:
                                    if (jour == 27) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date dans 5 jours: 1 / 9 / " + annee + "\n");
                                    } else {
                                        if (jour == 28) {
                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                            System.out.println("La date dans 5 jours: 2 / 9 / " + annee + "\n");
                                        } else {
                                            if (jour == 29) {
                                                System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                System.out.println("La date dans 5 jours: 3 / 9 / " + annee + "\n");
                                            } else {
                                                if (jour == 30) {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    System.out.println("La date dans 5 jours: 4 / 9 / " + annee + "\n");
                                                } else {
                                                    if (jour == 31) {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        System.out.println("La date dans 5 jours: 5 / 9 / " + annee + "\n");
                                                    } else {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        jour += 5;
                                                        System.out.println("La date dans 5 jours: " + jour + " / " + mois + " / " + annee + "\n");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 9:
                                    if (jour == 26) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date dans 5 jours: 1 / 10 / " + annee + "\n");
                                    } else {
                                        if (jour == 27) {
                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                            System.out.println("La date dans 5 jours: 2 / 10 / " + annee + "\n");
                                        } else {
                                            if (jour == 28) {
                                                System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                System.out.println("La date dans 5 jours: 3 / 10 / " + annee + "\n");
                                            } else {
                                                if (jour == 29) {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    System.out.println("La date dans 5 jours: 4 / 10 / " + annee + "\n");
                                                } else {
                                                    if (jour == 30) {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        System.out.println("La date dans 5 jours: 5 / 10 / " + annee + "\n");
                                                    } else {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        jour += 5;
                                                        System.out.println("La date dans 5 jours: " + jour + " / " + mois + " / " + annee + "\n");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 10:
                                    if (jour == 27) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date dans 5 jours: 1 / 11 / " + annee + "\n");
                                    } else {
                                        if (jour == 28) {
                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                            System.out.println("La date dans 5 jours: 2 / 11 / " + annee + "\n");
                                        } else {
                                            if (jour == 29) {
                                                System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                System.out.println("La date dans 5 jours: 3 / 11 / " + annee + "\n");
                                            } else {
                                                if (jour == 30) {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    System.out.println("La date dans 5 jours: 4 / 11 / " + annee + "\n");
                                                } else {
                                                    if (jour == 31) {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        System.out.println("La date dans 5 jours: 5 / 11 / " + annee + "\n");
                                                    } else {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        jour += 5;
                                                        System.out.println("La date dans 5 jours: " + jour + " / " + mois + " / " + annee + "\n");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 11:
                                    if (jour == 26) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        System.out.println("La date dans 5 jours: 1 / 12 / " + annee + "\n");
                                    } else {
                                        if (jour == 27) {
                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                            System.out.println("La date dans 5 jours: 2 / 12 / " + annee + "\n");
                                        } else {
                                            if (jour == 28) {
                                                System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                System.out.println("La date dans 5 jours: 3 / 12 / " + annee + "\n");
                                            } else {
                                                if (jour == 29) {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    System.out.println("La date dans 5 jours: 4 / 12 / " + annee + "\n");
                                                } else {
                                                    if (jour == 30) {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        System.out.println("La date dans 5 jours: 5 / 12 / " + annee + "\n");
                                                    } else {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        jour += 5;
                                                        System.out.println("La date dans 5 jours: " + jour + " / " + mois + " / " + annee + "\n");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 12:
                                    if (jour == 27) {
                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                        annee++;
                                        System.out.println("La date dans 5 jours: 1 / 1 / " + annee + "\n");
                                    } else {
                                        if (jour == 28) {
                                            System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                            annee++;
                                            System.out.println("La date dans 5 jours: 2 / 1 / " + annee + "\n");
                                        } else {
                                            if (jour == 29) {
                                                System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                annee++;
                                                System.out.println("La date dans 5 jours: 3 / 1 / " + annee + "\n");
                                            } else {
                                                if (jour == 30) {
                                                    System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                    annee++;
                                                    System.out.println("La date dans 5 jours: 4 / 1 / " + annee + "\n");
                                                } else {
                                                    if (jour == 31) {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        annee++;
                                                        System.out.println("La date dans 5 jours: 5 / 1 / " + annee + "\n");
                                                    } else {
                                                        System.out.println("\nLa date entrée: " + jour + " / " + mois + " / " + annee + "\n");
                                                        jour += 5;
                                                        System.out.println("La date dans 5 jours: " + jour + " / " + mois + " / " + annee + "\n");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                }
            }

        }

        sn.close();

    }
}
