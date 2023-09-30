package no.hvl.data102;

import java.util.Objects;

public class Film {
	
	private int filmnr, aar;
	private String produsent, filmtittel, filmselskap;
	private Sjanger sjanger;
	
	
	/*konstruktør med alle objektvariablene som parametre*/
	public Film(int filmnr,int aar, String produsent,String filmtittel, String filmselskap,Sjanger sjanger) {
		
		this.filmnr = filmnr;
		this.aar = aar;
		this.produsent = produsent;
		this.filmtittel = filmtittel;
		this.filmselskap = filmselskap;
		this.sjanger = sjanger;
		
	}
	
	//tom konstruktør
	public Film() {
		
	}
	
	
	public int getFilmnr() {
		return filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getProdusent() {
		return produsent;
	}

	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}

	public String getFilmtittel() {
		return filmtittel;
	}

	public void setFilmtittel(String filmtittel) {
		this.filmtittel = filmtittel;
	}

	public int getAar() {
		return aar;
	}

	public void setAar(int aar) {
		this.aar = aar;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}

	public String getFilmselskap() {
		return filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}
	
	
	@Override
	public int hashCode() {
		Integer temp = filmnr;
		return temp.hashCode();
	}

	@Override
	public boolean equals(Object film) {
		if (this == film) {
			return true;
		}
		if (film == null) {
			return false;
		}
		
		if (getClass() != film.getClass()) {
			return false;
		}
		
		Film annen = (Film) film;
		
		boolean like = getFilmnr() == annen.getFilmnr();	
		return like;
	}
	
	
	@Override
	public String toString() {
		return "Film [filmnr=" + filmnr + ", produsent=" + produsent + ", filmtittel=" + filmtittel + ", aar=" + aar
				+ ", sjanger=" + sjanger + ", filmselskap=" + filmselskap + "]";
	}

	public static void main(String[] args) {

		

	}

}
