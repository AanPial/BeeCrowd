#include <stdio.h>
 
int main() {
 
    char ch[100];
    scanf("%s",ch);
    double sal,sol,total;

    scanf("%lf%lf",&sal,&sol);
    double l=sol*((double)15/100);
    total=sal+l;

    printf("TOTAL = R$ %.2lf\n",total);
 
    return 0;
}