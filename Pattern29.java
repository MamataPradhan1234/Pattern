// Sum Pattern
// Send Feedback
// Write a program to print triangle of user defined integers sum.
// Input Format :
// A single integer, N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// 1=1
// 1+2=3
// 1+2+3=6
// Sample Input 2 :
//  5
// Sample Output 2 :
// 1=1
// 1+2=3
// 1+2+3=6
// 1+2+3+4=10
// 1+2+3+4+5=15
import java.util.Scanner;
public class Pattern29 {
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int i = 1;
        // int sum = i;
        // while(i <= n){
        //     int t=1; //Starting number
        //     int j=1;
        //     while(j <= i){
        //         if(t < i)
        //         {
        //             System.out.print(t + '+');
        //             t++;
        //             j++;
        //         }else
        //         {
        //          System.out.print(t + '='+ sum);
        //             j++;
        //         }
        //     }
        //    i++;
        //   sum=sum+i;
        //   System.out.println();
        // }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        while (count <= num) {
          int sum = 0;
          int digit = 1;
          int flag = 0;
          while (digit <= count) {
            sum = sum + digit;
            if (flag == 0) {
                System.out.print(digit);
                digit++;
                flag=1;
            } else {
              System.out.print("+" + digit);
              digit++;
            }
          }
          System.out.println("=" + sum);
          count++;
        }
    }
}
