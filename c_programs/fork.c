#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

int main() {

    pid_t pid = fork();

    if (pid == 0) {
        // Child process
        printf("------ In Child Process -------\n");
        printf("Id of Parent Process : %d\n", getppid());
        printf("Id of Child Process  : %d\n", getpid());
    }
    else {
        // Parent process
        printf("------ In Parent Process -------\n");
        printf("Id of Child Process  : %d\n", pid);
        printf("Id of Parent Process : %d\n", getpid());
    }

    return 0;
}