package loops;

import java.util.Scanner;

public class FactoralOfNumber {
    public static void main(String[] pp) {
        int factorial =1 ;
        int i = 1;
        System.out.println("Enter the number which you want to find factorial");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                for(i=1;i<=n;i=i+1) {
                    factorial = factorial *i;
                }
        System.out.println("the factorial of number is =  " +factorial);

                }
    }

