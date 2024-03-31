import java.io.IOException;
import java.util.Scanner;

public class Main1017 {

    public static void main(String[] args) throws IOException {
        Scanner p = new Scanner(System.in);
        int t,v;
        t=p.nextInt();
        v=p.nextInt();

        double sf=(t*v)/12.0;

        System.out.printf("%.3f\n",sf);
    }

}