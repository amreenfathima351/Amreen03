#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a = 5,c;
    c=a;
    printf("c = %d\n",c);
    c+=a;
    printf("c = %d\n",c);
    c-=a;
    printf("c = %d\n",c);
    c*=a;
    printf("c = %d\n",c);
    c/=a;
    printf("c = %d\n",c);
    c%=a;
    printf("c = %d\n",c);
    return 0;
}
