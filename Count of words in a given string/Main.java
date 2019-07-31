#include <stdio.h>
#include <string.h>
 
void main()
{
    char s[200];
    int count = 0, i;
    gets(s);
    for (i = 0;s[i] != '\0';i++)
    {
        if (s[i] == ' ')
            count++;    
    }
    printf("%d", count + 1);
}