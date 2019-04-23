package GreenFoxInheritance;

public class Mentor extends Person{
    String level;

    public  Mentor(String name, int age, String gender, String level){
        super(name, age, gender);
        this.level = level;
    }

    public Mentor(){
        setName("Jane Doe");
        setAge(30);
        setGender("Female");
        level = "intermediate";
    }



    @Override
    public void introduce(){
        System.out.println("Hi, I'm " + getName() + ", a " +  getAge()  + " years old " + getGender() + level + " mentor.");
    }

    @Override
    public void getGoal(){
        System.out.println("My goal is to educate brilliant junior software developers.");
    }

}
