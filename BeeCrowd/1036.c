//Bhaskara's Formula
#include<stdio.h>
#include<math.h>
int main()
{
    double a,b,c;
    scanf("%lf%lf%lf",&a,&b,&c);

    double R1,R2;

    R1=(-b+sqrt(b*b-4*a*c))/(2*a);
    R2=(-b-sqrt(b*b-4*a*c))/(2*a);


    if(isfinite(R1) && isfinite(R2))
    {
        printf("R1 = %.5lf\n",R1);
        printf("R2 = %.5lf\n",R2);
    }
    else
    {
        printf("Impossivel calcular\n");
    }

    return 0;
}