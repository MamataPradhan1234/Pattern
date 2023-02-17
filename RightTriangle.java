// *   
// * * 
// * * *
// * * * *
// * * * * *
import java.util.Scanner;

public class RightTriangle {
    int row;
    int i,j;
    public RightTriangle()//Constructor
    {
       Scanner sc=new Scanner(System.in);
      System.out.println(" Enter the no of rows :");
      row=sc.nextInt();
      for(i=0; i<row; i++)
      {
        for(j=0; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
      }
    }
    public static void main(String[] agrs){
     RightTriangle obj= new RightTriangle();
    }
}
