#include<stdio.h>
int main()
{
    int x;
    float y;

    scanf("%d",&x);
    scanf("%f",&y);

    float z=x/y;

    printf("%.3f km/l\n",z);
    return 0;
}