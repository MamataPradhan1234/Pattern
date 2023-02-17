// Code : Diamond of stars

// Print the following pattern for the given number of rows.
// Assume, N is always odd.
// Pattern for N = 7

//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *

// Input format :

// N (Total no. of rows and can only be odd)

// Output format :

// Pattern in N lines

// Sample Input :

// 5

// Sample Output :

//   *
//  ***
// *****
//  ***
//   *

import java.util.Scanner;
public class Pattern25 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int midpoint = (n/2)+1;
        int count = 1;
        while(count <= midpoint){
            int spaces=1;
            while(spaces <= midpoint-count){
                System.out.print(' ');
                spaces++;
            }
            int stars = 1;
            while(stars <= (2*count-1)){
                System.out.print('*');
                stars++;
            }
            System.out.println();
            count++;
        }
        count = 1;
        while(count <= midpoint-1){
           int spaces=count;
          while(spaces >= 1){
            System.out.print(' ');
             spaces--;
           }
          int stars = 2*(midpoint-count)-1;
          while(stars >= 1){
             System.out.print('*');
             stars--;
           }
           System.out.println();
           count++;
        }
    }
}
