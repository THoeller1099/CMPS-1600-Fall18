#include <stdio.h>
#include <stdlib.h>

struct Node** head_ref;
struct connection** head_con;
struct person {
    char email[20];
    char name[50];
    int age;
    char hometown[50];
    char hobby[50];
};

struct connection {
    struct person* person1;
    struct person* person2;
    struct connection* next;
}*temp2;

struct Node {
    struct person* this_person;
    struct Node* next;

} *temp;

void add(char* new_email) {
    //creates a person struct and adds a node to the beginning of the linked list
    //asks for the name, age, hometown and hobby before adding it
    struct person new_person;
    struct Node* new_node = (struct Node*)malloc(sizeof(struct Node));

    new_person.email[1] = *new_email;

    printf("Please enter the new person's name: \n");
    scanf("%s", new_person.name);
    printf("\nPlease enter the new person's age: \n");
    scanf("%d", &new_person.age);
    printf("\nPlease enter the new person's hometown: \n");
    scanf("%s", new_person.hometown);
    printf("\nPlease enter the new person's hobby: \n");
    scanf("%s", new_person.hobby);
    *new_node->this_person = new_person;
    new_node->next = *head_ref;
    *head_ref = new_node;

}

void Remove(char email[]) {
    //Find person with the specified email
    //deletes this person from the linked list and deletes it's next pointers and adjusts previous next pointer
    struct Node* tmp = *head_ref, *prev;
    if (tmp != NULL && tmp->this_person->email == email) {
        //deletes head if head hold the email needed to delete
        *head_ref = tmp->next;
        free(tmp);
        return;
    }

    while (tmp != NULL && temp->this_person->email != email) {
        prev = tmp;
        //make sure we have the previous node so we can delete the "prev->next" pointer
        tmp = tmp->next;
    }

    if (tmp == NULL) {
        return;
    }

    prev->next = tmp->next;
    free(tmp);

}

void edit(char* email) {
    //Given the email address, finds the person associated with it and makes all its info editable
    struct person* specified = (struct person*)malloc(sizeof(struct person));
    temp = *head_ref;
    while (temp != NULL) {
        if (temp->this_person->email == email) {
            specified = temp->this_person;
        }
        else {
            temp = temp->next;
        }
    }

    printf("Choose which information you would like to edit: \n");
    char *choice = "";
    printf("n - name\n");
    printf("a - age\n");
    printf("t - hometown\n");
    printf("h - hobby\n");
    scanf("%c", choice);

    if (*choice == 'n') {
        printf("\nPlease enter the new name: \n");
        scanf("%s", specified->name);
    }

    if (*choice == 'a') {
        printf("\nPlease enter the new age: \n");
        scanf("%d", &specified->age);
    }

    if (*choice == 't') {
        printf("\nPlease enter the new hometown: \n");
        scanf("%s", specified->hometown);
    }

    if (*choice == 'h') {
        printf("\nPlease enter the new hobby: \n");
        scanf("%s", specified->hobby);
    }
    printf("\nInformation has been changed successfully\n");
}

void connect(char* email1, char* email2) {
    //Takes a second linked list called connections, each Node is a connection and has two pointers.
    //one pointer will point to person with email1 and the other to person with email2
    struct connection* new_connection = (struct connection*)malloc(sizeof(struct connection));

    struct person* specified1 = (struct person*)malloc(sizeof(struct person));
    struct person* specified2 = (struct person*)malloc(sizeof(struct person));
    temp = *head_ref;
    while (temp != NULL) {
        if (temp->this_person->email == email1) {
            specified1 = temp->this_person;
        }
        else {
            temp = temp->next;
        }
    }

    while (temp != NULL) {
        if (temp->this_person->email == email2) {
            specified2 = temp->this_person;
        }
        else {
            temp = temp->next;
        }
    }

    new_connection->person1 = specified1;
    new_connection->person2 = specified2;
    new_connection->next = *head_con;
    *head_con = new_connection;

}

void display() {

    temp = *head_ref;
    temp2 = *head_con;
    while (temp!= NULL) {

        printf(temp->this_person->name);
        printf("\n");
        printf("{\n");
        while (temp2 != NULL) {
            if (temp2->person1 == temp->this_person) {
                printf(temp2->person2->name);
                printf("\n");
            }
            if (temp2->person2 == temp->this_person) {
                printf(temp2->person1->name);
                printf("\n");
            }
            temp2 = temp2->next;
        }
        printf("}");
    }
}

void disconnect(char* email1, char*email2) {
    temp2 = *head_con;
    while (temp2 != NULL) {
        if (temp2->person1->email == email1) {
            if (temp2->person2->email == email2) {
                temp2->person1 = NULL;
                temp2->person2 = NULL;
            }
        }
    }
}

void getFriends(char* email) {
    struct Node* specified = (struct Node*)malloc(sizeof(struct Node));
    struct Node* before = (struct Node*)malloc(sizeof(struct Node));
    temp = *head_ref;
    while (temp != NULL) {
        if (temp->this_person->email == email) {
            specified = temp;

        }
        else {
            before = temp;
            temp = temp->next;
        }
    }
    printf(before->next->this_person->name);
    printf("\n");
    printf(specified->next->this_person->name);
    printf("\n");

}

//Using late card for saveNetwork and retrieveNetwork

int main() {
char *choice = "";

while (*choice != 'q') {
    printf("MENU\n");
    printf("a - add Person\n");
    printf("r - remove Person\n");
    printf("e - edit existing Person\n");
    printf("c - connect two people\n");
    printf("d - display all people\n");
    printf("s - disconnect two people\n");
    printf("g - display direct neighbors of a person");
    printf("q - quit program\n");
    printf("Select an action: \n");
    scanf("%c", choice);

    if (*choice == 'a') {
        printf("Enter email you would like to add\n");
        char *email = "";
        scanf("%c", email);
        add(email);
    }

    if (*choice == 'r') {
        printf("Enter the email you would like to remove\n");
        char *email = "";
        scanf("%c", email);
        Remove(email);
    }

    if (*choice == 'e') {
        printf("Enter the email of the person you would like to edit\n");
        char *email = "";
        scanf("%c", email);
        edit(email);
    }

    if (*choice == 'c') {
        printf("Enter the email of the 1st person you would like to connect\n");
        char *email1 = "";
        scanf("%c", email1);
        printf("Enter the email of the 2nd person you would like to connect\n");
        char *email2 = "";
        scanf("%c", email2);
        connect(email1, email2);
    }

    if (*choice == 'd') {
        display();
    }

    if (*choice == 's') {
        printf("Enter the email of the 1st person you would like to disconnect\n");
        char *email1 = "";
        scanf("%c", email1);
        printf("Enter the email of the 2nd person you would like to disconnect\n");
        char *email2 = "";
        scanf("%c", email2);
        disconnect(email1, email2);
    }

    if (*choice == 'g') {
        printf("Enter the email of the person whose friends you would like to display\n");
        char *email = "";
        scanf("%c", email);
        getFriends(email);
    }
    
    if (*choice == 'q') {
        break;
    }

}

    return 0;
}