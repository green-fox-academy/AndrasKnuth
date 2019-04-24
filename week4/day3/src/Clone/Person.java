package Clone;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }
    // Getters:
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }
    // Settlers

    public void setName(String newName){
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setGender(String newGender){
        this.gender = newGender;
    }

    public void introduce(){
        System.out.println("Hi, I am " + name + " a " + age + " years old " + gender + ".");
    }

    public void getGoal(){
        System.out.println("My goal is: live for the moment!");
    }


}
