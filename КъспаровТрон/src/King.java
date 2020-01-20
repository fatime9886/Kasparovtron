
public class King {
	 static int countSquares(int row, int col, int moves) 
	    { 
	         
	        int squares = 0; 
	  
	        
	        for (int i = 1; i <= 8; i++) { 
	            for (int j = 1; j <= 8; j++) { 
	  
	               
	                if (Math.max(Math.abs(i - row), Math.abs(j - col)) <= moves) 
	                    squares++; 
	            } 
	        } 
	  
	        return squares; 
	    } 
	  
	     
	    public static void main(String[] args) 
	    { 
	        int row = 4, col = 4, moves = 1; 
	        System.out.print(countSquares(row, col, moves)); 
	    } 
	} 
