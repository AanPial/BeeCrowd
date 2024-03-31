import java.io.IOException;
import java.util.Scanner;
public class Main1013 {

    public static void main(String[] args) throws IOException {
        Scanner p=new Scanner(System.in);
        int a=p.nextInt();
        int b=p.nextInt();
        int c=p.nextInt();

        int major;
        if(a>b)
        {
            major=(a+c+Math.abs(a-c))/2;
        }
        else
        {
            major=(b+c+Math.abs(b-c))/2;
        }

        System.out.printf("%d eh o maior\n",major);
    }

}