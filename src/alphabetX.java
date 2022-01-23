import java.util.Scanner;

public class alphabetX {
    public static void main(String[] args){
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row x column");
        int n = sc.nextInt();
        for(j = 1; j <= n; j++){
            for(i = 1; i <=n; i++){
                if( i == j || i+j == n+1){
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
