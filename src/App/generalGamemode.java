package App;


public class generalGamemode extends Board{
	
	public generalGamemode(int size){
		super(size);   //call the constructor of the superclass Board
	}
	
	
	//override the checkForWin method to implement the win conditions
	//for the general game
	public void checkForWin() {
		int maxPossibleMoves = board_size * board_size;   //calculate the max possible moves
		
		//check if there are remaining moves
		//and change the game state
		if(totalMoves < maxPossibleMoves)
			currentGameState = GameState.PLAYING;
		else if (bluePoints > redPoints)
			currentGameState = GameState.B_WON;
		else if (redPoints > bluePoints)
			currentGameState = GameState.R_WON;
		else 
			currentGameState = GameState.DRAW;
	}
}

