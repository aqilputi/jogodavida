package jogodavida;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Conway c = new Conway(6);
		Scanner scan = new Scanner(System.in);
		String s;
		int option = 0;
		
		System.out.println("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n"
				+ "ou `q` para terminar o programa");
		while(true) {	
			s = scan.nextLine();
			try {
				option = Input.handle(s);
			}catch(IllegalArgumentException e) {
				System.out.println("Valor inserido invalido, digite novamente");
				option = -1;
			}

				if (option == 2) {
					c.createLife(Character.getNumericValue(s.charAt(0)),
							Character.getNumericValue(s.charAt(2)));
					c.print();
				}
				if (option == 1){
					c.print();
					c.calcNextGen();
					c.updateGen();
					c.print();
				}
				if (option == -1) {
					break;
				}
				
		}
		System.out.println("FIM");

		/*
		c.createLife(2, 2);
		c.createLife(3, 2);
		c.createLife(4, 2);
		c.print();
		c.calcNextGen();
		c.updateGen();
		c.print();
		c.calcNextGen();
		c.updateGen();
		c.print();
		*/
		
		// TODO Auto-generated method stub

	}

}