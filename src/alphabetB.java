import java.util.Scanner;

public class alphabetB {
    public static void main(String[] args){
        int i,j;
        //alphabet B
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row x column");
        int n = sc.nextInt();
        for(j = 1; j <= n; j++){ // row
            for(i = 1; i <=n; i++){ //column
                if(j == 1 && i < 3*n/4 || j == n && i!=n|| j == n/2 && i!=n || i == 1 || j !=1 && j <= n/2 && i == 3*n/4 ||
                    i == n && j > n/2 && j!=n){
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
