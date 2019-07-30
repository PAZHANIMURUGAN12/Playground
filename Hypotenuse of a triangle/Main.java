
  #include <stdio.h>
#include <math.h>
int main()
{
    float p, b,a,c;
    float hypotenuse;
   scanf("%f%f",&p,&b);
  a=p*p;
  c=b*b;
    hypotenuse = sqrt(a+c);
    printf(" %.2f",  hypotenuse);
  return 0;
}