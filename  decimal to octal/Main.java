#include<stdio.h>
int main()
{
  int dec,oct1[10],i=0,j,rem;
  scanf("%d",&dec);
  //type your code here
  do{
    rem=dec%8;
    oct1[i]=rem;
    i++;
    dec=dec/8;
  }while(dec!=0);
  for(j=i-1;j>=0;j--){
    printf("%d",oct1[j]);
  }
  return 0;
}