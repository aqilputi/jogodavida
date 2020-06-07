package jogodavida;

public class Conway {
	public static int size = 6;

	boolean[][][] world;

	public Conway() {
		world = new boolean[Conway.size][Conway.size][2];
	}

	// changed return to void to kill mutant
	public void createLife(int x, int y) {
		world[x][y][0] = true;
	}

	// changed return to void to kill mutant
	public void updateGen() {
		for (boolean[][] row : world) {
			for (boolean[] cell : row) {
				cell[0] = cell[1];
				cell[1] = false;
			}
		}
	}

	// changed return to void to kill mutant
	public void calcNextGen() {
		for (int i = 0; i < world.length; i++) {
			for (int j = 0; j < world.length; j++) {
				if (tryReviveCell(world[i][j], i, j))
					world[i][j][1] = true;
			}

		}
	}

	private int countNeighbors(int x, int y) {
		// x x x
		// x 0 x necessario checar todos os vizinhos (se possivel)
		// x x x
		int count = 0;
		// diagonal superior esquerda
		if (x > 0 && y > 0)
			if (world[x - 1][y - 1][0])
				count++;
		// esquerda
		if (x > 0)
			if (world[x - 1][y][0])
				count++;
		// diagonal inferior esquerda
		if (x > 0 && y < world.length - 1)
			if (world[x - 1][y + 1][0])
				count++;
		// cima
		if (y > 0)
			if (world[x][y - 1][0])
				count++;
		// baixo
		if (y < world.length - 1)
			if (world[x][y + 1][0])
				count++;
		// diagonal superior direita
		if (x < world.length - 1 && y > 0)
			if (world[x + 1][y - 1][0])
				count++;
		// direita
		if (x < world.length - 1)
			if (world[x + 1][y][0])
				count++;
		// diagonal inferior direita
		if (x < world.length - 1 && y < world.length - 1)
			if (world[x + 1][y + 1][0])
				count++;

		return count;
	}

	private boolean tryReviveCell(boolean[] cell, int x, int y) {
		int count = countNeighbors(x, y);

		if (cell[0]) { // celula ja viva
			if (count == 2 || count == 3)
				return true;
		} else if (count == 3) {
			return true;
		}
		// nao foi possivel reviver celula
		return false;
	}

	public void print() {
		for (int i = 0; i < world.length; i++) {
			for (int j = 0; j < world.length; j++) {
				if (world[i][j][0])
					System.out.print("1");
				else
					System.out.print("0");
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
