package Classwork_9;

public class Student extends Person {

    private String university; //class fields
    private String response = "Ehhh, what was the question?";

    public Student(String name, String university){ // constructor
        super(name); // call parent (super) class constructor
        this.university = university; // extend with new properties
        super.int1 = 77;
    }
    public String getResponse(String question){ // method
        return response;

    }
}
