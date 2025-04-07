public class Student {
    private String name;
    private GPA gpa;

    public Student(String name, GPA gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public GPA getGPA() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean honorRoll(GPA gpa2) {
        if(gpa.compareTo(gpa2) == -1)
            return false;
        else
            return true;
    }

    public String toString() {
        return name + gpa.getValue();
    }
}