#include <stdio.h>
 
int main() {
 
    int n,wh;
    double am,sal;
    
    scanf("%d%d",&n,&wh);
    scanf("%lf",&am);
    sal=am*wh;

    printf("NUMBER = %d\n",n);
    printf("SALARY = U$ %.2lf\n",sal);
 
    return 0;
}