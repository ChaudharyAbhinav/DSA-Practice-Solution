import java.util.Scanner;

public class PrintIncreasingDecreasing {
    public static void PID(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        PID(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PID(n);
    }
}
