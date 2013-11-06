import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean startNewGame = true;

		while (startNewGame) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to TicTacToe!");
			System.out.println("Enter player 1's type (X/O):");
			String playerEntry = scan.next();
			Player player = new Player(playerEntry);
			Grid grid = new Grid();
			boolean gameHasBeenWon = false;

			while (!grid.isOver()) {
				grid.displayGrid();
				System.out.println("Player " + player.getNumber() + "'s turn");
				System.out.println();
				System.out
						.println("Please enter the co-ordinates of the position:");
				System.out.println("X:");
				int x = scan.nextInt();
				System.out.println("Y:");
				int y = scan.nextInt();
				grid.doTurn(x, y, player.getEntry());
				if (grid.hasWon()) {
					gameHasBeenWon = true;
					System.out.println("Player " + player.getNumber()
							+ " has won the game");
					break;
				}
				player.changePlayer();
			}
			if (!gameHasBeenWon) {
				System.out.println("Game was a DRAW");
			}
			System.out.println("Do you want to start a new game? (y/n)");
			String gameRestart = scan.next();
			if (gameRestart.equals("n") || gameRestart.equals("N")
					|| gameRestart.equals("no") || gameRestart.equals("No")
					|| gameRestart.equals("NO")) {
				startNewGame = false;
			}
		}
		System.out.println("Thank you for playing TicTacToe by sak212");
	}
}
