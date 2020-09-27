#include<stdio.h>
#include<stdlib.h>
void main()
{
    int a[]={1,2,3,4,5,6};
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

}