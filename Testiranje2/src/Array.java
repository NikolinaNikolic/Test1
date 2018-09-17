
public class Array {
	
	public int najmanji(int niz[]) {
		
	int min = niz[0];
	
	for (int i = 0; i < niz.length; i++) {	 	
			
	
	if (niz[i] <min) {
	min = niz[i];
	
		}}
	return min;
		
}
	
	public int najveci(int niz[]) {
		
		int max = niz[0];
		
		for (int i = 0; i < niz.length; i++) {		
			
		
		if (niz[i] >max) {
		max = niz[i];
		}
			}
		return max;

	}
	
	public int zbir(int niz[]) {
		
		int zbir =niz[0];
		
		for (int i = 0; i < niz.length; i++) {	 
				
		zbir+=niz[i];
}
		return zbir;
		}}