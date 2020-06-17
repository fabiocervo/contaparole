package it.dstech.service;

public class Contatore {
	private String frase;

	public Contatore(String frase) {
		this.frase = frase;
	}

	public String[] splitter() {
		return frase.split(" ");
	}

	public int contaParole(String frase) {
		return splitter().length;
	}

	public int contaVocali(String testo) {
		testo = frase.toLowerCase();
		int contatore = 0;
		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o'
					|| frase.charAt(i) == 'u') {
				contatore++;

			}

		}
		return contatore;
	}

	public int contaConsonanti(String testo) {
		testo = frase.toLowerCase();
		int contatore = 0;
		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) != 'a' || frase.charAt(i) != 'e' || frase.charAt(i) != 'i' || frase.charAt(i) != 'o'
					|| frase.charAt(i) != 'u') {
				contatore++;

			}

		}
		return contatore;
	}
}