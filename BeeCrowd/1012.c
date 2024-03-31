#include <stdio.h>
#include<math.h>
#define pi  3.14159
 
int main() {
 
    double a,b,c;
    scanf("%lf%lf%lf",&a,&b,&c);
    double tr,cr,ta,sqr,rct;
    tr=(1.0/2)*a*c;
    cr=pi*pow(c,2);
    ta=((a+b)/2)*c;
    sqr=b*b;
    rct=a*b;

    printf("TRIANGULO: %.3lf\n",tr);
    printf("CIRCULO: %.3lf\n",cr);
    printf("TRAPEZIO: %.3lf\n",ta);
    printf("QUADRADO: %.3lf\n",sqr);
    printf("RETANGULO: %.3lf\n",rct);
 
    return 0;
}