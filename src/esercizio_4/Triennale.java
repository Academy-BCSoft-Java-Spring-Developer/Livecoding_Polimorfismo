package esercizio_4;

public class Triennale extends Studente {
    private static final int DURATA_LEGALE = 3;

    public Triennale(String nome, String cognome, double isee, int annoCorso) {
        super(nome, cognome, isee, annoCorso);
    }

    @Override
    public double calcolaTassaEffettiva() {
        double base = getTassaBase();
        int anniFuoriCorso = Math.max(0, getAnnoCorso() - DURATA_LEGALE);

        // Massimo 3 anni di maggiorazione
        int anniConteggiati = Math.min(anniFuoriCorso, 3);

        // +10% per ciascun anno fuori corso conteggiato
        double maggiorazione = base * (0.10 * anniConteggiati);
        return base + maggiorazione;
    }
}