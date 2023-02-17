import java.util.Scanner;

// Half Diamond Pattern
// Send Feedback
// Write a program to print N number of rows for Half Diamond pattern using stars and numbers
// Note : There are no spaces between the characters in a single line.


// Input Format :
// A single integer: N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// *
// *1*
// *121*
// *12321*
// *121*
// *1*
// *
// Sample Input 2 :
//  5
// Sample Output 2 :
// *
// *1*
// *121*
// *12321*
// *1234321*
// *123454321*
// *1234321*
// *12321*
// *121*
// *1*
// *
public class Pattern27 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println('*');
        int i=1;
        while(i<=n){
            System.out.print('*');
            int num=1;
            while(num<=i){
                System.out.print(num);
                num++;
            }
            int decNum=i-1;
            while(decNum >= 1){
                System.out.print(decNum);
                decNum--;
            }
            System.out.print('*');
            i++;
            System.out.println();
        }
        i=n-1;
        while(i >= 1){
            System.out.print('*');
            int num=1;
            while(num <= i){
                System.out.print(num);
                num++;
            }
            int decNum = i-1;
            while(decNum >= 1){
                System.out.print(decNum);
                decNum--;
            }  
            System.out.print('*');
            i--;
            System.out.println();     
        }
        System.out.print('*');
    }
}
