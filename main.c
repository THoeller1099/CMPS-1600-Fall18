#include <stdio.h>
#include <stdlib.h>

struct distance {
    int feet;
    float inches;
} dist_sum, dist1, dist2;

void addDistance(struct distance dist1, struct distance dist2) {
    dist_sum.feet = dist1.feet + dist2.feet;
    dist_sum.inches = dist1.inches + dist2.inches;

    while (dist_sum.inches >= 12) {
        dist_sum.feet++;
        dist_sum.inches = dist_sum.inches - 12;
    }

    printf("Sum of Distances = %d' - %f'' ", dist_sum.feet, dist_sum.inches);
}
int main() {
    printf("1st Distance\n");
    printf("Enter feet: ");
    scanf("%d", &dist1.feet);
    printf("\nEnter Inches: ");
    scanf("%f", &dist1.inches);

    printf("2nd Distance\n");
    printf("Enter feet: ");
    scanf("%d", &dist2.feet);
    printf("\nEnter Inches: ");
    scanf("%f", &dist2.inches);

    addDistance(dist1, dist2);
    return 0;
}