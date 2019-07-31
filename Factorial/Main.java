#include<stdio.h>
int main()
{
	//your code here
  long int fact=1;int num;
  scanf("%d",&num);
  for(int i=1;i<=num;i++){
    fact=fact*i;
  }
  printf("%ld",fact);
  return 0;
}