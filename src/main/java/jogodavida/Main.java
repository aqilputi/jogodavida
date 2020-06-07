package jogodavida;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Conway c = new Conway();
		Scanner scan = new Scanner(System.in);
		String s;
		int option = 0;
		
		System.out.print("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n"
				+ "ou `q` para terminar o programa\n");
		while(option != -1) {	
			s = scan.nextLine();
			try {
				option = Input.handle(s);
			} catch(IllegalArgumentException e) {
				System.out.print("Valor inserido invalido, digite novamente\n");
			}

			if (option == 2) {
				c.createLife(Character.getNumericValue(s.charAt(0)),
						Character.getNumericValue(s.charAt(2)));
				c.print();
			}
			
			if (option == 1) {
				c.print();
				c.calcNextGen();
				c.updateGen();
				c.print();
			}

				
		}
		System.out.print("FIM\n");
		
		scan.close();

	}

}