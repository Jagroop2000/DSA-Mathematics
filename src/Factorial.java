import java.util.*;

public class Factorial {
    public static  void main(String []args){
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        System.out.println(iterativeFactorial(number));
        System.out.println(recursiveFactorial(number));

    }

    private static int recursiveFactorial(int number) {
        if(number == 0){
            return 1;
        }
        return number * recursiveFactorial(number-1);
    }

    private  static int iterativeFactorial(int number){
        int res =1;

        for(int i=2;i<=number ; i++){
            res=res*i;
        }
        return res;
    }
}