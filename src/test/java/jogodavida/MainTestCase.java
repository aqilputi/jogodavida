package jogodavida;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Before;

public class MainTestCase {

	private InputStream inputStream;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}
		
	@org.junit.Test
	public void test1() {
		
		String input = "0 0\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
	    System.setIn(inputStream);
	    Main.main(null);
	    
	    assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n"
				+ "ou `q` para terminar o programa\n"
				+ "1 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n\n"
				+ "FIM\n", outContent.toString());
	}

	@org.junit.Test
	public void test2() {
		
		String input = "5 5\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
	    System.setIn(inputStream);
	    Main.main(null);
	    
	    assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n"
				+ "ou `q` para terminar o programa\n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 1 \n\n"
				+ "FIM\n", outContent.toString());
	}
	
	@org.junit.Test
	public void test3() {
		
		String input = "62\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
	    System.setIn(inputStream);
	    Main.main(null);
	    
	    assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n"
				+ "ou `q` para terminar o programa\n"
				+ "Valor inserido invalido, digite novamente\n"
				+ "FIM", outContent.toString());
	}
	
	@org.junit.Test
	public void test4() {
		
		String input = "a,6\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
	    System.setIn(inputStream);
	    Main.main(null);
	    
	    assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n"
				+ "ou `q` para terminar o programa\n"
				+ "Valor inserido invalido, digite novamente\n"
				+ "FIM", outContent.toString());
	}
	
	@org.junit.Test
	public void test5() {
		
		String input = "a b4\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
	    System.setIn(inputStream);
	    Main.main(null);
	    
	    assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n"
				+ "ou `q` para terminar o programa\n"
				+ "Valor inserido invalido, digite novamente\n"
				+ "FIM", outContent.toString());
	}

	@org.junit.Test
	public void test6() {
		
		String input = "c\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
	    System.setIn(inputStream);
	    Main.main(null);
	    
	    assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n"
				+ "ou `q` para terminar o programa\n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n\n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n\n"
				+ "FIM\n", outContent.toString());
	}
	
	@org.junit.Test
	public void test7() {
		
		String input = "q\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
	    System.setIn(inputStream);
	    Main.main(null);
	    
	    assertEquals("FIM", outContent.toString());
	}
	
	@org.junit.Test
	public void test8() {
		
		String input = "dd\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
	    System.setIn(inputStream);
	    Main.main(null);
	    
	    assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n"
				+ "ou `q` para terminar o programa\n"
				+ "Valor inserido invalido, digite novamente\n"
				+ "FIM", outContent.toString());
	}
	
	@org.junit.Test
	public void test9() {
		
		String input = "\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
	    System.setIn(inputStream);
	    Main.main(null);
	    
	    assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n"
				+ "ou `q` para terminar o programa\n"
				+ "Valor inserido invalido, digite novamente\n"
				+ "FIM", outContent.toString());
	}
}
