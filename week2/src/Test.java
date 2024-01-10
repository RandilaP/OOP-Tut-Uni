public class Test{
    public static void main(String[] args) {
        Director director = new Director("James", "Cameron");
        Date dob = new Date(16, 8, 1954);
        director.setDoB(dob);
        director.setNumOfDirectedMovies(10);
        System.out.println(director);

        Movie movie = new Movie("Avatar", "fantasy",director);
        System.out.println(movie);
        movie.setNumAwards(10);
        System.out.println(movie);
        System.out.println("title is:" + movie.getTitle());
        System.out.println("category is:" + movie.getCategory());
        System.out.println("name of director is:" + movie.getDirector().getName());
        System.out.println("surname of director is:" + movie.getDirector().getSurname());
        System.out.println("number of awards is:" + movie.getNumAwards());
    }
}
