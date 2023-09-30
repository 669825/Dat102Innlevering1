package no.hvl.data102;
import java.util.ArrayList;
import java.lang.reflect.*;

import no.hvl.data102.adt.FilmarkivADT;
import no.hvl.data102.Film;

public class Filmarkiv implements FilmarkivADT {
	
private Film[] filmarkiv;
private int antallFilmer;
private final int arkivStr = 20;

/*konstruktør implementerer filmarkiv, tabell for å 
 * lagre Film objekter i
 * @param antallFilmer
 */
	public Filmarkiv(int lengde) {
		antallFilmer = 0;
		filmarkiv = new Film[lengde];
	}
	
	public Filmarkiv() {
		antallFilmer = 0;
		filmarkiv = new Film[arkivStr];
	}
	
	public Film[] getFilmarkiv() {
		return filmarkiv;
	}
	

	@Override
	public Film finnFilm(int nr) {
		
		for(int i = 0;i < antallFilmer;i++) {
			if(filmarkiv[i].getFilmnr() == nr) {
				 return filmarkiv[i];
			}
		}
		return null;
	}
	
	@Override
	public void leggTilFilm(Film nyFilm) {
		
		if(antallFilmer == filmarkiv.length) {
		utvid();
		
		}
		
		filmarkiv[antallFilmer] = nyFilm;
		antallFilmer++;
		trimTab(filmarkiv,antallFilmer);
		System.out.println("Filmen ble lagt til");
		
		}
	
	@Override
	public boolean slettFilm(int filmnr) {
		
		for(int i = 0;i < filmarkiv.length;i++) {
			if(filmarkiv[i].getFilmnr() == filmnr) {
				filmarkiv[i] = filmarkiv[antallFilmer - 1];
				antallFilmer--;
				return true;
			}
			}
		return false;
		}
	
	@Override
	public Film[] soekTittel(String delstreng) {
		
		int antall = 0;
		Film[] funnetTab = new Film[antall()];
		//lager ny tom FIlm tabell med plass til filmer som matcher delstreng
		
		//søker gjennom tabell,finner lik tittel,øker lengden på ny tabell ettersom elementer blir funnet
		for(int i = 0;i < antall();i++) {
			if(filmarkiv[i].getFilmtittel().toLowerCase().contains(delstreng.toLowerCase())) {
				funnetTab[i] = filmarkiv[i];
				antall++;
			}
			}
		return trimTab(funnetTab,antall);
	}
	
	@Override
	public Film[] soekProdusent(String delstreng) {
		
		int antall = 0;
		Film[] funnetTab = new Film[antall()];
		//lager ny tom FIlm tabell med plass til filmer som matcher delstreng
		
		//søker gjennom tabell,finner lik produsent,øker lengden på ny tabell ettersom elementer blir funnet
		for(int i = 0;i < antall();i++) {
			if(filmarkiv[i].getProdusent().toLowerCase().contains(delstreng.toLowerCase())) {
				funnetTab[i] = filmarkiv[i];
				antall++;
			}
			}
		return trimTab(funnetTab,antall);
	}
	
	@Override
	public int antall(Sjanger sjanger) {
		
		int antall = 0;
		
		for(int i=0;i<antall();i++) {
			if(filmarkiv[i].getSjanger() == sjanger) {
				antall++;
			}
		}
		return antall;
	}
	
	@Override
	public int antall() {
		return antallFilmer;
	}
	
	
	private void utvid() {
		
		int nylengde = filmarkiv.length*2;
		//utvider til dobbel lengde fra originaltabell
		Film[] temptab = new Film[nylengde];
		
		//overfører elementer til utvidet tabell
		for(int i=0;i<filmarkiv.length;i++) {
			temptab[i] = filmarkiv[i];
		}
			filmarkiv = temptab;
			System.out.println("tabellen ble utvidet");
		}
	
		
	private Film[] trimTab(Film[] tab, int n) {
		
		Film[] trimtab = new Film[n];
		
		for(int i=0;i<n;i++) {
			if(tab[i] != null) {
				trimtab[i] = tab[i];
			}
		}
		return trimtab;
		}
		
	
	

	public static void main(String[] args) {
		
		

		
	       
	}

	
	
	
	
	
	
	
	
	
	}


