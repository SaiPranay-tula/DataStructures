#include<stdio.h>
#include<stdlib.h>
typedef struct Person{
int age;
char name[10];
};
int main(){

struct Person *b;
b= (struct Person *)malloc(2 * sizeof(struct Person *));
b->age=10;
scanf("%s",b->name);

printf("%d %s",b->age,b->name);

}