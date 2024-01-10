public class Movie {
    private String title;
    private String category;
    private Director director;
    private int numAwards;

    public Movie(String title, String category, Director director){
        this.title = title;
        this.category = category;
        this.director = director;
    }

    public String getTitle(){
        return title;
    }

    public String getCategory(){
        return category;
    }

    public Director getDirector(){
        return director;
    }

    public int getNumAwards() {
        return numAwards;
    }

    public  void setNumAwards(int numAwards){
        this.numAwards = numAwards;
    }

    public String toString(){
        return "Movie: " + title + ", category: " + category + ", director:  " + director + ", numAward: " + numAwards;
    }
}
