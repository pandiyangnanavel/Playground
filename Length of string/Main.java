#include<stdio.h>
int main()
{
  char arr[100];
  int count=0;
  gets(arr);
  while(arr[count]!='\0'){
    count++;
  }
  printf("%d",count);
  //Type your code here
  return 0;
}