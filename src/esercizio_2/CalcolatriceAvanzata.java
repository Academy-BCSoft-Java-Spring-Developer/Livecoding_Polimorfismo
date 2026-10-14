package esercizio_2;

public class CalcolatriceAvanzata {

	//SOMMMA
	public double somma(double n1, double n2) {
		return n1 + n2;
	}
	
	public double somma(double n1, double n2, double n3) {
		return n1 + n2 + n3;
	}
	
	public double somma(double[] numeri) {
		if(numeri == null || numeri.length == 0) {
			return 0.0;
		}
		
		double totale = 0.0;
		for(double n : numeri) {
			totale += n;
		}
		
		return totale;
	}
	
	
	//SOTTRAZIONE
		public double sottrazione(double n1, double n2) {
			return n1 - n2;
		}

		public double sottrazione(double n1, double n2, double n3) {
			return n1 - n2 - n3;
		}

		public double sottrazione(double[] numeri) {
			if (numeri == null || numeri.length == 0) {
				return 0.0;
			}

			double totale = numeri[0];
			for (int i = 1; i < numeri.length; i++) {
				totale -= numeri[i];
			}

			return totale;
		}


		//MOLTIPLICAZIONE
		public double moltiplicazione(double n1, double n2) {
			return n1 * n2;
		}

		public double moltiplicazione(double n1, double n2, double n3) {
			return n1 * n2 * n3;
		}

		public double moltiplicazione(double[] numeri) {
			if (numeri == null || numeri.length == 0) {
				return 0.0;
			}

			double totale = numeri[0];
			for (int i = 1; i < numeri.length; i++) {
				totale *= numeri[i];
			}

			return totale;
		}


		//DIVISIONE
		public double divisione(double n1, double n2) {
			if (n2 == 0.0) {
				System.err.println("Errore: divisione per zero");
				return Double.NaN;
			}
			return n1 / n2;
		}

		public double divisione(double n1, double n2, double n3) {
			if (n2 == 0.0 || n3 == 0.0) {
				System.err.println("Errore: divisione per zero");
				return Double.NaN;
			}
			return n1 / n2 / n3;
		}

		public double divisione(double[] numeri) {
			if (numeri == null || numeri.length == 0) {
				return 0.0;
			}

			double totale = numeri[0];
			for (int i = 1; i < numeri.length; i++) {
				if (numeri[i] == 0.0) {
					System.err.println("Errore: divisione per zero all'indice " + i);
					return Double.NaN;
				}
				totale /= numeri[i];
			}

			return totale;
		}

	}
