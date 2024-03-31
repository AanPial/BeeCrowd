#include <stdio.h>
#include<math.h>
#define pi 3.14159
int main() {
 
    double r,avr;
    scanf("%lf",&r);

    avr=(4.0/3)*pi*pow(r,3);
    
    printf("VOLUME = %.3lf\n",avr);

    return 0;
}