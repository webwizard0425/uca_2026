#include <stdio.h>

int bitXor(int x, int y) {
    return ~(~(x & ~y) & ~(~x & y));
}


int main() {

    printf("bitXor(4,5) = %d\n", bitXor(4,5));
    printf("bitXor(7,3) = %d\n", bitXor(7,3));
    printf("bitXor(0,0) = %d\n", bitXor(0,0));

    return 0;
}