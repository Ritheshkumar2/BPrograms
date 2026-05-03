package base;

class Student {
    int id;
    String name;

    // Normal constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
    }
    
    public static void main(String[] args) {
        Student s1 = new Student(1, "Rithesh");
        Student s2 = new Student(s1); // Copy constructor
        s2.name="valll";

        System.out.println(s2.id + " " + s2.name);
    }
}
