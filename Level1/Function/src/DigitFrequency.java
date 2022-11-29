import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key= sc.nextInt();
       int ans= Frequency(num,key);
        System.out.println(ans);
    }
    public static int Frequency(int num,int key){
        int count =0;
        while(num>0){
            int n = num % 10;
            num = num / 10;
            if(n==key){
                count++;
            }
        }
        return count;
    }

}
