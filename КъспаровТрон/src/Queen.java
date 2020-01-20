
public class Queen {

	 static int numberofPosition(int n, int k, int x, 
             int y, int obstPosx[], int obstPosy[]) 
{ 
      
		// d11, d12, d21, d22 diagonalni rastoqniq 
		 // r1, r2  vertikalni rastoqniq
		 // c1, c2 horizontalni rastoqniq
    int d11, d12, d21, d22, r1, r2, c1, c2; 
  
    // inicializirane na razstoqnieto do kraq na daskata
    d11 = Math.min( x-1, y-1 ); 
    d12 = Math.min( n-x, n-y ); 
    d21 = Math.min( n-x, y-1 ); 
    d22 = Math.min( x-1, n-y ); 
  
    r1 = y-1; 
    r2 = n-y; 
    c1 = x-1; 
    c2 = n-x; 
  
 //za vsqko prepqtstvie namerete minimalno razstoqnie
    // ako ima prepqtstviq v posokata
        //   razstoqnieto shte bude aktualizirano 
    for (int i = 0; i < k; i++) 
    { 
        if ( x > obstPosx[i] && y > obstPosy[i] && 
                x-obstPosx[i] == y-obstPosy[i] ) 
            d11 = Math.min(d11, x-obstPosx[i]-1); 
  
        if ( obstPosx[i] > x && obstPosy[i] > y && 
                obstPosx[i]-x == obstPosy[i]-y ) 
            d12 = Math.min( d12, obstPosx[i]-x-1); 
  
        if ( obstPosx[i] > x && y > obstPosy[i] && 
                obstPosx[i]-x == y-obstPosy[i] ) 
            d21 = Math.min(d21, obstPosx[i]-x-1); 
  
        if ( x > obstPosx[i] && obstPosy[i] > y && 
                    x-obstPosx[i] == obstPosy[i]-y ) 
            d22 = Math.min(d22, x-obstPosx[i]-1); 
  
        if ( x == obstPosx[i] && obstPosy[i] < y ) 
            r1 = Math.min(r1, y-obstPosy[i]-1); 
  
        if ( x == obstPosx[i] && obstPosy[i] > y ) 
            r2 = Math.min(r2, obstPosy[i]-y-1); 
  
        if ( y == obstPosy[i] && obstPosx[i] < x ) 
            c1 = Math.min(c1, x-obstPosx[i]-1); 
  
        if ( y == obstPosy[i] && obstPosx[i] > x ) 
            c2 = Math.min(c2, obstPosx[i]-x-1); 
    } 
  
    return d11 + d12 + d21 + d22 + r1 + r2 + c1 + c2; 
} 
  

public static void main (String[] args) { 
int n = 8; //  razmer na daskata
int k = 1; // broi prepqtstviq
int Qposx = 4; // Queen x poziciq
int Qposy = 4; // Queen y poziciq
int obstPosx[] = { 3 }; // x polojenie na prepqtstviq 
int obstPosy[] = { 5 }; // y polojenie na prepqtstviq 

System.out.println(numberofPosition(n, k, Qposx, 
                      Qposy, obstPosx, obstPosy)); 
} 
} 


