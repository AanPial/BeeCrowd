#include<stdio.h>
int main()
{
    int t,v;
    scanf("%d",&t);
    scanf("%d",&v);

    double sf=(t*v)/12.0;

    printf("%.3lf\n",sf);

    return 0;
}