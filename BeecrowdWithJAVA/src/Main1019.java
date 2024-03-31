import java.io.IOException;
import java.util.Scanner;

public class Main1019 {

    public static void main(String[] args) throws IOException {
        Scanner p = new Scanner(System.in);
        int n=p.nextInt();
        int h,m,s;
        h=n/3600;
        n=n-(h*3600);
        m=n/60;
        s=n-(m*60);
        System.out.printf("%d:%d:%d\n",h,m,s);
    }

}