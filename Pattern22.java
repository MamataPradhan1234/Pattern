//    1  
//   232 
//  34543
// 4567654
import java.util.Scanner;
public class Pattern22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(' ');
                spaces++;

            }
            int p=i;
            int j=1;
            while(j<=i){
              System.out.print(j+p-1);
              j++;
            }
            int dec=i-1;
            while(dec>=1){
              System.out.print(dec+i-1);
              dec--;
            }
            System.out.println();
            i++;
        }
    }
}
