import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

    public static void Solve(int[] arr){
        Stack<Integer> st = new Stack<>();

        int[] stock = new int[arr.length];
        st.push(0);
        stock[0] = 1;

        ;
        for (int i = 1;i < arr.length; i++) {
            while(st.size() > 0 && arr[i] > arr[st.peek()] ){
                st.pop();
            }
            if(st.size() == 0){
                stock[i] = i + 1;
            }else {
                stock[i] = i - st.peek();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(stock));
    }





    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println(Arrays.toString(arr));
        Solve(arr);

    }
}
