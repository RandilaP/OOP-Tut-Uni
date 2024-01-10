public class Director {
    private String name;
    private String surname;
    private int numOfDirectedMovies;

    private Date Dob;

    public Director(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public Date getDob(){
        return Dob;
    }

    public int getNumOfDirectedMovies(){
        return numOfDirectedMovies;
    }

    public void setDoB(Date Dob){
        this.Dob = Dob;
    }

    public void setNumOfDirectedMovies(int numOfDirectedMovies){
        this.numOfDirectedMovies = numOfDirectedMovies;
    }

    public String toString(){
        return "Director: name:" + name + ", Surname: " + surname + ", numMovies: " + numOfDirectedMovies + ", DOB: " + Dob;
    }
}

