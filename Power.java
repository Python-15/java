package loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] zz){
        Scanner sc = new Scanner(System.in);
       int pow =1;
       int i=1;
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
    for (i=1;i<=b;i++) {
        pow *= a;

    }
        System.out.println(pow);

    }
}
