import java.util.ArrayList;
import java.util.Scanner;
public class Zadatak4 {

	public static void main(String[] args) {
		  ArrayList<String> lista = new ArrayList<>();
			Scanner unos = new Scanner(System.in);
			System.out.println("Unesite recenicu");
			String predzadnja="";
			
			while (unos.hasNextLine()) {
				String line=unos.nextLine();
				lista.add(line);
		
				for(int i=0;i<lista.size();i++) {
					 String[] words = line.split("[ ]+");
				predzadnja=words[words.length - 2];
					

				}
				 System.out.println("Predzadnja rijec je: "+predzadnja);
				
			}

	}

}
