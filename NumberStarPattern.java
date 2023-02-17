import java.util.Scanner;

// Number Star Pattern
// Send Feedback
// Print the following pattern for given number of rows.
// Input format :

// Line 1 : N (Total number of rows)

// Sample Input :
//    5
// Sample Output :
// 1234554321
// 1234**4321
// 123****321
// 12******21
// 1********1
public class NumberStarPattern {
    public static void main(String[] args) {

		// Write your code here		
    Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int i=0;
	while(n > 0){
		//First half
		int digit=1;
		while(digit<=n){
			System.out.print(digit);
			digit++;
		}
		int star=0;
		while(star < i){
			System.out.print("*");
			star++;
		}
		//Second half
		star=0;
		while(star < i){
			System.out.print("*");
			star++;
		}
		digit=n;
		while(digit >= 1){
			System.out.print(digit);
			digit--;
		}
		System.out.println();
		n--;
		i++;
	}
	}  
}
