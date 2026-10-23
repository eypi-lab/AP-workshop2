public class Main {

    public static void main(String[] args) {

        Student std1 = new Student("Ryan", "Gosling", "8987654");
        Student std2 = new Student("Osama", "Bin laden", "1234567");

        std1.setGrade(18);
        std2.setGrade(17.5);

        std1.printStudentInfo();
        std2.printStudentInfo();

        Lab lab = new Lab("Dr. Smith", "Sunday", 2);
        lab.enrollStudent(std1);
        lab.enrollStudent(std2);
        System.out.println("Lab size: " + lab.getCurrentSize());
        System.out.println("Average grade: " + lab.getAvgGrade());

    }
}