package esercizio_4;

public class Magistrale extends Studente {
    private static final int DURATA_LEGALE = 2;

    public Magistrale(String nome, String cognome, double isee, int annoCorso) {
        super(nome, cognome, isee, annoCorso);
    }

    @Override
    public double calcolaTassaEffettiva() {
        double base = getTassaBase();
        int anniFuoriCorso = Math.max(0, getAnnoCorso() - DURATA_LEGALE);

        // Massimo 2 anni di maggiorazione
        int anniConteggiati = Math.min(anniFuoriCorso, 2);

        // +15% per ciascun anno fuori corso conteggiato
        double maggiorazione = base * (0.15 * anniConteggiati);
        return base + maggiorazione;
    }
}