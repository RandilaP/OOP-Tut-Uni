public class Student extends Person{
    private int IDnumber;
    private double fee;
    private int grade;

    public Student(String name, int age, String gender, int idNum){
        super(name,age,gender);
        this.IDnumber = idNum;
    }

    public int getIDnumber(){
        return IDnumber;
    }

    public void setIDnumber(int idNum){
        this.IDnumber = idNum;
    }

    public double getFee(){
        return fee;
    }

    public void setFee(double fee){
        this.fee = fee;
    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public String toString(){
        return super.toString() + ", ID: " + IDnumber + ", fee: " + fee + ", grade: " + grade;
    }
}
