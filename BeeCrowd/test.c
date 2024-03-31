#include<stdio.h>
int main()
{
    double n;
    scanf("%lf",&n);
    int y;
    printf("NOTAS:\n");
    if(n>=100 || n<100)
    {
        y=n/100;
        printf("%d nota(s) de R$ 100.00\n",y);
        n=n-(100*y);
    }
    if(n>=50 || n<50)
    {
        y=n/50;
        printf("%d nota(s) de R$ 50.00\n",y);
        n=n-(50*y);
    }
    if(n>=20 || n<20)
    {
        y=n/20;
        printf("%d nota(s) de R$ 20.00\n",y);
        n=n-(20*y);
    }
    if(n>=10 || n<10)
    {
        y=n/10;
        printf("%d nota(s) de R$ 10.00\n",y);
        n=n-(10*y);
    }
    if(n>=5 || n<5)
    {
        y=n/5;
        printf("%d nota(s) de R$ 5.00\n",y);
        n=n-(5*y);
    }
    double m;
    if(n>=2 || n<2)
    {
        y=n/2;
        printf("%d nota(s) de R$ 2.00\n",y);
        m=n-(2*y);
    }
    printf("MOEDAS:\n");
    if(m>=1.00 || m<1.00)
    {
        y=m/1.0;
        printf("%d moeda(s) de R$ 1.00\n",y);
        m=m-(1*y);
    }
    if(m>=0.50 || m<0.50)
    {
        y=m/0.50;
        printf("%d moeda(s) de R$ 0.50\n",y);
        m=m-(.50*y);
    }
    if(m>=0.25 || m<0.25)
    {
        y=m/0.25;
        printf("%d moeda(s) de R$ 0.25\n",y);
        m=m-(.25*y);
    }
    if(m>=0.10 || m<0.10)
    {
        y=m/0.10;
        printf("%d moeda(s) de R$ 0.10\n",y);
        m=m-(.10*y);
    }
    if(m>=0.05 || m<0.05)
    {
        y=m/0.05;
        printf("%d moeda(s) de R$ 0.05\n",y);
        n=n-(.05*y);
    }
    if(m>=0.01 || m<0.01)
    {
        y=m/0.01;
        printf("%d moeda(s) de R$ 0.01\n",y);
    }
}