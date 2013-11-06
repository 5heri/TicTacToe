
public class Player {
	
	private int number;
	private Entries entry;
	
	public Player(String playerEntry) {
		number = 1;
		if (playerEntry.equals("X") || playerEntry.equals("x")) {
			entry = Entries.X;
		} else {
			entry = Entries.O;
		}
	}
	
	public Entries getEntry() {
		return entry;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void changePlayer() {
		number = 3 - number;
		if (entry == Entries.X) {
			entry = Entries.O;
		} else {
			entry = Entries.X;
		}
	}

}
