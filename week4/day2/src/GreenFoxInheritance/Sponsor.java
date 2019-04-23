package GreenFoxInheritance;

public class Sponsor extends Person {
    String company;
    int hiredStudents;

    public Sponsor (String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        hiredStudents = 0;
    }

    public Sponsor() {
        setName("Jane Doe");
        setAge(30);
        setGender("Female");
        company = "Google";
    }

    public void hire(){
        hiredStudents++;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " +  getAge()  + " years old " + getGender() +
                " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is to hire brilliant junior software developers.");
    }
}
