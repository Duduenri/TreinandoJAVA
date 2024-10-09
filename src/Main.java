public class Main {
    public static void main(String[] args) {
        System.out.println("Screen Match");
        System.out.println("Movie: Top Gun: Maverick");

        int yearOfRelease = 2022;
        System.out.println("Year of Release: " + yearOfRelease);
        boolean subscription = true;
        double filmNote = 8.1;
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Top Gun Movie
                Adventure movie with 80s heartthrob
                Very good!
                Release year
                """ + yearOfRelease;
        System.out.println(sinopse);

        int classification = (int) (media /2);
        System.out.println(classification);
    }
}