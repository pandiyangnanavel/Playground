#include<stdio.h>
int main()
{
  int dec,rem,i,j,bin1[10];
  scanf("%d",&dec);
  //Type your code here
  while(dec!=0){
    rem=dec%2;
    bin1[i]=rem;
    i++;
    dec=dec/2;
  }
  for(j=i-1;j>=0;j--){
    printf("%d",bin1[j]);
  }
  return 0;
}