//     1
//    12
//   123
//  1234
// 12345
import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i <= n){
            int spaces = 1;
            while(spaces <= n-i){
                System.out.print(' ');
                spaces++;
            }
            int stars = 1;
            while(stars <= i){
                System.out.print(stars);
                stars++;
            }
          System.out.println();
          i++;
        }
    }
}
