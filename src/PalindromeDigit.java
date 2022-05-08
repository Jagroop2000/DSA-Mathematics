import java.util.*;

public class PalindromeDigit {
    public static  void main (String args[]){
        Scanner scan  =  new Scanner(System.in);

        int number  = scan.nextInt();
        System.out.print(checkPalindrome(number));
    }

    private static boolean checkPalindrome(int number) {

        int temp  = number;
        int rev= 0;
        while (temp !=0){

            rev = rev*10 + (temp%10);
            temp= temp/10;
        }

        return (rev == number);
    }


}