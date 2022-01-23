import java.util.Scanner;

public class alphabetS {
    public static void main(String[] args){
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row x column");
        int n = sc.nextInt();
        for(j = 1; j <= n; j++){
            for(i = 1; i <=n; i++){
                if(j==1 && i!=1 &&i!=n || j==n && i!=1 && i!=n || j==n/2 && i!=1 && i!=n || i==1 && j<n/2 && j!=1 && j!=n/2
                        || i==n && j>n/2 && j!=n/2 && j!=n || i==n && j==2 || i==1 && j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
