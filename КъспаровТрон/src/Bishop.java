
public class Bishop {
	static int countSquares(int row, int column) 
    { 
  
        
        int topLeft = Math.min(row, column) - 1; 
  
        
        int bottomRight = 8 - Math.max(row, column); 
  
         
        int topRight = Math.min(row, 9 - column) - 1; 
  
         
        int bottomLeft = 8 - Math.max(row, 9 - column); 
  
        
        return (topLeft + topRight + bottomRight + bottomLeft); 
    } 
  
     
    public static void main(String[] args) 
    { 
  
       
        int row = 4, column = 4; 
  
        System.out.println(countSquares(row, column)); 
    } 
} 
