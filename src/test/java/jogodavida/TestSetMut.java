package jogodavida;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Before;

/**
 * @author Carolina Arenas Okawa (NUSP: 10258876)
 * @autor Fernando Akio Tutume de Salles Pucci (NUSP: 8957197)
 * @author Pedro Henrique Siqueira de Oliveira (nº USP: 8922006)
 *
 */
public class TestSetMut {

	private InputStream inputStream;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@org.junit.Test
	public void test1() {

		String input = "a\na\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
		System.setIn(inputStream);
		Main.main(null);

		assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n" + "ou `q` para terminar o programa\n"
				+ "Valor inserido invalido, digite novamente\n" + "Valor inserido invalido, digite novamente\n"
				+ "FIM\n", outContent.toString());
	}

	@org.junit.Test
	public void test2() {

		String input = "p\nr\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
		System.setIn(inputStream);
		Main.main(null);

		assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n" + "ou `q` para terminar o programa\n"
				+ "Valor inserido invalido, digite novamente\n" + "Valor inserido invalido, digite novamente\n"
				+ "FIM\n", outContent.toString());
	}

	@org.junit.Test
	public void test3() {

		String input = "5 0\n" + "5 5\n" + "5 4\n" + "4 5\n" + "q\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
		System.setIn(inputStream);
		Main.main(null);

		assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n" + "ou `q` para terminar o programa\n" + "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "1 0 0 0 0 0 \n\n"
				+ "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n"
				+ "1 0 0 0 0 1 \n\n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n" + "1 0 0 0 1 1 \n\n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n" + "0 0 0 0 0 1 \n" + "1 0 0 0 1 1 \n\n" + "FIM\n", outContent.toString());
	}

	@org.junit.Test
	public void test4() {

		String input = "6 6\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
		System.setIn(inputStream);
		Main.main(null);

		assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n" + "ou `q` para terminar o programa\n"
				+ "Valor inserido invalido, digite novamente\n" + "FIM\n", outContent.toString());
	}

	@org.junit.Test
	public void test5() {

		String input = "1 1\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
		System.setIn(inputStream);
		Main.main(null);

		assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n" + "ou `q` para terminar o programa\n" + "0 0 0 0 0 0 \n"
				+ "0 1 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n\n"
				+ "FIM\n", outContent.toString());
	}

	@org.junit.Test
	public void test6() {

		String input = "/ 2\n2 /\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
		System.setIn(inputStream);
		Main.main(null);

		assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n" + "ou `q` para terminar o programa\n"
				+ "Valor inserido invalido, digite novamente\n" + "Valor inserido invalido, digite novamente\n"
				+ "FIM\n", outContent.toString());
	}

	@org.junit.Test
	public void test7() {

		String input = "0 6\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
		System.setIn(inputStream);
		Main.main(null);

		assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n" + "ou `q` para terminar o programa\n"
				+ "Valor inserido invalido, digite novamente\n" + "FIM\n", outContent.toString());
	}

	@org.junit.Test
	public void test8() {

		String input = "6 0\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
		System.setIn(inputStream);
		Main.main(null);

		assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n" + "ou `q` para terminar o programa\n"
				+ "Valor inserido invalido, digite novamente\n" + "FIM\n", outContent.toString());
	}

	@org.junit.Test
	public void test9() {

		String input = "0 6\n6 0\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
		System.setIn(inputStream);
		Main.main(null);

		assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n" + "ou `q` para terminar o programa\n"
				+ "Valor inserido invalido, digite novamente\n" + "Valor inserido invalido, digite novamente\n"
				+ "FIM\n", outContent.toString());
	}

	@org.junit.Test
	public void test10() {

		String input = "0!0\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
		System.setIn(inputStream);
		Main.main(null);

		assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n" + "ou `q` para terminar o programa\n"
				+ "Valor inserido invalido, digite novamente\n" + "FIM\n", outContent.toString());
	}

	@org.junit.Test
	public void test11() {

		String input = "0 0\n" + "0 1\n" + "0 2\n" + "1 0\n" + "1 1\n" + "1 2\n" + "2 0\n" + "2 1\n" + "2 2\n" + "c\n"
				+ "5 5\n" + "4 5\n" + "3 5\n" + "5 4\n" + "4 4\n" + "3 4\n" + "5 3\n" + "4 3\n" + "3 3\n"
				+ "c\nc\nc\nc\nc\nc\n" + "q\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
		System.setIn(inputStream);
		Main.main(null);

		assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n" + "ou `q` para terminar o programa\n" + "1 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n\n"
				+ "1 1 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n\n" + "1 1 1 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n\n" + "1 1 1 0 0 0 \n" + "1 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n\n" + "1 1 1 0 0 0 \n" + "1 1 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n\n" + "1 1 1 0 0 0 \n"
				+ "1 1 1 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n\n"
				+ "1 1 1 0 0 0 \n" + "1 1 1 0 0 0 \n" + "1 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n\n" + "1 1 1 0 0 0 \n" + "1 1 1 0 0 0 \n" + "1 1 0 0 0 0 \n" + "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n\n" + "1 1 1 0 0 0 \n" + "1 1 1 0 0 0 \n" + "1 1 1 0 0 0 \n"
				+ "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n\n" + "1 1 1 0 0 0 \n" + "1 1 1 0 0 0 \n"
				+ "1 1 1 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n\n" + "1 0 1 0 0 0 \n"
				+ "0 0 0 1 0 0 \n" + "1 0 1 0 0 0 \n" + "0 1 0 0 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n\n"
				+ "1 0 1 0 0 0 \n" + "0 0 0 1 0 0 \n" + "1 0 1 0 0 0 \n" + "0 1 0 0 0 0 \n" + "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 1 \n\n" + "1 0 1 0 0 0 \n" + "0 0 0 1 0 0 \n" + "1 0 1 0 0 0 \n" + "0 1 0 0 0 0 \n"
				+ "0 0 0 0 0 1 \n" + "0 0 0 0 0 1 \n\n" + "1 0 1 0 0 0 \n" + "0 0 0 1 0 0 \n" + "1 0 1 0 0 0 \n"
				+ "0 1 0 0 0 1 \n" + "0 0 0 0 0 1 \n" + "0 0 0 0 0 1 \n\n" + "1 0 1 0 0 0 \n" + "0 0 0 1 0 0 \n"
				+ "1 0 1 0 0 0 \n" + "0 1 0 0 0 1 \n" + "0 0 0 0 0 1 \n" + "0 0 0 0 1 1 \n\n" + "1 0 1 0 0 0 \n"
				+ "0 0 0 1 0 0 \n" + "1 0 1 0 0 0 \n" + "0 1 0 0 0 1 \n" + "0 0 0 0 1 1 \n" + "0 0 0 0 1 1 \n\n"
				+ "1 0 1 0 0 0 \n" + "0 0 0 1 0 0 \n" + "1 0 1 0 0 0 \n" + "0 1 0 0 1 1 \n" + "0 0 0 0 1 1 \n"
				+ "0 0 0 0 1 1 \n\n" + "1 0 1 0 0 0 \n" + "0 0 0 1 0 0 \n" + "1 0 1 0 0 0 \n" + "0 1 0 0 1 1 \n"
				+ "0 0 0 0 1 1 \n" + "0 0 0 1 1 1 \n\n" + "1 0 1 0 0 0 \n" + "0 0 0 1 0 0 \n" + "1 0 1 0 0 0 \n"
				+ "0 1 0 0 1 1 \n" + "0 0 0 1 1 1 \n" + "0 0 0 1 1 1 \n\n" + "1 0 1 0 0 0 \n" + "0 0 0 1 0 0 \n"
				+ "1 0 1 0 0 0 \n" + "0 1 0 1 1 1 \n" + "0 0 0 1 1 1 \n" + "0 0 0 1 1 1 \n\n" + "1 0 1 0 0 0 \n"
				+ "0 0 0 1 0 0 \n" + "1 0 1 0 0 0 \n" + "0 1 0 1 1 1 \n" + "0 0 0 1 1 1 \n" + "0 0 0 1 1 1 \n\n"
				+ "0 0 0 0 0 0 \n" + "0 0 1 1 0 0 \n" + "0 1 1 0 0 0 \n" + "0 1 0 0 0 1 \n" + "0 0 0 0 0 0 \n"
				+ "0 0 0 1 0 1 \n\n" + "0 0 0 0 0 0 \n" + "0 0 1 1 0 0 \n" + "0 1 1 0 0 0 \n" + "0 1 0 0 0 1 \n"
				+ "0 0 0 0 0 0 \n" + "0 0 0 1 0 1 \n\n" + "0 0 0 0 0 0 \n" + "0 1 1 1 0 0 \n" + "0 1 0 1 0 0 \n"
				+ "0 1 1 0 0 0 \n" + "0 0 0 0 1 0 \n" + "0 0 0 0 0 0 \n\n" + "0 0 0 0 0 0 \n" + "0 1 1 1 0 0 \n"
				+ "0 1 0 1 0 0 \n" + "0 1 1 0 0 0 \n" + "0 0 0 0 1 0 \n" + "0 0 0 0 0 0 \n\n" + "0 0 1 0 0 0 \n"
				+ "0 1 0 1 0 0 \n" + "1 0 0 1 0 0 \n" + "0 1 1 1 0 0 \n" + "0 0 0 0 0 0 \n" + "0 0 0 0 0 0 \n\n"
				+ "0 0 1 0 0 0 \n" + "0 1 0 1 0 0 \n" + "1 0 0 1 0 0 \n" + "0 1 1 1 0 0 \n" + "0 0 0 0 0 0 \n"
				+ "0 0 0 0 0 0 \n\n" + "0 0 1 0 0 0 \n" + "0 1 0 1 0 0 \n" + "1 0 0 1 1 0 \n" + "0 1 1 1 0 0 \n"
				+ "0 0 1 0 0 0 \n" + "0 0 0 0 0 0 \n\n" + "0 0 1 0 0 0 \n" + "0 1 0 1 0 0 \n" + "1 0 0 1 1 0 \n"
				+ "0 1 1 1 0 0 \n" + "0 0 1 0 0 0 \n" + "0 0 0 0 0 0 \n\n" + "0 0 1 0 0 0 \n" + "0 1 0 1 1 0 \n"
				+ "1 0 0 0 1 0 \n" + "0 1 0 0 1 0 \n" + "0 1 1 1 0 0 \n" + "0 0 0 0 0 0 \n\n" + "0 0 1 0 0 0 \n"
				+ "0 1 0 1 1 0 \n" + "1 0 0 0 1 0 \n" + "0 1 0 0 1 0 \n" + "0 1 1 1 0 0 \n" + "0 0 0 0 0 0 \n\n"
				+ "0 0 1 1 0 0 \n" + "0 1 1 1 1 0 \n" + "1 1 1 0 1 1 \n" + "1 1 0 0 1 0 \n" + "0 1 1 1 0 0 \n"
				+ "0 0 1 0 0 0 \n\n" + "FIM\n", outContent.toString());
	}

	@org.junit.Test
	public void test12() {

		String input = "0 ¾\nq\n";
		inputStream = new ByteArrayInputStream(input.getBytes());
		System.setIn(inputStream);
		Main.main(null);

		assertEquals("Digite \n"
				+ "ou as coordenadas de uma celular vira no formato 'x y' separados por espaco (0 <= x, y <= 5),\n"
				+ "ou `c` para continuar, \n" + "ou `q` para terminar o programa\n"
				+ "Valor inserido invalido, digite novamente\n" + "FIM\n", outContent.toString());
	}

}
