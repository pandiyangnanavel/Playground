#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  // Type your code here
  if(a<b){
    if(b<c){
      printf("%d",b);
    }
    else{
      printf("%d",c);
    }
  }
  else if(b<a){
    if(a<c){
      printf("%d",a);
    }
    else{
      printf("%d",c);
    }
  }
    else{
      printf("%d",b);
    }
    return 0;
  }
