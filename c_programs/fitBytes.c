#include <stdio.h>

int fitsBits(int x, int n) {
    int shift = 32 + ~n + 1;
    return !(((x << shift) >> shift) ^ x);
}


int main() {

    printf("fitsBits(5,3) = %d\n", fitsBits(5,3));
    printf("fitsBits(-4,3) = %d\n", fitsBits(-4,3));
    printf("fitsBits(127,8) = %d\n", fitsBits(127,8));
    printf("fitsBits(128,8) = %d\n", fitsBits(128,8));

    return 0;
}