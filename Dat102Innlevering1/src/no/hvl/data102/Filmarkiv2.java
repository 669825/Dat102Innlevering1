package no.hvl.data102;
import no.hvl.data102.adt.FilmarkivADT;

import java.io.PrintStream;

import no.hvl.data102.LinearNode;

public class Filmarkiv2 implements FilmarkivADT { 
	
	private int antall;
	private LinearNode<Film> start;
	

	//oppretter en tom node
	public Filmarkiv2() {
		antall = 0;
		start = null;
	}
	
	
	@Override
	public Film finnFilm(int nr) {
		
		LinearNode<Film> tempNode = start;
	
		try {
		while(tempNode != null && nr != tempNode.getElement().getFilmnr()) {
			tempNode = tempNode.getNeste();
			//sammenligner elementer dersom ikke nullverdi
			if(tempNode.getElement().getFilmnr() == nr) {
				return tempNode.getElement();
			}
		}
		}catch(NullPointerException e) {}
		return null;
	}
	
	@Override
	public void leggTilFilm(Film nyFilm) {
	//oppretter ny node
	LinearNode<Film> nyNode = new LinearNode<>(nyFilm);
	
	nyNode.setNeste(start);
	start = nyNode;
	antall++;
	}
	
	@Override
	public boolean slettFilm(int filmnr) {
		
		LinearNode<Film> hold = start, prev = null;

		try {
			while (hold.getElement() != null) {
				if (start.getElement().getFilmnr() == filmnr) {
					start = start.getNeste();
					antall--;
					return true;
				}

				if ((hold.getElement()).getFilmnr() == filmnr) {
					prev.setNeste(hold.getNeste());
					hold.setNeste(hold);
					antall--;
					return true;
				} else {
					prev = hold;
					hold = hold.getNeste();
				}
			}
		} catch (NullPointerException e) {
		}
		return false;
	}
	
	
	
	public Film[] soekTittel(String delstreng) {
		
		LinearNode<Film> tempNode = start;
		Film[] temptab = new Film[antall];
		int n=0;
		
		try {
		while(tempNode != null && delstreng != tempNode.getElement().getFilmtittel()) {
			tempNode = tempNode.getNeste();
			
			if(tempNode.getElement().getFilmtittel() == delstreng) {
				for(int i=0;i<antall-1;i++) {
					temptab[i] = tempNode.getElement();
					n++;
					
			}
		}return trimTab(temptab,n);
			
	}
		}catch(NullPointerException e) {}
		return null;
		
	}
	
	
	
	@Override
	public Film[] soekProdusent(String delstreng) {
		
		LinearNode<Film> tempNode = start;
		Film[] temptab = new Film[antall];
		int n=0;
		
		try {
		while(tempNode != null && delstreng != tempNode.getElement().getProdusent()) {
			tempNode = tempNode.getNeste();
			
			if(tempNode.getElement().getProdusent() == delstreng) {
				for(int i=0;i<antall-1;i++) {
					temptab[i] = tempNode.getElement();
					n++;
					
			}
		}return trimTab(temptab,n);
			
	}
		}catch(NullPointerException e) {}
		return null;
		
	}
		

//i) I Metoden antallSjanger(Sjanger sjanger) 
//vil ha en tidskompleksitet på O(n) fordi den må gå gjennom 
//alle filmer i filmarkivet for å telle antall filmer i den 
//spesifikke sjangeren. Dette vil ta tid som er proporsjonal 
//med antall filmer i filmarkivet.
     @Override
     public int antall(Sjanger sjanger) {
    	 
    	 int antall = 0;//antall elemnter av sjangre som matcher tekststrengen sjanger
    	 LinearNode<Film> tempNode = start;
    	
    	 while(tempNode.getElement() != null && tempNode.getElement().getSjanger() != sjanger) {
    		 tempNode = tempNode.getNeste();
		
    		 if(tempNode.getElement().getSjanger() == sjanger) {
    			 antall++;
    		 }
    		 
    	 }
    		return antall;
    	 }
    	 
    	 
     
     
     @Override
 	public int antall() {
    	 return antall;
 		
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
     
    
//ii) Metoden skrivUtStatistikk(FilmarkivADT film) vil ha en 
//tidskompleksitet på O(k*n) fordi den må gå gjennom alle 
//sjangrene og så gjennom alle filmer for å telle antall 
//filmer i hver sjanger. Dette vil ta tid som er proporsjonal 
//med antall sjangre multiplisert med antall filmer i filmarkivet.
     
     public void skrivUtStatistikk(FilmarkivADT film) {
	//lager en int tabell for å oppbevare antall element
    	 int[] sjTab = new int[Sjanger.values().length];
    	 LinearNode<Film> tempNode = start;
    	 
    	 try {
    	 while(tempNode != null) {
	//henter int verdien av sjanger, som korresponderer med int av sjanger i filmtab listen
    		 sjTab[tempNode.getElement().getSjanger().ordinal()]++;
	//sjekker neste film i listen, gjennom neste node
    		 tempNode = tempNode.getNeste();
    		 }
//skriver ut sjangre og antall elementer av hver sjanger
    	 for(int i = 0; i < sjTab.length; i++) {
    		 System.out.println(Sjanger.values()[i] + ": " + sjTab[i]);
    	 }
   }catch(NullPointerException e){}
   }
     
     public boolean ledig() {
    	 boolean ledig = true;
    	 
    	 if(antall() >= antall) {
    		 ledig = false;
	}
	return ledig;
	
     }
     
     public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {
    	 LinearNode<Film> tempNode = start;
    	 
    	 while(tempNode != null) {
    		 if(tempNode.getElement().getProdusent().equals(delstreng)) {
			System.out.println(tempNode.getElement().getFilmtittel());
		}
		tempNode = tempNode.getNeste();
	}
}


	public static void main(String[] args) {
		
	


}


	



}
