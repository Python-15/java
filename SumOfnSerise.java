package loops;

import java.util.Scanner;

public class SumOfnSerise {

    public static void main(String[] ar ){
        float i=1;
        float sum= 0;

        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        for(i=1 ; i <=n;i++){
            sum += 1/i;
        }
        System.out.println(sum);
    }

}