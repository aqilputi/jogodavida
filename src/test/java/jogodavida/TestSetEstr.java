package jogodavida;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Before;

public class TestSetEstr {

	private InputStream inputStream;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}
	
	@org.junit.Test
	public void test1() {
		
		String input = "0 0\n"
				+ "0 1\n"
				+ "0 2\n"
				+ "1 0\n"
				+ "1 1\n"
				+ "1 2\n"
				+ "2 0\n"
				+ "2 1\n"
				+ "2 2\n"
				+ "c\n"
				+ "q\n";
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
				+ "1 1 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n\n"
				+ "1 1 1 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n\n"
				+ "1 1 1 0 0 0 \n"
				+ "1 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n\n"
				+ "1 1 1 0 0 0 \n"
				+ "1 1 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n\n"
				+ "1 1 1 0 0 0 \n"
				+ "1 1 1 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n\n"
				+ "1 1 1 0 0 0 \n"
				+ "1 1 1 0 0 0 \n"
				+ "1 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n\n"
				+ "1 1 1 0 0 0 \n"
				+ "1 1 1 0 0 0 \n"
				+ "1 1 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n\n"
				+ "1 1 1 0 0 0 \n"
				+ "1 1 1 0 0 0 \n"
				+ "1 1 1 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n\n"
				+ "1 1 1 0 0 0 \n"
				+ "1 1 1 0 0 0 \n"
				+ "1 1 1 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n\n"
				+ "1 0 1 0 0 0 \n"
				+ "0 0 0 1 0 0 \n"
				+ "1 0 1 0 0 0 \n"
				+ "0 1 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n\n"
				+ "FIM\n", outContent.toString());
	}


}
