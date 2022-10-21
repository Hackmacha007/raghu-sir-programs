/*
Print this pattern:
        5
      4 5 4
    3 4 5 4 3
  2 3 4 5 4 3 2  
1 2 3 4 5 4 3 2 1               */

import java.util.Scanner;
public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            
            int x=n-i+1;
            for(int j=1; j<=i*2-1; j++) {
                System.out.print(x+" ");
                if(j<i) {
                    x++;
                } 
                else {
                    x--;
                }
            }
            System.out.println();
        }
    } 
}