#include<stdio.h>
#include<string.h>
int main()
{
  char arr1[100],arr2[100],arr3[100];
  int i,j;
  scanf("%s",arr1);
  scanf("%s",arr2);
  scanf("%s",arr3);
  // type your code here 
  for(i=0;arr1[i]!='\0';i++){
    if(arr1[i]=='a' || arr1[i]=='A' || arr1[i]=='e' || arr1[i]=='E'|| arr1[i]=='i' || arr1[i]=='I'|| arr1[i]=='o' || arr1[i]=='O'|| arr1[i]=='u' || arr1[i]=='U'){
      arr1[i]='$';
    }
  }
  for(i=0;arr2[i]!='\0';i++){
    if(!(arr2[i]=='a' || arr2[i]=='A' || arr2[i]=='e' || arr2[i]=='E'|| arr2[i]=='i' || arr2[i]=='I'|| arr2[i]=='o' || arr2[i]=='O'|| arr2[i]=='u' || arr2[i]=='U')){
     arr2[i]='#';
    }
  }
 for(j = 0; arr3[j]!='\0'; j++)
  	{
  		if(arr3[j] >= 'a' && arr3[j] <= 'z')
  		{
  			arr3[j]=arr3[j] -32;
		}
  	}
  printf("%s%s%s",arr1,arr2,arr3);
  return 0;
}