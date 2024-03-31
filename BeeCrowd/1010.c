#include <stdio.h>
 
int main() {
 
    int a,b;
    float c;
    scanf("%d%d",&a,&b);
    scanf("%f",&c);

    int x,y;
    float z;
    scanf("%d%d",&x,&y);
    scanf("%f",&z);

    double total;
    total=(b*c)+(y*z);

    printf("VALOR A PAGAR: R$ %.2f\n",total);

    return 0;
}