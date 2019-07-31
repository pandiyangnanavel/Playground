#include<stdio.h>
int main()
{
  int num,a,b,i,c=0;
  scanf("%d",&num);
  //Type your code here
  a=0;b=1;
  printf("%d %d ",0,1);
  for(i=0;i<num-2;i++){
    c=a+b;
    a=b;
    b=c;
    printf("%d ",c);
  }
  return 0;
}