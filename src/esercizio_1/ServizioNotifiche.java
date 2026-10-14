package esercizio_1;

public class ServizioNotifiche {

	public void inviaNotifica(String messaggio) {
		System.out.println("Notifica generica: " + messaggio);
	}
	
	public void inviaNotifica(String email, String messaggio) {
		System.out.println("Notifica alla mail: " + email + ", messaggio: " + messaggio + ".");
	}
	
	public void inviaNotifica(long numeroTelefono, String messaggio) {
		System.out.println("Notifica al numero: " + numeroTelefono + ", messaggio: " + messaggio + ".");
	}
	
	
	public static void main(String[] args) {
		
		ServizioNotifiche servizio = new ServizioNotifiche();
		
		servizio.inviaNotifica("benvenuto in vodafone!");
		servizio.inviaNotifica("berardig443@gmail.com", "abbiamo visualizzato il tuo CV");
		servizio.inviaNotifica(3452506601L, "ricarica effettuata con successo");
	}
}
