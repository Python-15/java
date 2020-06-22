package loops;

import java.util.Scanner;

public class BreakINForLoop {
    public static void main(String[] kk){
       Scanner zz = new Scanner(System.in);
       for(;;){
           int i = zz.nextInt();
       if(i<0){
           break;
       }
//        for(int i=1;i<=100;i++){
//            if (i==35){
//                break;
//            }
        System.out.println(i);
        }
    }

}
