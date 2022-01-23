import java.util.Scanner;

public class alphabetC {
    public static void main(String[] args){
        //alphabet C
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row x column");
        int n = sc.nextInt();
        for(j = 1; j <= n; j++){
            for(i = 1; i <=n; i++){
                if(j == 1 && i!=1 || j == n && i!=1 || i == 1 && j!=1 && j!=n){
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
