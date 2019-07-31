#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float opp,adj,hyp2,hyp;
  scanf("%f",&opp);
  scanf("%f",&adj);
  hyp=(opp*opp)+(adj*adj);
  hyp2=sqrt(hyp);
  printf("%0.2f",hyp2);
  return 0;
}