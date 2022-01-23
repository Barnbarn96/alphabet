import java.util.Scanner;

public class alphabetQ {
    public static void main(String[] args){
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row x column");
        int n = sc.nextInt();
        for(j = 1; j <= n; j++){
            for(i = 1; i <=n; i++){
                if(j == 1 && i <= 3*n/4 || j==3*n/4 && i <= 3*n/4 || i==1 && j<=3*n/4 || i==3*n/4 && j<=3*n/4
                    || i == j && i>=2*n/3 && j>=2*n/3){
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
