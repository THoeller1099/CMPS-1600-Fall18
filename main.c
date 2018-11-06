#include <stdio.h>
#include <stdlib.h>
#include <time.h>

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
    char name[50];
    printf("Hello and welcome to the game.\n");
    printf("Please enter your name: \n");
    scanf("%[^\n]%*c", name);
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
            printf("Good Job! You took %d guess.\n", num_guesses);
            FILE * score_file;
            char filename[20] = "history.txt";
            char s;
            int i;
            score_file = fopen(filename, "r");

            s = fgetc(score_file);
            while (s != EOF) {
                printf("%c", s);
                s = fgetc(score_file);
            }
            fclose(score_file);

            score_file = fopen(filename, "w");

            fprintf(score_file, "%c: %d\n", *name, num_guesses);

            fclose(score_file);
            guessed = true;

        }
        else {
            printf("Good Job! You took %d guesses.\n", num_guesses);
            FILE * score_file;
            char filename[20] = "history.txt";
            char s;
            int i;
            score_file = fopen(filename, "r");

            s = fgetc(score_file);
            while (s != EOF) {
                printf("%c", s);
                s = fgetc(score_file);
            }
            fclose(score_file);

            score_file = fopen(filename, "w");

            fprintf(score_file, "%c: %d\n", *name, num_guesses);

            fclose(score_file);
            guessed = true;

        }
    }
    }
    }

int get_random(int rangemin, int rangemax) {
    srand(time(NULL));
    int i = (rand() % (rangemax - rangemin + 1)) + rangemin;
    return i;
}

int main() {
guessing_game(get_random(-50, 50), -50, 50);
    return 0;
}
/* The maximum number of guesses one will need to guess a number for the range [-500,500] is 999 guesses. This would be
 * the worse possible scenario, if the number was 500 and you started guessing at -500, guessing the next highest number
 * every time.
*/