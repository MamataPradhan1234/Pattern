import java.util.Scanner;

// Parallelogram Pattern
// Send Feedback
// Write a program to print parallelogram pattern for the given N number of rows.
// For N = 4



// The dots represent spaces.
// Input Format :
//  A single integer : N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// ***
//  ***
//   ***
// Sample Input 2 :
// 5
// Sample Output 2 :
// *****
//  *****
//   *****
//    *****
//     *****
public class Pattern28 {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i <= n){
            int spaces = i-1;
            while(spaces >=1){
                System.out.print(' ');
                spaces--;
            }
            int stars = 1;
            while(stars <= n){
                System.out.print('*');
                stars++;
            }
            i++;
            System.out.println();
        }
    }
}
