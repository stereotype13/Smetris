package com.smetris;

import java.util.*;

public class Shape implements IShape {
	private int[] mR = new int[2];
	protected List<Block> mBlocks = new ArrayList<Block>();
	private int mID;
	private boolean mIsInPlay;
	private IGameBoard mGameBoard;

	public Shape(int ID, boolean isInPlay) {
		mID = ID;
		mIsInPlay = isInPlay;
	}

	//Implementing IShape
	public void setGameBoard(IGameBoard gameBoard) {
		mGameBoard = gameBoard;
	}

	public IGameBoard getGameBoard() {
		return mGameBoard;
	}

	public int[] getR() {
		return mR;
	}
	
	public int getID() {
		return mID;
	}

	public void translate(Block.Direction direction, int magnitude) {
		switch(direction) {
			case UP:
				mR[1] -= magnitude;
			break;

			case RIGHT:
				mR[0] += magnitude;
			break;

			case DOWN:
			default:
				mR[1] += magnitude;
			break;

			case LEFT:
				mR[0] -= magnitude;
			break;

		}

		for(int i = 0; i < magnitude; ++i) {
			for(Block block : mBlocks) {
				block.onShapeTranslate();
			}
		}
	}
	
	public void rotate() {

	}

	public boolean checkCollision(Block.Direction direction) {
		for (Block block : mBlocks) {
			if(block.checkCollision(direction)) {
				return true;
			}
		}

		return false;
	}

	public boolean isInPlay() {
		return mIsInPlay;
	}

	public List<Block> getBlocks() {
		return mBlocks;
	}
}