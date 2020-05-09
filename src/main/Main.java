package main;
import java.util.Scanner; 


public class Main {

	public static void main(String[] args) {
		Conway c = new Conway(6);
		Scanner scan = new Scanner(System.in);
		String s;
		int option = 0;
		
		while(true) {
			
			System.out.println("Digite o par de celula viva, `c` para continuar ou `q` "
					+ "para terminar o programa");
			s = scan.nextLine();
			try {
				option = Input.handle(s);
			}catch(IllegalArgumentException e) {
				System.out.println(e);
			}

				if (option == -1)
					break;
				
				if (option == 2) {
					c.createLife(Character.getNumericValue(s.charAt(0)),
							Character.getNumericValue(s.charAt(2)));
				}else {
					c.print();
					c.calcNextGen();
					c.updateGen();
				}
				c.print();
				
				
		}
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
