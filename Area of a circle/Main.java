#include<stdio.h>
 #include<math.h>
int main() 
{
   float dia, area;
  float radius;
   scanf("%f", &dia);
  radius=dia/2;
 
   area = 3.14 * radius * radius;
   printf("%0.2f", area);
 
   return (0);
}