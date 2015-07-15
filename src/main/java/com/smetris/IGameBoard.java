package com.smetris;

public interface IGameBoard {
	void addShape(IShape shape);
	int[] checkFullLine();
}