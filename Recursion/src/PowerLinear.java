import java.util.Scanner;

public class PowerLinear {
    public static int PL(int a,int b){
        if(a==0 || b==0){
            return 1;
        }
        int powerCoefficient = PL(a, b-1);
        int ans = a * powerCoefficient;
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println( PL(a, b));
    }
}
