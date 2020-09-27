#include<stdio.h>
#include<string.h>
struct Person
{
    int age;
    char name[10];
};
void main(){


struct Person p1,p2,*p3;
p3=&p1;
p1.age=23;
*p3->name="hello";

printf("%s",p3->name);



}