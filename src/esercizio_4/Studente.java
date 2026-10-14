package esercizio_4;

public abstract class Studente {
    private String nome;
    private String cognome;
    private double isee;
    private int annoCorso;

    public Studente(String nome, String cognome, double isee, int annoCorso) {
        this.nome = nome;
        this.cognome = cognome;
        this.isee = isee;
        this.annoCorso = annoCorso;
    }

    // Quota fissa di base legata all'ISEE
    public double getTassaBase() {
        if (this.isee < 10000.0) {
            return 500.0;
        } else if (this.isee <= 30000.0) {
            return 700.0;
        } else {
            return 1200.0;
        }
    }

    // Metodo astratto che verrà implementato in modo specifico dalle classi figlie
    public abstract double calcolaTassaEffettiva();

    // Getter
    public String getNome() { 
    	return nome; 
    }
    
    public String getCognome() { 
    	return cognome; 
    }
    
    public double getIsee() { 
    	return isee;
    }
    
    public int getAnnoCorso() { 
    	return annoCorso;
    }
    
}