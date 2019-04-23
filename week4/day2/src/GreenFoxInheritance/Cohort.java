package GreenFoxInheritance;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    String name;
    List<Student> studentsList;
    List<Mentor> mentorsList;

    public Cohort(String name){
        studentsList = new ArrayList<>();
        mentorsList = new ArrayList<>();
        this.name = name;
    }

    public void addStudent(Student student){
            studentsList.add(new Student());
    }

    public void addMentor(Mentor mentor){
            mentorsList.add(new Mentor());
    }

    public void info(){
        System.out.println("The " + name + " cohort has " + this.studentsList.size() + " students and " +
                mentorsList.size() + " mentors.");
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Student student = new Student();
        people.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Mentor mentor = new Mentor();
        people.add(mentor);
        Sponsor sponsor = new Sponsor();
        people.add(sponsor);
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        people.add(elon);

        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for(Person person : people) {
            person.introduce();
            person.getGoal();
        }

        Cohort awesome = new Cohort("AWESOME");
        awesome.addStudent(student);
        awesome.addStudent(john);
        awesome.addMentor(mentor);
        awesome.addMentor(gandhi);
        awesome.info();
    }
}

/*
The Cohort class has the following constructors:

Cohort(name): beside the given parameter, it sets students and mentors as empty lists

Hi, I'm Mark, a 46 year old male.
My goal is: Live for the moment.
Hi, I'm Jane Doe, a 30 year old female.
My goal is: Live for the moment.
Hi, I'm John Doe, a 20 year old male from BME who skipped 0 days from the course already.
My goal is: Be a junior software developer.
Hi, I'm Jane Doe, a 30 year old female from The School of Life who skipped 3 days from the course already.
My goal is: Be a junior software developer.
Hi, I'm Gandhi, a 148 year old male senior mentor.
My goal is: Educate brilliant junior software developers.
Hi, I'm Jane Doe, a 30 year old female intermediate mentor.
My goal is: Educate brilliant junior software developers.
Hi, I'm Jane Doe, a 30 year old female who represents Google and hired 3 students so far.
My goal is: Hire brilliant junior software developers.
Hi, I'm Elon Musk, a 46 year old male who represents SpaceX and hired 5 students so far.
My goal is: Hire brilliant junior software developers.
The AWESOME cohort has 2 students and 2 mentors.
 */