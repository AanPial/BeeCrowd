import java.io.IOException;
import java.util.Scanner;

public class Main1021 {

    public static void main(String[] args) throws IOException {
        Scanner p = new Scanner(System.in);
        float n=p.nextFloat();
        int y;
        System.out.printf("NOTAS:\n");
        if(n>=100 || n<100)
        {
            y= (int) (n/100);
            System.out.printf("%d nota(s) de R$ 100.00\n",y);
            n=n-(100*y);
        }
        if(n>=50 || n<50)
        {
            y= (int) (n/50);
            System.out.printf("%d nota(s) de R$ 50.00\n",y);
            n=n-(50*y);
        }
        if(n>=20 || n<20)
        {
            y= (int) (n/20);
            System.out.printf("%d nota(s) de R$ 20.00\n",y);
            n=n-(20*y);
        }
        if(n>=10 || n<10)
        {
            y= (int) (n/10);
            System.out.printf("%d nota(s) de R$ 10.00\n",y);
            n=n-(10*y);
        }
        if(n>=5 || n<5)
        {
            y= (int) (n/5);
            System.out.printf("%d nota(s) de R$ 5.00\n",y);
            n=n-(5*y);
        }
        double m=0.0;
        if(n>=2 || n<2)
        {
            y= (int) (n/2);
            System.out.printf("%d nota(s) de R$ 2.00\n",y);
            m=n-(2*y);
        }
        System.out.printf("MOEDAS:\n");
        if(m>=1.00 || m<1.00)
        {
            y= (int) (m/1.0);
            System.out.printf("%d moeda(s) de R$ 1.00\n",y);
            m=m-(1*y);
        }
        if(m>=0.50 || m<0.50)
        {
            y= (int) (m/0.50);
            System.out.printf("%d moeda(s) de R$ 0.50\n",y);
            m=m-(.50*y);
        }
        if(m>=0.25 || m<0.25)
        {
            y= (int) (m/0.25);
            System.out.printf("%d moeda(s) de R$ 0.25\n",y);
            m=m-(.25*y);
        }
        if(m>=0.10 || m<0.10)
        {
            y= (int) (m/0.10);
            System.out.printf("%d moeda(s) de R$ 0.10\n",y);
            m=m-(.10*y);
        }
        if(m>=0.05 || m<0.05)
        {
            y= (int) (m/0.05);
            System.out.printf("%d moeda(s) de R$ 0.05\n",y);
            m=m-(.05*y);
        }
        if(m>=0.01 || m<0.01)
        {
            y= (int) ((m/0.01)+.01);
            System.out.printf("%d moeda(s) de R$ 0.01\n",y);
        }
    }

}