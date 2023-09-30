package no.hvl.data102.klient;

import java.util.Scanner;
import no.hvl.data102.Film;
import no.hvl.data102.Filmarkiv;
import no.hvl.data102.klient.*;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;



public class Tekstgrensesnitt {
	
	private FilmarkivADT filma;

	
	public Film lesFilm(){
		
		//oppretter scanner objekt, scanner input fra bruker
		System.out.println("Oppgi filmtittel: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		Film[] temptab = filma.soekTittel(input);
		for(Film f : temptab) {
		if(f.getFilmtittel().equalsIgnoreCase(input)) {
				return f;
			}else {
			System.out.println("Filmen eksisterer ikke i arkivet");
			}
		}
	
		return null;
	}

	
	
	
	// vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void visFilm(Film film) {

		if(film != null) {
			System.out.println(film.toString());
		} else {
			//
			System.out.println("Filmen eksisterer ikke i arkivet");
		
			}
		}
	
		
	// Skrive ut alle Filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT filma,String delstreng) {
		Film[] nytab = filma.soekTittel(delstreng);
		for(Film i : nytab) {
			System.out.println(i.getFilmtittel());
			}
		}
		
	// Skriver ut alle Filmer av en produsent
	public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {
		
		Film[] nytab = filma.soekTittel(delstreng);
	
		for(int i=0;i<nytab.length;i++) {
			if(nytab[i].getProdusent().equalsIgnoreCase(delstreng)){
				System.out.println("Tittel: "+nytab[i].getFilmtittel()+"/n"); 
			}
		}
	}
	
	// Skrive ut en enkel statistikk som inneholder antall Filmer totalt
	// og hvor mange det er i hver sjanger
	public void skrivUtStatistikk(FilmarkivADT filma) {
		
			if(filma != null) {
				
				System.out.println
				("Det er " + filma.antall() + " filmer i arkivet" + "\n" +
			
				   "Action:		" + filma.antall(Sjanger.ACTION) + "\n" +
				   "Drama:		" + filma.antall(Sjanger.DRAMA) + "\n" +
				   "Historie:	" + filma.antall(Sjanger.HISTORY) + "\n" +
				   "Sci-Fi:		" + filma.antall(Sjanger.SCIFI));	
			} else {
				System.out.println("ingen filmer i arkivet");
			}
			
	}
			
		
	
	}
	
	// … Ev. andre metoder
	

