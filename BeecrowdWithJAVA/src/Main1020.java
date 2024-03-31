import java.io.IOException;
import java.util.Scanner;

public class Main1020 {

    public static void main(String[] args) throws IOException {
        Scanner p = new Scanner(System.in);
        int n=p.nextInt();
        int y,m,d;
        y=n/365;
        n=n-(y*365);
        m=n/30;
        n=n-(m*30);
        d=n;

        System.out.println(y+" ano(s)");
        System.out.println(m+" mes(es)");
        System.out.println(d+" dia(s)");
    }

}