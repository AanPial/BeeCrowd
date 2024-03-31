import java.io.IOException;
import java.util.Scanner;
public class Main1015 {

    public static void main(String[] args) throws IOException {
        Scanner p=new Scanner(System.in);

        double x1=p.nextDouble();
        double y1=p.nextDouble();
        double x2=p.nextDouble();
        double y2=p.nextDouble();

        double d=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

        System.out.printf("%.4f\n",d);
    }

}