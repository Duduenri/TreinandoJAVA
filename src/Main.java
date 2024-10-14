public class Main {
    public static void main(String[] args) {
        System.out.println("This is Screen Match");
        System.out.println("Movie: Top Gun: Maverick");

        int releaseYear = 2022;
        System.out.println("Release year: " + releaseYear);
        boolean includedInPlan = true;
        double movieRating = 8.1;
        // Average calculated by the ratings from Jack, Paulo, and Suelem
        double average = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(average);
        String synopsis;
        synopsis = """
                Movie: Top Gun
                Adventure movie with an 80s heartthrob
                Very good!
                Release year
                """ + releaseYear;
        System.out.println(synopsis);

        int classification = (int) (average / 2);
        System.out.println(classification);
    }
}
