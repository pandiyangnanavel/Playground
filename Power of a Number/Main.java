#include <stdio.h>
int main()
{
  	//Your code here      
  int base,pow=1,exp;
  scanf("%d",&base);
  scanf("%d",&exp);
  if(exp<0){
    printf("Wrong input");
  }
  else{
    for(int i=1;i<=exp;i++){
    pow=pow*base;
  }
    printf("%d",pow);
  }
    return 0;
}