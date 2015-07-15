package com.smetris;

public class TShape extends Shape {
	
	public TShape(int ID, boolean isInPlay) {
		super(ID, isInPlay);

		mBlocks.add(new Block(this, new int[]{1, 0}));
		mBlocks.add(new Block(this, new int[]{0, 1}));
		mBlocks.add(new Block(this, new int[]{1, 1}));
		mBlocks.add(new Block(this, new int[]{2, 1}));
	}

		
}