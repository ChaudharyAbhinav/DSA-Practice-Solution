//* * * * *
//  * * * *
//    * * *
//      * *
//        *

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

         int nsp =0;
         int nsr = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < nsr; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            nsp++;
            nsr--;
        }

    }
}
