#include<stdio.h>
int main()
{
  char a;
  scanf("%c",&a);
  //type your code here
  if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U') {
    printf("Vowel");
  }
  else{
    printf("Consonant");
  }
  return 0;
}