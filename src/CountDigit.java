import  java.util.* ;

public  class  CountDigit {
    public static void main(String args[]){
        Scanner scan  = new Scanner(System.in);
        int number  = scan.nextInt();

        int count =0;
        while (number > 0){
             number = number/10;
             count++;
        }
        // Another Method  : int count  = (int) Math.floor(Math.log10(number) +1);
        System.out.print(count);
    }
}