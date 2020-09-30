#include<stdio.h>
#include<stdlib.h>
void main()
{
    /*int a[]={1,2,3,4,5,6};
    int *ptr=a;
    printf("%p \n",&a);
    printf("%p \n",ptr);
    printf("%d\n",a[0]);
    printf("%d\n",*ptr);
for(int i=1;i<6;i++){
    printf("%p %p  \n",&a[i],ptr+i);
    printf("%d %d  \n",a[i],*(ptr+i));

}


int *ptr1;
ptr1= (int*)malloc(23 * sizeof(int));

printf("%p \n",*ptr1);

ptr1=(int*)calloc(4,sizeof(int));
printf("%p",*ptr1);


int a=10;
int *p1;
int **p2;

p1=&a;
p2=&p1;

printf("%d   %d    %d \n",&a,p1,p2);

printf("%d   %d    %d \n",a,*p1,**p2);

printf("%d   %d    %d \n",a,&p1,&p2);
*/
int i,j,m,n=7;
int p=1;
for(i=1;i<=7;i++)
{
    for(j=7;j>i;j--)
    printf(" ");

    for(j= 1;j<=i;j++)
    printf("%d",p++);
    p--;

    for(j=1;j<i;j++)
    printf("%d",--p);
    printf("\n");
    p=1;

}

}