#include<stdio.h>
int main()
{
  int num,key1,key2,index1=-1,index2=-1;
  scanf("%d",&num);
  int arr[num];
  for(int i=0;i<num;i++){
    scanf("%d",&arr[i]);
  }
  scanf("%d",&key1);
  scanf("%d",&key2);
  for(int j=0;j<num;j++){
    if(arr[j]==key1){
      index1=j;
    }
    else if(arr[j]==key2){
      index2=j;
    }
  }
  printf("Element 1 index = %d\n",index1);
  printf("Element 2 index = %d",index2);
  return 0;
}