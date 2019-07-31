#include<stdio.h>
int main()
{
//type your code here
  int i,cnt=0,t=0;
  char s[100],f;
  scanf("%s",&s);
  f=s[0];
  for(i=0;s[i]!='\0';i++){
    //printf("%c",s[i]);
    if(s[i]==f){
      t++;
      cnt++;
    }
    else{
      printf("%c%d",f,cnt);
      cnt=1;
      f=s[i];}
}
if(t>20){
printf("Invalid Input");}
else{
printf("%c%d",f,cnt);}}