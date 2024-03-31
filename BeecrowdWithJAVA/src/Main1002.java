import java.io.IOException;
import java.util.Scanner;

public class Main1002 {

    public static void main(String[] args) throws IOException {

        Scanner p=new Scanner(System.in);
        final double pi=3.14159;
        double a,r;
        r=p.nextDouble();
        a=pi*Math.pow(r,2);
        System.out.printf("A=%.4f\n",a);
    }

}