#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,c;
  scanf("%f%f%f",&a,&b,&c);
  float d,r1,r2,real,img,deter;
  //Type your code here
  deter=b*b-4*a*c;
  if(deter>0){
    r1=(-b+(sqrt(deter)))/(2*a);
    r2=(-b-(sqrt(deter)))/(2*a);
    printf("root1 = %0.2f",r1);
    printf("  root2 = %0.2f",r2);
  }
  else if(deter==0){
    r1=r2=-b/(2*a);
    printf("root1 = %0.2f",r1);
    printf("  root2 = %0.2f",r2);
  }
  else{
    real=-b/(2*a);
    img=sqrt(-deter)/(2*a);
    printf("root1 = %0.2f + %0.2fi",real,img);
    printf("  root2 = %0.2f - %0.2fi",real,img);
    
  }
  return 0;
}