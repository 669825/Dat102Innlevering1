package no.hvl.data102.koeTest;


//********************************************************************
// 
//  Representerer en samling k� implementer vha kjedet struktur
//********************************************************************

public class KjedetKoe<T> implements KoeADT<T> {
	
	private LinearNode<T> foran, bak;

	/******************************************************************
	 * Oppretter en tom k�.
	 ******************************************************************/
	public KjedetKoe() {
		foran = bak = null;
	}

	/******************************************************************
	 * Legger inn et spesifisert element i k�en.
	 ******************************************************************/
	@Override
	public void innKoe(T element) {
		LinearNode<T> nyNode = new LinearNode<T>(element);
		
//sjekker om første og siste node er lik null, kø er tom. Setter i såfall nynode foran
		if (erTom()) {
			foran = nyNode;
			//ellers, setter nynode sist i køen
		} else {
			bak.setNeste(nyNode);
		}

		bak = nyNode;
	}

	/******************************************************************
	 * Fjerner og returnerer elementet foran i k�en.
	 ******************************************************************/
	@Override
	public T utKoe() {
		if (erTom())
			throw new EmptyCollectionException("koe");

		T resultat = foran.getElement();
		foran = foran.getNeste();

		if (foran == null) {
			bak = null;
		}
		return resultat;
	}

	/******************************************************************
	 * Returnerer elementet foran i k�en ute � fjerne det.
	 ******************************************************************/
	@Override
	public T foerste() {
		if (erTom())
			throw new EmptyCollectionException("koe");

		T resultat = foran.getElement();
		return resultat;
	}

	/******************************************************************
	 * Returnerer sann hvis k�en er tom, usann ellers.
	 ******************************************************************/
	@Override
	public boolean erTom() {
		return (foran == null && (bak == null));
	}

	/******************************************************************
	 * Returnerer en strengrepresentasjon av elementene i k�en.
	 ******************************************************************/
	public String toString() {
		String resultat = "";
		LinearNode<T> aktuell = foran;

		while (aktuell != null) {
			resultat = resultat + (aktuell.getElement()).toString() + "\n";
			aktuell = aktuell.getNeste();
		}

		return resultat;
	}
	
	
	public static void main(String[] args) {
		
		Kjedet<String> koe = new kjedetkoe<>();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}// class
