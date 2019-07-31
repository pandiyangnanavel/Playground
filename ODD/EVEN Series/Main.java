#include<stdio.h>
int main()
{
  int num,num1;
  scanf("%d",&num);
  if(num==0 && num==1){
    printf("%d",0);
  }
  else if(num>2 && num%2==0){
    printf("%d",(num-2)/2);
  }
  else{
    printf("%d",((num-1)/2)*2);
  }
	//type your code here
 return 0;
}