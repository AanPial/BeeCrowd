#include <stdio.h>
#include<math.h>
#define pi 3.14159
 
int main() {

    double r;
    scanf("%lf",&r);
    double area;
    area=pi*pow(r,2);
    printf("A=%.4lf\n",area);

    return 0;
}