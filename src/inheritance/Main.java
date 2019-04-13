package inheritance;

class Example {
	String type = "Human";

	public void printType() {
		System.out.println(type);
	}
}

class GamePlayer extends Example {
	GamePlayer() {
		type = "Computer";
	}
}

class TurnBasedPlayer extends GamePlayer {
	String type = "Turn-based";
}

class ChessPlayer extends TurnBasedPlayer {
	ChessPlayer() {
		type = "Chess";
	}

	public void printType() {
		System.out.println(type);
	}
}

class CheckersPlayer extends TurnBasedPlayer {
	CheckersPlayer() {
		type = "Checkers";
	}

	public void printType() {
		System.out.println(type);
	}
}

public class Main{
	public static void main(String[] args){
		GamePlayer p = new CheckersPlayer();
		p.printType();
		Example p1 = new TurnBasedPlayer();
		p1.printType();
	}
}