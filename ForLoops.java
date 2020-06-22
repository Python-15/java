package loops;
import java.util.Scanner;


    public class ForLoops {
        public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int total =0;

            System.out.println("enter the value of n");
            int n = sc.nextInt();
       int count = 0;

            for (count = 1; count <= n; count++) {
                total = total +count;
            }

            System.out.println("Sum of first 10 natural numbers is: " + total);
        }
    }
