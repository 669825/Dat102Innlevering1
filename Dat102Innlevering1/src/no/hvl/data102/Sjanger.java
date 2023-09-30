package no.hvl.data102;

public enum Sjanger {
	
	ACTION, DRAMA, HISTORY, SCIFI;

	public static Sjanger finnSjanger(String navn) {
		
		Sjanger sj = null;
		//løper igjennom enum, sammenligner likhet: navn parameter med sjanger enum
		for(Sjanger s : Sjanger.values()) {
			
			if(s.toString().equals(navn.toUpperCase())) {
				sj = s;
				break;
				
			}
		}
		return sj;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
