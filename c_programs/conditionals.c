#include <stdio.h>

/*
 * conditional - same as x ? y : z
 *   Example: conditional(2,4,5) = 4
 *   Legal ops: ! ~ & ^ | + << >>
 *   Max ops: 16
 */
int conditional(int x, int y, int z) {
    int mask = ~(!x) + 1;
    return (mask & y) | (~mask & z);
}


int main() {

    printf("conditional(2, 4, 5) = %d\n", conditional(2, 4, 5));
    printf("conditional(0, 4, 5) = %d\n", conditional(0, 4, 5));
    printf("conditional(-3, 7, 9) = %d\n", conditional(-3, 7, 9));
    printf("conditional(10, 100, 200) = %d\n", conditional(10, 100, 200));

    return 0;
}