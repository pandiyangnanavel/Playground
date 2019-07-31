#include<stdio.h>
#include<string.h>
int main()
{
  int i=0,fg=0,j;
  char str[100],vow[20]={'a','e','i','o','u','A','E','I','O','U'};
  scanf("%[^\n]s", str);
  
  //Type your code here
  for(i=0;i<strlen(str);i++){
    fg=0;
    for(j=0;j<strlen(vow);j++){
      if(str[i]==vow[j]){
        fg=1;
      }
    }
    if(fg==0){printf("%c",str[i]);}
  }
  return 0;
}