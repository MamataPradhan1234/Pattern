//    *
//   ***
//  *****
// *******
import java.util.Scanner;
public class Pattern21 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int spaces;
        int stars;
        while(i <= n){
             spaces = 1;
            while(spaces <= n-i){
                System.out.print(' ');
                spaces++;
            }
            stars = 1;
            while(stars <= i){
                System.out.print('*');
                stars++;
            }
            int decStars = i-1;
            while(decStars >= 1){
              System.out.print('*');
              decStars--;
            }
          System.out.println();
          i++;
        }
    }
}
