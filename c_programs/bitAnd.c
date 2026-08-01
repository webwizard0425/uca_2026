#include <stdio.h>

int bitAnd(int x, int y) {
    return ~(~x | ~y);
}

int main() {

    printf("bitAnd(6,5) = %d\n", bitAnd(6,5));
    printf("bitAnd(7,3) = %d\n", bitAnd(7,3));
    printf("bitAnd(0,5) = %d\n", bitAnd(0,5));

    return 0;
}