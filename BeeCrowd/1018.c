#include<stdio.h>
int main()
{
    int x;
    scanf("%d",&x);
    printf("%d\n",x);
    int n;
    if(x>=100 || 100>x)
    {
        n=x/100;
        printf("%d nota(s) de R$ 100,00\n",n);
        x=x-(100*n);
    }
     if(x>=50 || 50>x)
    {
        n=x/50;
        printf("%d nota(s) de R$ 50,00\n",n);
        x=x-(50*n);
    }
     if(x>=20 || 20>x)
    {
        n=x/20;
        printf("%d nota(s) de R$ 20,00\n",n);
        x=x-(20*n);
    }
     if(x>=10 || 10>x)
    {
        n=x/10;
        printf("%d nota(s) de R$ 10,00\n",n);
        x=x-(10*n);
    }
     if(x>=5 || 5>x)
    {
        n=x/5;
        printf("%d nota(s) de R$ 5,00\n",n);
        x=x-(5*n);
    }
     if(x>=2 || 2>x)
    {
        n=x/2;
        printf("%d nota(s) de R$ 2,00\n",n);
        x=x-(2*n);
    }
    if(x==1 || 1>x)
    {
        n=x/1;
        printf("%d nota(s) de R$ 1,00\n",n);
    }
    return 0;
}