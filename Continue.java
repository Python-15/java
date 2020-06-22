package loops;

public class Continue {
    public static void main (String[] kk){
        int i=1;
        for(i= 1; i<=100;i++) {
            if (i >= 45 && i <= 55) {
                continue;
            }
            System.out.println(i);
        }
    }

}
