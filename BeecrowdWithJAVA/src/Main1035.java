import java.io.IOException;
import java.util.*;

public class Main1035 {

    public static void main(String[] args) throws IOException {
        Scanner p=new Scanner(System.in);
        int a,b,c,d;
        a=p.nextInt();
        b=p.nextInt();
        c=p.nextInt();
        d=p.nextInt();

        if(b>c && d>a && ((c+d)>(a+b)) && c>0 && d>0 && (a%2==0))
        {
            System.out.println("Valores aceitos");
        }
        else
        {
            System.out.println("Valores nao aceitos");
        }
    }

}