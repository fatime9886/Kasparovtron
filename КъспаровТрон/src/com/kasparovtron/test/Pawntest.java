package com.kasparovtron.test;

import com.kasparovtron.pieces.Pawn;
import com.kasparovtron.pieces.PiecesColor;

public class Pawntest {
	public static void testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward() {
		System.out.print("testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward");
		
		// 1.Arrange 
		Pawn testPawn = new Pawn(PiecesColor.BLACK, 8, 0);
		
		//2. Act-Assert
		boolean isValid = testPawn.isMovePosible(7, 0) ;
		String testMassege = (isValid) ? "Valid" : "Fail";
		char[] testMessage;
		System.out.println(testMessage);
	

		}
				 public static void testIfMoveOverTwoSquereIsNotPosible() {
					 System.out.print("testIfMoveOverTwoSquereIsNotPosible");
					 
					 Pawn testPawn= new Pawn(PiecesColor.BLACK, 8, 0);
					 
					 boolean isValid = (testPawn.isMovePosible(6,0) == false);
					 String testMassege = (isValid) ? "Valid" : "Fail";
						System.out.println(testMessage);
				 }
		
	
		public static void run() {
			testIfMoveOverTwoSquereIsNotPosible();
			testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward();
		}
	
	

}
