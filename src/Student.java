public class Student {

    private String firstname;
    private String lastname;
    private String id;
    private double grade;

    public Student(String firstname, String lastname, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        grade = 0;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if (firstname == null || firstname.isEmpty()) {
            System.out.println("Invalid firstname!");
            return;
        }
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        if (lastname == null || lastname.isEmpty()) {
            System.out.println("Invalid lastname!");
            return;
        }
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || !id.matches("\\d{7}")) {
            System.out.println("Invalid id! It must contain exactly 7 digits.");
            return;
        }
        this.id = id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade < 0 || grade > 20) {
            System.out.println("Invalid grade! It must be between 0 and 20.");
            return;
        }
        this.grade = grade;
    }

    public void printStudentInfo() {
        System.out.println(firstname + " " + lastname
                + "\nID: " + id + "\nGRADE: " + grade);
    }
}