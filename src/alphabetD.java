import java.util.Scanner;

public class alphabetD {
    public static void main(String[] args){
        //alphabet D
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row x column");
        int n = sc.nextInt();
        for(j = 1; j <= n; j++){
            for(i = 1; i <=n; i++){
                if(j == 1 && i <= n/2 || j == n && i<=n/2 || i == 1 || i-j == n/2 || i+j == n +(n/2) +1){
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
