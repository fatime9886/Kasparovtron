package com.kasparovtron.pieces;


public class Rook {
	
	public String color;
	public int power;
	public int id;
	
	public int row;
	public int col;
	Rook(String color, int row, int col) {
	this.row = row;
	this.col = col;
	this.color =color;
	this.power   =5;
	this.id      =2; 
	}
	   public boolean isMovePossible(int moveRow,int moveCol) {
		   
		   int moveRowCoeficent = (this.row = moveRow);
		   int moveColCoeficent = (this.row = moveCol);
		   
		   boolean isRowMovingPossible= (moveRowCoeficent <=9);
		   boolean isColMovingPossible= (moveColCoeficent ==0);
		   
		   return  isRowMovingPossible && isColMovingPossible;
	   }
	   public void move(int moveRow, int moveCol) {
		   if (this.isMovePossible(moveRow, moveCol)) {
			   
			   this.row = moveRow;
			   this.col = moveCol;
		
	}
		   
	   }

}
