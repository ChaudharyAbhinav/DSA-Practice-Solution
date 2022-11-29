import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();

        Stack<Character> st = new Stack<>();
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch= str.charAt(i);
            if(ch== ')' || ch == ']' || ch == '}'){
                if(st.peek()=='(' || st.peek() == '}' || st.peek() == ']'){
                    System.out.println(true);
                }else{
                    st.pop();
                }
                st.pop();
            }else {
                st.push(ch);
            }
        }
        System.out.println(false);

    }
}
