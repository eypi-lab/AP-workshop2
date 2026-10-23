public class Lab {

    private Student[] students;
    private String teacherName;
    private String dayOfWeek;
    private int maxSize;
    private int currentSize;
    private double avgGrade;

    public Lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        students = new Student[maxSize];
    }

    public void calAvg() {
        if (currentSize == 0) {
            avgGrade = 0;
            return;
        }
        double sum = 0;
        for (int i = 0; i < currentSize; i++) {
            sum += students[i].getGrade();
        }
        avgGrade = sum / currentSize;
    }

    public void enrollStudent(Student student) {
        if (student == null) {
            System.out.println("Invalid student!");
            return;
        }
        if (currentSize >= maxSize) {
            System.out.println("Lab is full! Cannot enroll " + student.getFirstname());
            return;
        }
        students[currentSize] = student;
        currentSize++;
        calAvg();
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public Student[] getStudents() {
        return students;
    }

}