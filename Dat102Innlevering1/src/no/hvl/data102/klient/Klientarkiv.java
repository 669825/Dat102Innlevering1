package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.Filmarkiv;
import no.hvl.data102.Filmarkiv2;
import no.hvl.data102.adt.FilmarkivADT;


public class Klientarkiv {

	public static void main(String[] args) {
		
		FilmarkivADT filma = new Filmarkiv(100);
		Meny meny = new Meny(filma);
		meny.start();
		meny.getTekstgr().visFilm(meny.getTekstgr().lesFilm());	
		}


	
}
