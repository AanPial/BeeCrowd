#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int h,m,s;
    h=n/3600;
    n=n-(h*3600);
    m=n/60;
    s=n-(m*60);
    printf("%d:%d:%d\n",h,m,s);

    return 0;
}