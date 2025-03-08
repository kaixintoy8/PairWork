public class Student extends user {

    private String course;

    public Student(int id, String firstName, String lastName, String email, String course) {
        super(id, firstName, lastName, email);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Instructor{id=" + getId() + ", name='" + getFirstName() +getLastName()+ "', department='" + course + "'}";
    }
}
