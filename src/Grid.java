public class Grid {

	Entries[][] grid;

	public Grid() {
		grid = new Entries[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grid[i][j] = Entries.EMPTY;
			}
		}
	}
	
	public boolean isOver() {
		boolean checker = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (grid[i][j] != Entries.EMPTY) {
					checker &= true;
				} else {
					checker &= false;
					break;
				}
			}
		}
		return checker;
	}

	public void doTurn(int x, int y, Entries Entry) {
		assert ((x >= 0 && x <= 2) && (y >= 0 && y <= 2));
		if (grid[x][y] == Entries.EMPTY) {
			grid[x][y] = Entry;
		}
	}

	public boolean hasWon() {
		return leftDiagnolChecker() || rightDiagnolChecker() || leftChecker()
				|| rightChecker() || botChecker() || topChecker();
	}

	private boolean leftDiagnolChecker() {
		if (grid[0][0] == Entries.EMPTY) {
			return false;
		} else {
			return (grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2]);			
		}
	}

	private boolean rightDiagnolChecker() {
		if (grid[0][2] == Entries.EMPTY) {
			return false;
		} else {
			return (grid[0][2] == grid[1][1] && grid[0][2] == grid[2][0]);			
		}
	}

	private boolean leftChecker() {
		if (grid[0][0] == Entries.EMPTY) {
			return false;
		} else {
			return (grid[0][0] == grid[1][0] && grid[0][0] == grid[2][0]);			
		}
	}

	private boolean rightChecker() {
		if (grid[0][2] == Entries.EMPTY) {
			return false;
		} else {
			return (grid[0][2] == grid[1][2] && grid[0][0] == grid[2][2]);			
		}
	}

	private boolean botChecker() {
		if (grid[2][0] == Entries.EMPTY) {
			return false;
		} else {
			return (grid[2][0] == grid[2][1] && grid[2][0] == grid[2][2]);			
		}
	}

	private boolean topChecker() {
		if (grid[0][0] == Entries.EMPTY) {
			return false;
		} else {
			return (grid[0][0] == grid[0][1] && grid[0][0] == grid[0][2]);			
		}
	}

	public void displayGrid() {
		System.out.println("#   0  1  2  ");
		System.out.println("-|---------");
		for (int i = 0; i < 3; i++) {
			System.out.print(i + "| ");
			for (int j = 0; j < 3; j++) {
				if (grid[i][j] == Entries.EMPTY) {
					System.out.print(" . ");
				} else if (grid[i][j] == Entries.X) {
					System.out.print(" X ");
				} else {
					System.out.print(" O ");
				}
			}
			System.out.println();
		}

	}
}
