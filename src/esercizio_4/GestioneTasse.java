package esercizio_4;

public class GestioneTasse {

    
    public static double calcolaTasse(Studente s) {
        return s.calcolaTassaEffettiva();
    }
    // essendo Studente ASTRATTA, ed essendo calcolaTassaEffettiva un metodo astratto, Java sa che
    // qualunque oggetto compatibile con Studente, ha un metodo implementato con firma calcolaTassaEffettiva()

    
    public static void calcolaTasse(Studente[] studenti) {
        System.out.println("Tasse Universitarie: ");
        for (Studente s : studenti) {
            double tassa = calcolaTasse(s); 
            System.out.println(s.getClass().getSimpleName() + " - " 
                    + s.getNome() + " " + s.getCognome() 
                    + " | ISEE: €" + s.getIsee() 
                    + " | Anno: " + s.getAnnoCorso() 
                    + " -> Tassa da pagare: €" + tassa);
        }
    }

    public static void main(String[] args) {
    	
        Studente[] studenti = new Studente[5];

        // nel momento in cui istanziamo l'oggetto col new, Java capisce quale metodo calcolaTassaEffettiva 
        // di quale classe usare
        studenti[0] = new Triennale("Marco", "Rossi", 8500.0, 2);


        studenti[1] = new Triennale("Giulia", "Bianchi", 9000.0, 4);


        studenti[2] = new Triennale("Luca", "Verdi", 35000.0, 8);


        studenti[3] = new Magistrale("Elena", "Neri", 18000.0, 1);


        studenti[4] = new Magistrale("Davide", "Russo", 7500.0, 3);


        calcolaTasse(studenti);
    }
}