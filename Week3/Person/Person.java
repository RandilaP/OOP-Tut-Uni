public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    public Person(){};
    public Person(String name, int age, String gender){
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }

    public Person(String name, int age){
        this.myName = name;
        this.myAge = age;
    }

    public String getName(){
        return myName;
    }

    public int getAge(){
        return myAge;
    }

    public String getGender(){
        return myGender;
    }

    public void setName(String name){
        this.myName = name;
    }

    public void setAge(int age){
        this.myAge = age;
    }

    public void setGender(String gender){
        this.myGender = gender;
    }

    public String toString(){
        return myName + ", age: " + myAge;
    }

}
