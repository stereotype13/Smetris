package com.smetris;

import java.util.*;

public interface IShape {
	void translate(Block.Direction direction, int magnitude);
	void rotate();
	boolean checkCollision(Block.Direction direction);
	int[] getR();
	int getID();
	boolean isInPlay();
	void setGameBoard(IGameBoard gameBoard);
	IGameBoard getGameBoard();
	List<Block> getBlocks();
}

