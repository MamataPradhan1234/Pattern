// 1  
// 22 
// 333
// 4444
import java.util.Scanner;
public class Pattern9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int p=i;
            while(j<=i){
                System.out.print(p);
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}