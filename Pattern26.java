// Half Diamond pattern
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
import java.util.Scanner;
public class Pattern26 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }
        i=n-1;
        while(i>=1){
            int j=1;
            while(j<=i){
                System.out.print('*');
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
