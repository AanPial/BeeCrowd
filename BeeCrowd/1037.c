#include<stdio.h>
int main()
{
    float x;
    scanf("%f",&x);

    if (x>=0 && x<=25.0)
    {
        printf("Intervalo [0,25]");
    }
    else if (x>25.0 && x<=50.0)
    {
        printf("Intervalo (25,50]");
    }
    else if (x>50.0 && x<=75.0)
    {
        printf("Intervalo (50,75]");
    }
    else if (x>75.0 && x<=100.0)
    {
        printf("Intervalo (75,100]");
    }
    else
    {
        printf("Fora de intervalo");
    }
    printf("\n");
    return 0;
}