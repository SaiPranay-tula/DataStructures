#include<stdio.h>
#include<string.h>

struct Person{
int age;
char name[10];
};

struct Object{
    struct Person  Object1;
    int num;
};
int main(){

struct Person a,b;
a.age=10;
strcpy(a.name,"pranay");
a.name="not";
printf("%d %s \n",a.age,a.name);

struct Object n1;
n1.Object1.age=10;
strcpy(n1.Object1.name,"Vignesh");
printf("%d %s \n",n1.Object1.age,n1.Object1.name);

}