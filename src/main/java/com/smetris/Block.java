package com.smetris;

import java.util.*;

public class Block {
	private int[] mR = new int[2];
	private int[] mr = new int[2];
	private IShape mParent;

	private void calculateR() {
		//Calculation: mR = mParent.getR() + mr
		
		//X
		mR[0] = mParent.getR()[0] + mr[0];

		//Y
		mR[1] = mParent.getR()[1] + mr[1];

	}

	public Block(IShape parent, int[] r) {
		this.mParent = parent;
		this.mr = r;
		calculateR();
	}

	public boolean checkCollision(Direction direction) {
		return false;
	}

	public void onShapeTranslate() {
		calculateR();
	}

	public static enum Direction {UP, RIGHT, DOWN, LEFT};

	public int[] getR() {
		return mR;
	}

	public int getRX() {
		return mR[0];
	}

	public int getRY() {
		return mR[1];
	}

	public IShape getParentShape() {
		return mParent;
	}

	
}