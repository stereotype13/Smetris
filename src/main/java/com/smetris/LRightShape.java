package com.smetris;

public class LRightShape extends Shape {
	
	public LRightShape(int ID, boolean isInPlay) {
		super(ID, isInPlay);

		/*	
				0 1

			0	X X
			1	X O
			2	X O
		*/

		mBlocks.add(new Block(this, new int[]{0, 0}));
		mBlocks.add(new Block(this, new int[]{1, 0}));
		mBlocks.add(new Block(this, new int[]{0, 1}));
		mBlocks.add(new Block(this, new int[]{0, 2}));
	}

		
}