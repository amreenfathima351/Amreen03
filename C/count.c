#include <stdio.h>
#include <stdlib.h>

int main()
{
    long long n;
    int count=0;
    printf("Enter an integer:");
    scanf("%1ld",&n);
    do{
        n/=10;
        ++count;
    }while(n!=0);
    printf("Number of digits: %d",count);
    return 0;
}
