#include <stdio.h>

typedef int bool;
#define true 1;
#define false 0;

int ask_in_range(int min, int max) {
    int number;
    bool validNum = false;
    while (!validNum) {
        printf("Please enter a number: \n");
        scanf("%d", &number);

        if (number > max || number < min) {
            printf("Your number is outside of [%d, %d] range.", min, max);
            printf("Please enter a number: \n");
            scanf("%d", &number);
        }
        else {
            validNum = true;
            return number;
        }
    }
    }
int guessing_game(int num, int rangemin, int rangemax) {
    printf("Hello and welcome to the game.\n");
    printf("You need to guess a number between %d and %d\n", rangemin, rangemax);
    bool guessed = false;
    int num_guesses = 1;
    while (!guessed) {
    int number = ask_in_range(rangemin, rangemax);
    if (number > num) {
        printf("Too High!\n");
        num_guesses = num_guesses + 1;
    }
    if (number < num) {
        printf("Too Low!\n");
        num_guesses = num_guesses + 1;
    }
    if (number == num) {
        if (num_guesses == 1) {
            printf("Good Job! You took %d guess.", num_guesses);
        }
        else {
            printf("Good Job! You took %d guesses.", num_guesses);
            guessed = true;
        }
    }
    }
    }

int main() {
guessing_game(50, -100, 100);
    return 0;
}