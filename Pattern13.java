// AAAA
// BBBB
// CCCC
// DDDD
import java.util.Scanner;
public class Pattern13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            char p=(char)('A'+i-1);
            int j=1;
            while(j<=n){
                System.out.print(p);
                j=j+1;
            }
            i=i+1;
            System.out.println();
        }
    }
}
