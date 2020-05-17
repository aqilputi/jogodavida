package jogodavida;

public class Conway {
	boolean[][][] world;
	
	public Conway(int gamesize) {
		world = new boolean[gamesize][gamesize][2];
	}
	
	public int createLife(int x, int y) {
		world[x][y][0] = true;
		return 0;
	}
	
	public int updateGen() {
		for(boolean[][] row : world) {
			for(boolean[] cell : row) {
				cell[0] = cell[1];
				cell[1] = false;
			}
		}
		return 0;
	}
	
	public int calcNextGen() {
		for(int i = 0; i < world.length; i++) {
			for(int j = 0; j < world.length; j++) {
				if(tryReviveCell(world[i][j], i, j))
					world[i][j][1] = true;
			}
			
		}
		return 0;
	}
	
	private int countNeighbors(int x, int y) {
		// x x x
		// x 0 x  necessario checar todos os vizinhos (se possivel)
		// x x x
		int count = 0;
		//diagonal superior esquerda
		if(x > 0 && y > 0)
			if(world[x-1][y-1][0] == true)
				count++;
		//esquerda
		if(x > 0)
			if(world[x-1][y][0] == true)
				count++;
		//diagonal inferior esquerda
		if(x > 0 && y < world.length-1)
			if(world[x-1][y+1][0] == true)
				count++;
		//cima
		if(y > 0)
			if(world[x][y-1][0] == true)
				count++;
		//baixo
		if(y < world.length-1)
			if(world[x][y+1][0] == true)
				count++;
		//diagonal superior direita
		if(x < world.length-1 && y > 0)
			if(world[x+1][y-1][0] == true)
				count++;
		//direita
		if(x < world.length-1)
			if(world[x+1][y][0] == true)
				count++;
		//diagonal inferior direita
		if(x < world.length-1 && y < world.length-1)
			if(world[x+1][y+1][0] == true)
				count++;
		
		return count;
	}
	
	private boolean tryReviveCell(boolean[] cell, int x, int y) {
		int count = countNeighbors(x,y);
		
		if(cell[0] == true) { //celula ja viva
			if(count == 2 || count == 3)
				return true;
		}else
			if(count == 3)
				return true;
		
		//nao foi possivel reviver celula
		return false;
	}
		
	public void print() {
		System.out.flush();  
		for(int i=0; i < world.length; i++) {
			for(int j=0; j < world.length; j++) {
				if(world[i][j][0] == true)
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
