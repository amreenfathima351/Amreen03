#include <stdio.h>
#include <stdlib.h>

int main()
{
    int inttype;
    float floattype;
    double doubletype;
    char chartype;
    printf("Size of int: %zu bytes\n",sizeof(inttype));
    printf("Size of float: %zu bytes\n",sizeof(floattype));
    printf("Size of double: %zu bytes\n",sizeof(doubletype));
    printf("Size of char: %zu bytes\n",sizeof(chartype));
    return 0;
}
