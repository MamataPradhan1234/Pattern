// E
// DE
// CDE
// BCDE
// ABCDE
import java.util.Scanner;
public class Pattern16 {
    public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int i = 1;
        int num = n ;
        while(i <= n ){     
           int  j = 1 ;
           int  p =  'A'+num-1;    
            while( j<=i ){
              System.out.print((char)(p));
               j++;
               p++;
            }
            System.out.println();
            num--;
            i++;
        }
    }
}
