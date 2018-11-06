#include <stdio.h>
#include <stdlib.h>
/*The * operator can also be read as "the contents of" whatever it is next to.
 * The & operator can be put in front of a variable that you want to store something in
 */
struct Node {
    int data;
    struct Node *next;
};

void add(struct Node** new_head, int data) {

    struct Node* new = (struct Node*)malloc(sizeof(struct Node));

    new->data = data;
    new->next = *new_head;
    *new_head = new;
}

void deleteHead(struct Node **new_head) {
    //Created a new Node based on the
    struct Node* temp = *new_head;
    *new_head = temp->next;
    free(temp);
}




int main() {
    struct Node* first = NULL;
    struct Node* second = NULL;

    first = (struct Node*)malloc(sizeof(struct Node));
    first->data = 1;
    first->next = NULL;

    second = (struct Node*)malloc(sizeof(struct Node));
    second->data = 2;
    second->next = first;

    return 0;
}