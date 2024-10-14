public class Conditional {
    public static void main(String[] args) {
        int releaseYear = 2022;
        boolean includedInPlan = false;
        double movieRating = 8.1;
        String planType = "plus";

        if (releaseYear >= 2022) {
            System.out.println("A release that customers are enjoying!");
        } else {
            System.out.println("A retro movie worth watching!");
        }

        if (includedInPlan == true || planType.equals("plus")) {
            System.out.println("Movie available");
        } else {
            System.out.println("You must pay for the rental");
        }
    }
}
