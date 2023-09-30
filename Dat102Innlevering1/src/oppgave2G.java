
public class oppgave2G {

	
	
/* T(n)(metoden av tid()) vil ha en vekstfaktor på c*n, der c vil
stå for konstanten 5, siden k = k+5. k vil øke i verdi ettersom n øker.
	*/
	
	
	
	public static void tid(long n) {
		
		long k = 0;
		for (long i = 1; i <= n; i++) {
		k = k + 5;
		}
	}

	public static void main(String[] args) {
		long n = 1000000000;
		int a = 100;
		double sum = 0; 
	
		
		for(int i=0; i<a;i++) {
		double tid = System.currentTimeMillis();
		tid(n);
		tid = System.currentTimeMillis() - tid;
		sum += tid;
		}
		double y = sum/a;
		System.out.println(y);
	}

}
