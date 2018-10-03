package Module08;

/**
 *
 * @author Nicolai Gram
 */
public class Testing {

    public static void main(String[] args) {
        Student s = new Student("Nicolai");
        Student s1 = new SoftwareStudent("Nicolai");
        
        s.printName();
        s1.printName();
    }
}

class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Student " + name);
    }
}

class SoftwareStudent extends Student {

    public SoftwareStudent(String name) {
        super(name);
    }

    @Override
    public void printName() {
        System.out.println("Software Student " + name);
    }
    
    public void printArea() {
        System.out.println("Software");
    }
}
