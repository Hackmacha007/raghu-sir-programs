/*
Print the following pattern
* * * * *
 * * * * 
  * * *
   * *
    *                          */

import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
