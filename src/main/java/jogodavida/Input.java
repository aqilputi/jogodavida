package jogodavida;

/**
 * @author Carolina Arenas Okawa (NUSP: 10258876)
 * @autor Fernando Akio Tutume de Salles Pucci (NUSP: 8957197)
 * @author Pedro Henrique Siqueira de Oliveira (nº USP: 8922006)
 *
 */
public class Input {
	static public int handle(String inputstr) {
		if (inputstr.length() == 1) {
			if (inputstr.charAt(0) == 'c')
				return 1;
			if (inputstr.charAt(0) == 'q')
				return -1;
		}

		if (inputstr.length() == 3) {
			int x = Character.getNumericValue(inputstr.charAt(0));
			int space = inputstr.charAt(1);
			int y = Character.getNumericValue(inputstr.charAt(2));
			if (x < Conway.size && x >= 0)
				if (space == ' ')
					if (y < Conway.size && y >= 0)
						return 2;
		}

		throw new IllegalArgumentException(inputstr);
	}

}
