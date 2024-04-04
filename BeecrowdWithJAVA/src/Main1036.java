import java.io.IOException;
import java.util.*;
public class Main1036 {
    public static void main(String[] args) throws IOException {
        Scanner p=new Scanner(System.in);
        double a,b,c;
        a=p.nextDouble();
        b=p.nextDouble();
        c=p.nextDouble();

        double R1,R2;

        R1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        R2=(-b- Math.sqrt(b*b-4*a*c))/(2*a);


        if(Double.isFinite(R1) && Double.isFinite(R2))
        {
            System.out.printf("R1 = %.5f%n",R1);
            System.out.printf("R2 = %.5f%n",R2);
        }
        else
        {
            System.out.printf("Impossivel calcular%n");
        }

    }
}
