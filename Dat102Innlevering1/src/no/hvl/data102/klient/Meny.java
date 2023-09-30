package no.hvl.data102.klient;

import no.hvl.data102.adt.*;
import no.hvl.data102.Film;
import no.hvl.data102.Filmarkiv;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;

public class Meny {
	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;
	
	
	public Meny(FilmarkivADT filmarkiv){
	tekstgr = new Tekstgrensesnitt();
	this.filmarkiv = filmarkiv;
	
	}
	public void start(){
		
		filmarkiv.leggTilFilm(new Film(1, 2005, "Christopher Nolan", "Batman Begins", "Warner Bros", Sjanger.ACTION));
		filmarkiv.leggTilFilm(new Film(2, 2010, "David Fincher", "The Social Network", "Columbia Pictures", Sjanger.DRAMA));
		filmarkiv.leggTilFilm(new Film(3, 2008, "John Doe", "Iron Man", "Marvel Studios", Sjanger.ACTION));
		filmarkiv.leggTilFilm(new Film(4, 2013, "Francis Lawrence", "The Hunger Games: Catching Fire", "Lionsgate", Sjanger.ACTION));
		filmarkiv.leggTilFilm(new Film(5, 2012, "Joss Whedon", "The Avengers", "Marvel Studios", Sjanger.ACTION));
		filmarkiv.leggTilFilm(new Film(6, 2010, "John Doe", "The Matrix Revolutions", "Warner Bros", Sjanger.SCIFI));
		filmarkiv.leggTilFilm(new Film(7, 2005, "Jane Smith", "The Dark Knight", "DC Comics", Sjanger.ACTION));
		filmarkiv.leggTilFilm(new Film(8, 2014, "Christopher Nolan", "Interstellar", "Paramount Pictures", Sjanger.SCIFI));
		filmarkiv.leggTilFilm(new Film(9, 2009, "James Cameron", "Avatar", "Twentieth Century Fox", Sjanger.SCIFI));
		filmarkiv.leggTilFilm(new Film(10, 2018, "Ryan Coogler", "Black Panther", "Marvel Studios", Sjanger.ACTION));
		
      
	}
	public Tekstgrensesnitt getTekstgr() {
		return tekstgr;
	}
	public void setTekstgr(Tekstgrensesnitt tekstgr) {
		this.tekstgr = tekstgr;
	}
	
	public FilmarkivADT getFilmarkiv() {
		return filmarkiv;
	}
	public void setFilmarkiv(FilmarkivADT filmarkiv) {
		this.filmarkiv = filmarkiv;
	}
	        
}
