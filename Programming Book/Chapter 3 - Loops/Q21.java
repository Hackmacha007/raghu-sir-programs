import java.util.Scanner;

public class Q21 {
    private static boolean isPrime(int n) {
        for(int i=2; i<=n/2; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        for(int i=2; i<=n; i++) {
            if(isPrime(i))
                System.out.print(i + " ");
        }
    }
}
