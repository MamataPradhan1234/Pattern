// ABCD
// BCDE
// CDEF
// DEFG
import java.util.Scanner;
public class Pattern14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            char p=(char)('A'+i-1);
            int j=1;
            while(j<=n){
                System.out.print(p);
                p=(char)(p+1);
                j=j+1;
            }
            i=i+1;
            System.out.println();
        }
    }
}

