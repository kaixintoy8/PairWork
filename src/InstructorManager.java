import java.util.ArrayList;
import java.util.List;

public class InstructorManager {


    List<Instructor> instructors;
    public InstructorManager() {
       this.instructors = new ArrayList<>();
       instructors.add(new Instructor(1,"isim","soyisim", "email","department"));
    }

    public List<Instructor> getAll() {
        return instructors;
    }

    public void add(Instructor instructor) {
        instructors.add(instructor);

    }
    public void delete(Instructor instructor) {
        instructors.remove(instructor); }

    public Instructor getById(int id) {
        for (Instructor instructor : instructors) {
            if (instructor.getId() == id) {
                return instructor;
            }
        }
        return null;
    }
    public void update(Instructor instructor) {
        var instructorFromList = getById(instructor.getId());
        if (instructorFromList == null) return;
        instructorFromList.setFirstName(instructor.getFirstName());
        instructorFromList.setLastName(instructor.getLastName());
        instructorFromList.setEmail(instructor.getEmail());
        instructorFromList.setDepartman(instructor.getDepartman());
    }

}
