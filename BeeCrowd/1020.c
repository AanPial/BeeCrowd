#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int y,m,d;
    y=n/365;
    n=n-(y*365);
    m=n/30;
    n=n-(m*30);
    d=n;
    
    printf("%d ano(s)\n",y);
    printf("%d mes(es)\n",m);
    printf("%d dia(s)\n",d);

    return 0;
}