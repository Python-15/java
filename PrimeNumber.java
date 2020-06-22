package loops;

import javax.swing.*;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] ar){
        int i=2;
        boolean primeNo =true;
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i=2;i<n;i++) {

            if (n % i == 0) {
                primeNo = false;
                break;
            }

        }
        if(n<2)
            primeNo = false;
        System.out.println("prime no is  " +primeNo);
    }

}

