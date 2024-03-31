import java.io.IOException;
import java.util.Scanner;
public class Main1014 {

    public static void main(String[] args) throws IOException {
        Scanner p=new Scanner(System.in);
        int x=p.nextInt();
        float y=p.nextFloat();

        float z=x/y;

        System.out.printf("%.3f km/l\n",z);
    }

}