#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  int arr[num];
  scanf("%d",&arr[0]);
  int max=arr[0];
  for(int i=1;i<num;i++){
    scanf("%d",&arr[i]);
    if(max<arr[i]){
      max=arr[i];
    }
  }
  printf("%d",max);
  return 0;
}