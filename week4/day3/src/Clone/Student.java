package Clone;

public class Student extends Person implements Cloneable{
    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization){
        super(name, age, gender);
        this.skippedDays = 0;
        this.previousOrganization = previousOrganization;
    }

    public Student(){
        setName("Jane Doe");
        setAge(30);
        setGender("female");
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }
    //Methods
    @Override
    public void introduce(){
        System.out.println("Hi, I'm " + getName() + ", a " +  getAge()  + " years old " + getGender() + " from " + previousOrganization  +" who skipped " + skippedDays + "days from the course already.");
    }
    @Override
    public void getGoal(){
        System.out.println("My goal is to be a junior software developer.");
    }
    public void Clone(){

    }

    @Override
    public Student clone() {
        Student student = this;
        return student;
    }

    public void skipDays(int numberOfDays){
        this.skippedDays = skippedDays + numberOfDays;
    }

    public String getPreviousOrganization() {
        return previousOrganization;
    }

    public int getSkippedDays() {
        return skippedDays;
    }
}
