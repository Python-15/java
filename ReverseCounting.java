package loops;

import java.util.Scanner;

public class ReverseCounting {
        public static void main(String[] ar){
            int i=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of n");
            int n = sc.nextInt();

            for(i=n;i>=0;i=i-3){
                System.out.println(i);
            }
        }
    }


