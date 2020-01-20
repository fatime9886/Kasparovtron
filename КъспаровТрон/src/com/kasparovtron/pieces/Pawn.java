package com.kasparovtron.pieces;

public class Pawn {
	// edin klas za peshkata
	
	
	
	public String color;
	// cvqt na poleto
   public int power;
   // silata na peshkata
   public int id;
   //nomeraciq na peshka
   public int row;
   public int col;
   
    public Pawn(String color, int row, int col)  {
	   
	   this.color = color;
	   this.power =1;
	   this.id    =1;
	   this.row   =row;
	   this.col   =col;
	 
	
   }
   public boolean isMovePosible(int moveRow, int moveCol) {
	   
	   int moveRowCoeficent = (this.row - moveRow);
	   int moveColCoeficent = (this.col - moveCol);
	   boolean isRowMovementPosible = (moveRowCoeficent ==1);
	   boolean isColMovementPosible = (moveColCoeficent == 0);
	   
	   return isRowMovementPosible &&
			   isColMovementPosible;
	   
	   
   }
   
   public void move(int moveRow, int moveCol) {
	   
	   if(this.isMovePosible(moveRow, moveCol)) {
	   
	   this.row = moveRow;
	   this.col = moveCol;
	   }
   }
   public void attack() {
	   
   }
}

