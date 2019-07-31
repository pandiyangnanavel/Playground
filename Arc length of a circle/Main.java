#include<stdio.h>
void main(){
  float r,cet,arc;
  scanf("%f",&r);
  scanf("%f",&cet);
  arc=2*3.14*(cet/360)*r;
  printf("%0.2f",arc);
}