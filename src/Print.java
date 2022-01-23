import java.util.Scanner;

public class Print {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print your name.");
        String s = sc.nextLine(); //collect string user enter

        System.out.println("Enter font size.");
        int n = sc.nextInt();

        s = s.toUpperCase();
        System.out.println("This is your name " + s);
        int i,j,k;
        for(k = 0; k < s.length(); k++){
            //System.out.println(s.charAt(k));
            char ch = s.charAt(k);
            alphabetA a = new alphabetA();
            if(ch == 'A'){
                //code for A
              a.printA(n);
            }
            else if(ch == 'B'){
                //code for B
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
            else if(ch == 'C'){
                //code for C
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
            else if(ch == 'D'){
                //code for D
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
            else if(ch == 'E'){
                //code for E
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if(j==1 || j==n || j==n/2 || i==1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'F'){
                //code for F
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if(j==1 || j==n/2 || i==1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'G'){
                //code for G
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if( j==1 && i!=1 && i!=n || i==n && j==2 || j==n && i!=1 && i!=n || i==1 && j!=1 && j!=n
                                || i==n && j>=n/2 && j!=n || j==n/2 && i>=3*n/4){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'H'){
                //code for H
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if(j==n/2 || i==1 || i==n){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'I'){
                //code for I
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if( j==1 || j==n ||i==n/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'J'){
                //code for J
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if( j==1 || j==n && i>=n/2 ||i==n || j-i ==n/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'K'){
                //code for K
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if( i==n/2 || i+j ==  n+1 && i>n/2 || i==j && i>n/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'L'){
                //code for L
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if(i==1 || j == n){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'M'){
                //code for M
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if(i==1 || i== n || i==j && i <n/2 ||i+j == n+1 && i>n/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'N'){
                //code for N
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if(i==1 || i== n || i==j){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'O'){
                //code for O
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if( j==1 && i!=1 && i!=n || j==n && i!=1 && i!=n || i==1 && j!=1 && j!=n || i==n && j!=1 && j!=n){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'P'){
                //code for P
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if(i==1 || j==1 && i!=n || j==n/2 && i!=n || i==n && j<n/2 && j!=1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'Q'){
                //code for Q
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
            else if(ch == 'R'){
                //code for R
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if(i==1 || i==j && i>n/2 || j==1 && i!=n || j==n/2 && i!=n || i==n && j<n/2 && j!=1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'S'){
                //code for S
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
            else if(ch == 'T'){
                //code for T
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if(j==1 || i==n/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'U'){
                //code for U
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if(i==1 && j!=n || i==n && j!=n || j==n && i!=1 && i!=n){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'V'){
                //code for V
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if(i==1 && j<=n/2 || i==n && j<=n/2 || j-i == n/2 || i+j==n+(n/2)+1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'W'){
                //code for W
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if(i==1 || i==n || i==j && j>n/2 || i+j==n+1 && j>n/2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'X'){
                //code for X
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
            else if(ch == 'Y'){
                //code for Y
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if(i==j && i<=n/2 || i+j==n+1 ){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            else if(ch == 'Z'){
                //code for Z
                for(j = 1; j <= n; j++){
                    for(i = 1; i <=n; i++){
                        if(j==1 || j==n || j+i==n+1){
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
    }
}
