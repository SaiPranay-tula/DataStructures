#include<stdio.h>
int fact(int n);
int fib(int n,int a,int b);
int main()
{
    int x[4];
   int i;

   for(i = 0; i < 4; ++i) {
      printf("&x[%d] = %p\n", i, &x[i]);
   }

   printf("Address of array x: %p", x);
   // printf("%d",fact(5));
  /* a=51,b=10;
   a=a+b;
   b=a-b;
   a=a-b;
  // printf("%d %d",a,b);
  fib(10,0 ,1);
   */

  //scanf("%c",&a[0]);
 // printf("%c",a);


}
int fact(int n)
{
    if(n==1)
    return 1;
    return n*fact(n-1);
}

int fib(int n,int a,int b)
{
    if(n==0)
    {
    //printf("%d %d",a,b);
    return 0;
    }
    printf("%d  ",a);
    a=a+b;
    b=a-b;
    a=a-b;
    b=a+b;
    n--;
    fib(n,a,b);
    



}