import java.io.IOException;
import java.util.Scanner;
public class Main1012 {

    public static void main(String[] args) throws IOException {
        final double pi =3.14159;
        Scanner p=new Scanner(System.in);
        double a= p.nextDouble();
        double b= p.nextDouble();
        double c= p.nextDouble();

        double tr,cr,ta,sqr,rct;
        tr=(1.0/2)*a*c;
        cr=pi*Math.pow(c,2);
        ta=((a+b)/2)*c;
        sqr=b*b;
        rct=a*b;

        System.out.printf("TRIANGULO: %.3f\n",tr);
        System.out.printf("CIRCULO: %.3f\n",cr);
        System.out.printf("TRAPEZIO: %.3f\n",ta);
        System.out.printf("QUADRADO: %.3f\n",sqr);
        System.out.printf("RETANGULO: %.3f\n",rct);
    }

}