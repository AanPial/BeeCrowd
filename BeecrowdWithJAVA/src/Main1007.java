import java.io.IOException;
import java.util.Scanner;

public class Main1007 {

    public static void main(String[] args) throws IOException {

        Scanner p=new Scanner(System.in);
        int a,b,c,d;
        a=p.nextInt();
        b=p.nextInt();
        c=p.nextInt();
        d=p.nextInt();
        int result;
        result=(a*b-c*d);
        System.out.println("DIFERENCA = "+result);
    }

}