package loops;

import javax.swing.*;
import java.util.Scanner;

public class SumOfSerise {
    public static void main(String[] pk){
        float i=1;
        float sum= 0;

        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        for(i=1 ; i <=n;i++) {
            if (i % 2 == 0)
                sum -= 1 / i;

            else {
                sum += 1 / i;
            }
        }
        System.out.println(sum);
    }
}
