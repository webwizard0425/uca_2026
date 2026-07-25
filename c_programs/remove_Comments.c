#include <stdio.h>

int main() {
    int ch, next;
    int in_string = 0, in_char = 0;

    while ((ch = getchar()) != EOF) {

        if (!in_string && !in_char && ch == '/') {
            next = getchar();

            // Single-line comment
            if (next == '/') {
                while ((ch = getchar()) != '\n' && ch != EOF);
                if (ch == '\n')
                    putchar('\n');
            }

            // Multi-line comment
            else if (next == '*') {
                int prev = 0;
                while ((ch = getchar()) != EOF) {
                    if (prev == '*' && ch == '/')
                        break;
                    prev = ch;
                }
            }

            // Not a comment
            else {
                putchar(ch);
                if (next != EOF)
                    ungetc(next, stdin);
            }
        }
        else {
            putchar(ch);

            if (ch == '"' && !in_char)
                in_string = !in_string;
            else if (ch == '\'' && !in_string)
                in_char = !in_char;

            // Handle escaped characters
            if ((in_string || in_char) && ch == '\\') {
                ch = getchar();
                if (ch != EOF)
                    putchar(ch);
            }
        }
    }

    return 0;
}