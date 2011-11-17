package edu.luc.tictactoe.businesslogic;

import edu.luc.tictactoe.businesslogic.implementation.SelectionResult;

public interface ITicTacToePlay {
	public IPlayer getPlayerOne();
	public IPlayer getPlayerTwo();
	public void randomStart();
	public void registerPlayers();
	public void resetBoard();
	public SelectionResult selectPosition(int i, int j);
	public void setNextTurnPlayer();
	public void setNumberOfPlays(int plays);
	public void setPlayerOne(String name);
	public void setPlayerTwo(String name);
	public void switchPlayer();
	public IPlayer whoseTurn();	
}
