import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
	
Array array=new Array();
		
System.out.println("Unesite niz");

int niz[]=new int[10];
for(int i=0; i<niz.length;i++) {
	niz[i]=unos.nextInt();
System.out.println(array.najmanji(niz));
System.out.println(array.najveci(niz));
System.out.println(array.najveci(niz));


	}

}
}
