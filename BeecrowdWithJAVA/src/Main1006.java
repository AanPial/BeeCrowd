import java.io.IOException;
import java.util.Scanner;

public class Main1006 {

    public static void main(String[] args) throws IOException {

        Scanner p=new Scanner(System.in);
        double a,b,c;
        a=p.nextDouble();
        b= p.nextDouble();
        c= p.nextDouble();

        double x=(a*2+b*3+c*5)/(2+3+5);
        System.out.printf("MEDIA = %.1f\n",x);
    }

}