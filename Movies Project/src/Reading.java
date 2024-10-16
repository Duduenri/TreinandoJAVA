import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your favorite movie:");
        String movie = input.nextLine();
        System.out.println("What is the release year?");
        int releaseYear = input.nextInt();
        System.out.println("Give your rating for the movie:");
        double rating = input.nextDouble();

        System.out.println(movie);
        System.out.println(releaseYear);
        System.out.println(rating);
    }
}
