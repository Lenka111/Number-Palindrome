import java.util.Scanner;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int reversed = 0;
        int remainder;
        int temp;

        //temporary variable
        temp = number;

        while (number != 0) {

            // reversed integer is stored in variable remainder
            remainder = number % 10;

            //multiply reversed by 10 then add the remainder so it gets stored at next decimal place
            reversed = (reversed * 10)+ remainder;

            //the last digit is removed from num after division by 10.
            number /= 10;

        }

        // palindrome if original and reversed are equal
        return (temp == reversed);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // ask input from user
        int number = sc.nextInt();

        //check if the number entered ius a palindrome
        if( isPalindrome(number)){
           System.out.println(number + " is palindrome");
       }
        else{
            System.out.println(number + " is not palindrome");
        }
    }
}
