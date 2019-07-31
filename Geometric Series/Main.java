#include<stdio.h>
int pow1(int x,int y){
  int a=1,i=0;
  for(i=1;i<=y;i++){
    a=a*x;
  }
return(a);}
int main()
{
  //type your code here
  int n,a;
    scanf("%d",&n);
  if(n%2!=0){
    n=(n/2);
    printf("%d",pow1(2,n));}
  else{
    n=(n/2)-1;
    printf("%d",pow1(3,n));}
  return 0;
}