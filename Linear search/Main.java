#include<stdio.h>
int main()
{
  int num,key,flag;
  scanf("%d",&num);
  int arr[100];
  for(int j=0;j<num;j++){
    scanf("%d",&arr[j]);
  }
  scanf("%d",&key);
  for(int i=0;i<num;i++){
    if(arr[i]==key){
      flag=i+1;
      break;
    }
  }
  if(flag!=0){
    printf("%d",flag);
  }
  else{
    printf("%d isn't present in the array.",key);
  }
      
  //Type your code here
  return 0;
}