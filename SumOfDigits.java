package whileLoops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] kk){
        Scanner cc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = cc.nextInt();
        int temp= n;
        int sum =0;
        while( temp>0){
            int lastDigit = temp%10;
            temp /=10;
            sum += lastDigit;

        }
        System.out.println("the sum of the digit of "+ n+ " is " + sum);
    }
}
