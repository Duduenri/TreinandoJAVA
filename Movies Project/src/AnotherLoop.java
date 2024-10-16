import java.util.Scanner;

public class AnotherLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double averageRating = 0;
        double rating = 0;
        int totalRatings = 0;

        while (rating != -1) {
            System.out.println("Enter your rating for the movie or -1 to finish: ");
            rating = input.nextDouble();

            if (rating != -1) {
                averageRating += rating;
                totalRatings++;
            }
        }

        System.out.println("Average rating: " + averageRating / totalRatings);
    }
}
