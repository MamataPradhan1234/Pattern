// 4444
// 333
// 22
// 1
import java.util.Scanner;
public class Pattern19 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int num=n;
        while(i <= n){
          int j = 1;
          while(j <= num){
            System.out.print(n-i+1);
            j=j+1;
          }
          System.out.println();
          i=i+1;
          num--;
        }
    }
}
