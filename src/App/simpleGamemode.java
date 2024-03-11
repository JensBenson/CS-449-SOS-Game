package App;

import App.Board.GameState;

public class simpleGamemode extends Board{
	
	public simpleGamemode(int size) {
		super(size);   //call the constuctor of the superclass Board
	}
	
	//override the checkForWin method to implement the win conditions
	//for the simple game
	public void checkForWin() {
		int pointsToWin = 1;    //# of points to win a simple game
		int maxPossibleMoves = board_size * board_size;  //calculate the max possible moves
		
		
		//change game state based on how many points the players each have
		if(bluePoints >= pointsToWin)
			currentGameState = GameState.B_WON;
		else if (redPoints >= pointsToWin)
			currentGameState = GameState.R_WON;
		else if (totalMoves < maxPossibleMoves)
			currentGameState = GameState.PLAYING;
		else currentGameState = GameState.DRAW;
	}

}
