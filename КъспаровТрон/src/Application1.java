import java.util.Scanner;
public class Application1 {
	
	static boolean gameOver = false;
	static String currentPlayer1 = "Player2" ;
	static Scanner scanner = new Scanner(System.in);
	static String input;
	public static void main(String[] args) {
	 while(!gameOver){ 
         try {
             
             System.out.println(currentPlayer1 + "'s Turn:");
             System.out.println("M - Move a piece");
             System.out.println("Q - Quit game");
             System.out.println("R - Reset the game");
             String input = scanner.nextLine();
             if (input.equalsIgnoreCase("Q") || input.equalsIgnoreCase("QUIT")) {
                 gameOver = true;
                 System.out.println("===== GAME HAS ENDED =====");
                 continue;
             } else if (input.equalsIgnoreCase("R") || input.equalsIgnoreCase("RESTART")) {
                
                 System.out.println("===== GAME RESTARTED =====");
                 continue;
             } else if (input.equalsIgnoreCase("M") || input.equalsIgnoreCase("MOVE")) {
            	 System.out.println("Game  reset");
            	 continue;
             } else if (input.equalsIgnoreCase("M") || input.equalsIgnoreCase("MOVE")) {
            		 System.out.println("Move from:col, row");
            		 
					input = scanner.nextLine();
					System.out.println("Move to: COL, ROW");
					input=scanner.nextLine();
            	 }
                
         } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
             
             e.printStackTrace();
         } catch (NullPointerException e) {
          
             e.printStackTrace();
         }
	 }
}
}

	 
			

