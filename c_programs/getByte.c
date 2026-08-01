#include <stdio.h>

int getByte(int x, int n) {
    int mask = 0xFF;
    return (x >> (n << 3)) & mask;
}


int main() {

    printf("0x%x\n", getByte(0x12345678, 1));
    printf("0x%x\n", getByte(0x87654321, 0));
    printf("0x%x\n", getByte(0x87654321, 3));

    return 0;
}