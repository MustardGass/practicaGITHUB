import java.io.IOException;
import java.util.Scanner;

public class lletres {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escriu una frase");
		String frase = leer.nextLine();
		System.out.println(frase);
		
		
		Scanner llegir = new Scanner(System.in);
		System.out.println("Indica una lletra que vulguis treure de la frase");
		String lletra = llegir.nextLine();
		
		
		
		if (lletra.length() <= 1) {
			if (frase.contains(lletra) == true) {
				System.out.println("Aquest és el resultat");
				System.out.println(frase.replaceAll(lletra, "*"));
			}
			
			else {
				System.out.println("El caràcter no es troba a la frase");
			}
		}
			
		else System.out.println("Només pots insertar una lletra a canviar");
		
				
	}

	

}
