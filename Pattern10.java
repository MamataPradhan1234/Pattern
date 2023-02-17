// 1
// 21
// 321
// 4321
import java.util.Scanner;
public class Pattern10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int p=1;
        while(i<=n){
            int j=1;
            p=i;
            while(j<=i){
                System.out.print(p);
                p--;
                j=j+1;
            }
            i=i+1;
            System.out.println();
        }
    }
}
