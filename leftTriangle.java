//            * 
//          * *
//        * * * 
//      * * * *
//    * * * * *
import java.util.Scanner;
public class leftTriangle {
    // int row;
    // int i,j;
    // Scanner sc;
    // public leftTriangle(){ // Using constructor
    //   sc=new Scanner(System.in);
    //   System.out.println(" Enter the no of row :");
    //   row=sc.nextInt();
    //   for(i=0; i<row; i++)
    //   {
    //     for(j=2*(row-i); j>=0; j--)
    //     {
    //         System.out.print(" ");
    //     }
    //     for(j=0; j<=i; j++)
    //     {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //   }

    // }
    // public static void main(String[] args){
    //     leftTriangle lt= new leftTriangle();
    // }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i <= n){
            int spaces = 1;
            while(spaces <= n-i){
                System.out.print(' ');
                spaces++;
            }
            int stars = 1;
            while(stars <= i){
                System.out.print('*');
                stars++;
            }
          System.out.println();
          i++;
        }
    }
    
}
