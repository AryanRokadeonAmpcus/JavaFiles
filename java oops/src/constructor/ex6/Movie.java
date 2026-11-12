package constructor.ex6;

public class Movie {


        String movieName;
        double rating;
        int year;

        Movie(String movieName, double rating, int year) {
            this.movieName = movieName;
            this.rating = rating;
            this.year = year;
        }

        void display() {

            System.out.println("Movie = " + movieName);
            System.out.println("Rating = " + rating);
            System.out.println("Year = " + year);
            System.out.println();
        }

        public static void main(String[] args) {

            Movie m1 = new Movie("3 Idiots", 8.4, 2009);
            Movie m2 = new Movie("KGF", 8.2, 2018);
            Movie m3 = new Movie("Interstellar", 8.7, 2014);

            m1.display();
            m2.display();
            m3.display();
        }

}
