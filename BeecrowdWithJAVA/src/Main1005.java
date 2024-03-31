import java.io.IOException;
import java.util.Scanner;

public class Main1005 {

    public static void main(String[] args) throws IOException {

        Scanner p=new Scanner(System.in);
        double a,b;
        a=p.nextDouble();
        b=p.nextDouble();
        double x;
        x=((a*3.5)+(b*7.5))/(3.5+7.5);
        System.out.printf("MEDIA = %.5f\n",x);
    }

}