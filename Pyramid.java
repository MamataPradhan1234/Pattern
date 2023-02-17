
public class Pyramid{
    public static void pyramidPattern(int x){
        for (int i=0; i<x; i++)
        {
            for (int j=x-i; j>1; j--){
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // System.out.println(" enter the number :");
        // int n=sc.nextInt();
        int n=5;
        pyramidPattern(n);
    }
}