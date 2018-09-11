import java.util.Scanner;

public class PlayerRoster{

    /*Ted Hoeller*/
    public static void main(String[] args) {
        /* Variable/Array/Scanner library */
        int NUM_PLAYERS = 5;
        int i;
        int jersey;
        int rating;
        int player;
        String option = "N";
        int[] jerseyNum = new int[5];
        int[] playerRating = new int[5];
        Scanner scnr = new Scanner(System.in);

        player = 1;
        for (i = 0; i < NUM_PLAYERS; ++i) {
            System.out.println("Enter player " + player + "'s jersey number:");
            jersey = scnr.nextInt();

            jerseyNum[i] = jersey;

            System.out.println("Enter player " + player + "'s rating:");
            rating = scnr.nextInt();

            playerRating[i] = rating;
            ++player;
            System.out.println("");
        }
        System.out.println("ROSTER");
        player = 1;
        for (i = 0; i < NUM_PLAYERS; ++i) {
            System.out.println("Player " + player + " -- " + "Jersey number: " + jerseyNum[i] + ", " + "Rating: " + playerRating[i]);
            ++player;
        }


        while (!option.equals("q")) {

            System.out.println("");
            System.out.println("MENU");
            System.out.println("u - Update player rating");
            System.out.println("a - Output players above a rating");
            System.out.println("r - Replace player");
            System.out.println("o - Output roster");
            System.out.println("q - Quit");
            System.out.println("");
            System.out.println("Choose an option:");

            option = scnr.next();

            if (option.equals("o")) {
                System.out.println("ROSTER");
                player = 1;
                for (i = 0; i < NUM_PLAYERS; ++i) {
                    System.out.println("Player " + player + " -- " + "Jersey number: " + jerseyNum[i] + ", " + "Rating: " + playerRating[i]);
                    ++player;
                }
            }

            if (option.equals("u")) {
                int newRating;
                int index = 0;
                System.out.println("Enter a jersey number: ");
                jersey = scnr.nextInt();
                for (i = 0; i < NUM_PLAYERS; ++i) {
                    if (jerseyNum[i] == jersey) {
                        index = i;
                    }
                }
                System.out.println("Enter a new rating for player: ");
                newRating = scnr.nextInt();
                playerRating[index] = newRating;
            }

            if (option.equals("a")) {
                System.out.println("Enter a rating: ");
                rating = scnr.nextInt();
                System.out.println("");
                System.out.println("ABOVE " + rating);
                player = 1;
                for (i = 0; i < NUM_PLAYERS; ++i) {
                    if (playerRating[i] > rating) {
                        System.out.println("Player " + player + " -- " + "Jersey number: " + jerseyNum[i] + ", " + "Rating: " + playerRating[i]);
                        ++player;
                    }
                    else {
                        ++player;
                    }
                }
            }

            if (option.equals("r")) {
                int newJersey;
                int newRating;
                int index = 0;
                System.out.println("Enter a jersey number:");
                jersey = scnr.nextInt();
                for (i = 0; i < NUM_PLAYERS; ++i) {
                    if (jerseyNum[i] == jersey) {
                        index = i;
                    }

                }

                System.out.println("Enter a new jersey number:");
                newJersey = scnr.nextInt();
                jerseyNum[index] = newJersey;
                System.out.println("Enter a rating for the new player:");
                newRating = scnr.nextInt();
                playerRating[index] = newRating;
            }


            }


        }
    }



