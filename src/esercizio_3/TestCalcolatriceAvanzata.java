package esercizio_3;

import java.util.Scanner;

import esercizio_2.CalcolatriceAvanzata;


public class TestCalcolatriceAvanzata {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcolatriceAvanzata calc = new CalcolatriceAvanzata();

        boolean continua = true;

        while (continua) {
            try {
                System.out.println("\n--- CALCOLATRICE AVANZATA ---");
                System.out.println("1. Somma");
                System.out.println("2. Sottrazione");
                System.out.println("3. Moltiplicazione");
                System.out.println("4. Divisione");
                System.out.println("0. Esci");
                System.out.print("Scegli un'operazione: ");

                int sceltaOperazione = scanner.nextInt();

                if (sceltaOperazione == 0) {
                    System.out.println("Uscita dal programma. Arrivederci!");
                    break;
                }

                if (sceltaOperazione < 1 || sceltaOperazione > 4) {
                    System.out.println("Scelta operazione non valida! Riprova.");
                    continue;
                }

                System.out.println("\nModalità di calcolo:");
                System.out.println("1. Due numeri");
                System.out.println("2. Tre numeri");
                System.out.println("3. Array di numeri");
                System.out.print("Scegli la modalità: ");

                int modalita = scanner.nextInt();
                double risultato = 0.0;

                switch (modalita) {
                    case 1: {
                        System.out.print("Inserisci il primo numero: ");
                        double n1 = scanner.nextDouble();
                        System.out.print("Inserisci il secondo numero: ");
                        double n2 = scanner.nextDouble();

                        risultato = eseguiDueNumeri(calc, sceltaOperazione, n1, n2);
                        stampaRisultato(risultato);
                        break;
                    }

                    case 2: {
                        System.out.print("Inserisci il primo numero: ");
                        double n1 = scanner.nextDouble();
                        System.out.print("Inserisci il secondo numero: ");
                        double n2 = scanner.nextDouble();
                        System.out.print("Inserisci il terzo numero: ");
                        double n3 = scanner.nextDouble();

                        risultato = eseguiTreNumeri(calc, sceltaOperazione, n1, n2, n3);
                        stampaRisultato(risultato);
                        break;
                    }

                    case 3: {
                        System.out.print("Quanti numeri vuoi inserire nell'array? ");
                        int quantita = scanner.nextInt();

                        if (quantita <= 0) {
                            System.out.println("L'array deve contenere almeno un numero.");
                            break;
                        }

                        double[] arrayNumeri = new double[quantita];
                        for (int i = 0; i < quantita; i++) {
                            System.out.print("Inserisci il numero " + (i + 1) + ": ");
                            arrayNumeri[i] = scanner.nextDouble();
                        }

                        risultato = eseguiArray(calc, sceltaOperazione, arrayNumeri);
                        stampaRisultato(risultato);
                        break;
                    }

                    default:
                        System.out.println("Modalità selezionata non valida.");
                }

            } catch (Exception e) {
                // Cattura qualsiasi eccezione imprevista (es. lettere invece di numeri)
                System.out.println("Errore riscontrato: input non valido o operazione fallita.");
                
                // PULIZIA DEL BUFFER
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    private static double eseguiDueNumeri(CalcolatriceAvanzata calc, int op, double n1, double n2) {
        switch (op) {
            case 1: return calc.somma(n1, n2);
            case 2: return calc.sottrazione(n1, n2);
            case 3: return calc.moltiplicazione(n1, n2);
            case 4: return calc.divisione(n1, n2);
            default: return 0.0;
        }
    }

    private static double eseguiTreNumeri(CalcolatriceAvanzata calc, int op, double n1, double n2, double n3) {
        switch (op) {
            case 1: return calc.somma(n1, n2, n3);
            case 2: return calc.sottrazione(n1, n2, n3);
            case 3: return calc.moltiplicazione(n1, n2, n3);
            case 4: return calc.divisione(n1, n2, n3);
            default: return 0.0;
        }
    }

    private static double eseguiArray(CalcolatriceAvanzata calc, int op, double[] numeri) {
        switch (op) {
            case 1: return calc.somma(numeri);
            case 2: return calc.sottrazione(numeri);
            case 3: return calc.moltiplicazione(numeri);
            case 4: return calc.divisione(numeri);
            default: return 0.0;
        }
    }

    private static void stampaRisultato(double risultato) {
        if (Double.isNaN(risultato)) {
            System.out.println("Operazione non valida (es. divisione per zero).");
        } else {
            System.out.println(">>> RISULTATO: " + risultato);
        }
    }
}