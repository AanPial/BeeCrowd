#include<stdio.h>
#include<stdlib.h>
int main()
{
    int a,b,c,major;
    
    scanf("%d%d%d",&a,&b,&c);

    if(a>b)
    {
        major=(a+c+abs(a-c))/2;
    }
    else
    {
        major=(b+c+abs(b-c))/2;
    }

    printf("%d eh o maior\n",major);

    return 0;
}