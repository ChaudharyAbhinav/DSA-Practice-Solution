import java.util.Scanner;

public class Factorial {
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        int ans = n * Fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // Fact(n);
        System.out.println(Fact(n));
    }
}
