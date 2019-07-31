#include<stdio.h>
int main()
{
  float ple;int no;
  float rate,simple=0;
  scanf("%f",&ple);
  scanf("%d",&no);
  scanf("%f",&rate);
  //your code here
  simple=((ple)/100)*no*rate;
  printf("%f",simple);
  return 0;
}