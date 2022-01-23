import java.util.Scanner;

public class alphabetA {
    public static void printA(int n){
        int i,j;
        //alphabet A
        for(j = 1; j <= n; j++){
            for(i = 1; i <=n; i++){
                if(i == 1 && j > n/2 || i == n && j > n/2 || j == n/2 || i+j == (n/2)+1 || i-j == n/2){
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
