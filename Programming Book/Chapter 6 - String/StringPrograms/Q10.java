//Q10. WAJP to count how many Small Vowels and Capital Consonants present in the String.

import static StringMethods.StringMethods.*;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        sc.close();
        
        System.out.println("Small Vowels count is: " + countSmallVowels(st));
        System.out.println("Capital Consonants count is: " + countCapitalConsonants(st));
    }
}
