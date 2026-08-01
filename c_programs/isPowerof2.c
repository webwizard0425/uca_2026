#include <stdio.h>

int isPower2(int x) {
    int positive = !(x >> 31);
    int nonzero = !!x;
    int oneBit = !(x & (x + ~0));

    return positive & nonzero & oneBit;
}


int main() {

    printf("isPower2(5) = %d\n", isPower2(5));
    printf("isPower2(8) = %d\n", isPower2(8));
    printf("isPower2(0) = %d\n", isPower2(0));
    printf("isPower2(-2) = %d\n", isPower2(-2));

    return 0;
}