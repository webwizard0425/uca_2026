#include <stdio.h>
#include <stdlib.h>
#include <signal.h>
#include <unistd.h>

// Global variable to safely count signal triggers in an async signal handler
volatile sig_atomic_t signal_count = 0;

// Signal handler function for SIGINT (Ctrl+C)
void handle_sigint(int sig) {
    (void)sig; // Silence unused parameter warning if any
    signal_count++;

    if (signal_count < 3) {
        // write() is async-signal-safe (preferred inside signal handlers)
        // or standard printf can be used for simpler educational examples
        char msg[] = "\n[SIGINT caught] Press Ctrl+C 3 times to exit.\n";
        write(STDOUT_FILENO, msg, sizeof(msg) - 1);
    } else {
        char exit_msg[] = "\n[SIGINT caught 3 times] Exiting now. Goodbye!\n";
        write(STDOUT_FILENO, exit_msg, sizeof(exit_msg) - 1);
        _exit(0);
    }
}

int main() {
    // Register the signal handler for SIGINT
    if (signal(SIGINT, handle_sigint) == SIG_ERR) {
        perror("Error registering signal handler");
        return 1;
    }

    printf("Program running (PID: %d). Try pressing Ctrl+C...\n", getpid());

    while (1) {
        // sleep() gets interrupted by signals, which is fine since the loop keeps running
        sleep(1);
    }

    return 0;
}
