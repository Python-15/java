package loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int i =0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(i=0; i<n-2 ; i++) {
            int c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }


    }
}
